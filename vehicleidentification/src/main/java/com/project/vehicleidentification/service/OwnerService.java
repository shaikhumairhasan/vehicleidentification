package com.project.vehicleidentification.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.vehicleidentification.dao.OwnerDAO;
import com.project.vehicleidentification.entity.Owner;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@Service
public class OwnerService {

	@Autowired
	private OwnerDAO ownerDAO;
	
	public List<Owner> getOwners() {
		return ownerDAO.findAll();
	}

	public Owner getOwner(String vehicleNumber) {
		return ownerDAO.findById(vehicleNumber).orElse(null);
	}

	public void addOwner(Owner owner) {
		ownerDAO.save(owner);
	}

	public void deleteOwner(String vehicleNumber) {
		ownerDAO.deleteById(vehicleNumber);
	}
	
	
	public Owner ocr(MultipartFile img){
		File convFile = new File(img.getOriginalFilename());
		String number = "";
	    try {
	    	FileOutputStream fos = new FileOutputStream(convFile);
			fos.write(img.getBytes());
			fos.close();
			
			ITesseract image = new Tesseract();
			String str = image.doOCR(convFile);
			
			Pattern p = Pattern.compile("[a-zA-Z]{2}[0-9]{2}[a-zA-Z]{1,2}[0-9]{4}");
			Matcher m = p.matcher(str);
			while(m.find()) {
	            number = m.group();
	        }
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TesseractException e) {
			e.printStackTrace();
		}
	    return ownerDAO.findById(number).orElse(null);
	}
}
