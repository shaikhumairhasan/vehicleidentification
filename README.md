# Vehicle identification
**Vehicle Identification** is a full stack web application that lets you search about the owner and vehicle details by either entering the vehicle registration number or by ***uploading an image of the vehicle's license plate.***

The distinct feature of this project is that it utilizes the power of **Artificial Intelligence (AI)** for reading the text from the images uploaded by user. It then searches for vehicle's registration number within that text and if found, it fetches the information associated with the registration number from the database.

This has been made possible due to **Tesseract**, which is an **Optical Character Recognition (OCR)** engine with open-source code.

The Vehicle Identification project also offers additional functionality by providing an **Admin login.**
The Admin, after signing-in, can perform operations like **Adding, Updating, Deleting and Listing all owner and vehicle details**.

## Technologies used:

**1. Front-end:** HTML, CSS, JavaSript, Bootstrap, Thymeleaf.

**2. Back-end:** Java, Spring Boot, Spring Security, Spring Data JPA.

**3. Tools used:** Spring Tool Suite, Maven, Spring Boot Devtools, MySQL Workbench.

**4. Tess4j** library used for performing Optical Character Recognition (OCR).

**5. Database:** MySQL 8.
