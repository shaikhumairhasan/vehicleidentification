package com.project.vehicleidentification.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Owner {
	
	@Id
	@Column(name = "vehicle_number")
	private String vehicleNumber;
	
	@Column(name = "owner_name")
	private String ownerName;
	
	@Column(name = "owner_address")
	private String ownerAddress;
	
	@Column(name = "owner_city")
	private String ownerCity;
	
	@Column(name = "owner_state")
	private String ownerState;
	
	@Column(name = "owner_age")
	private int ownerAge;
	
	@Column(name = "vehicle_brand")
	private String vehicleBrand;
	
	@Column(name = "vehicle_model")
	private String vehicleModel;
	
	@Column(name = "vehicle_type")
	private String vehicleType;
	
	@Column(name = "vehicle_fuel_type")
	private String vehicleFuelType;
	
	@Column(name = "vehicle_purchase_year")
	private String vehiclePurchaseYear;
	
	public Owner() {
	}

	public Owner(String vehicleNumber, String ownerName, String ownerAddress, String ownerCity, String ownerState,
			int ownerAge, String vehicleBrand, String vehicleModel, String vehicleType, String vehicleFuelType,
			String vehiclePurchaseYear) {
		this.vehicleNumber = vehicleNumber;
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.ownerCity = ownerCity;
		this.ownerState = ownerState;
		this.ownerAge = ownerAge;
		this.vehicleBrand = vehicleBrand;
		this.vehicleModel = vehicleModel;
		this.vehicleType = vehicleType;
		this.vehicleFuelType = vehicleFuelType;
		this.vehiclePurchaseYear = vehiclePurchaseYear;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerCity() {
		return ownerCity;
	}

	public void setOwnerCity(String ownerCity) {
		this.ownerCity = ownerCity;
	}

	public String getOwnerState() {
		return ownerState;
	}

	public void setOwnerState(String ownerState) {
		this.ownerState = ownerState;
	}

	public int getOwnerAge() {
		return ownerAge;
	}

	public void setOwnerAge(int ownerAge) {
		this.ownerAge = ownerAge;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleFuelType() {
		return vehicleFuelType;
	}

	public void setVehicleFuelType(String vehicleFuelType) {
		this.vehicleFuelType = vehicleFuelType;
	}

	public String getVehiclePurchaseYear() {
		return vehiclePurchaseYear;
	}

	public void setVehiclePurchaseYear(String vehiclePurchaseYear) {
		this.vehiclePurchaseYear = vehiclePurchaseYear;
	}

	@Override
	public String toString() {
		return "Owner [vehicleNumber=" + vehicleNumber + ", ownerName=" + ownerName + ", ownerAddress=" + ownerAddress
				+ ", ownerCity=" + ownerCity + ", ownerState=" + ownerState + ", ownerAge=" + ownerAge
				+ ", vehicleBrand=" + vehicleBrand + ", vehicleModel=" + vehicleModel + ", vehicleType=" + vehicleType
				+ ", vehicleFuelType=" + vehicleFuelType + ", vehiclePurchaseYear=" + vehiclePurchaseYear + "]";
	}
	
}
