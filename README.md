# 📧 Spring Boot Mail Service

This project is a Spring Boot-based mail service that allows sending emails, with or without attachments, through a REST API.

## 📋 Requirements

- Java 8 or later
- Maven
- Spring Boot
- A Gmail account for SMTP

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-repo/spring-boot-mail-service.git
cd spring-boot-mail-service
```

### 2. Configure SMTP settings

Update the `application.yml` file with your Gmail SMTP credentials:

```yaml
spring:
  mail:
    host: smtp.gmail.com
    port: 587
    username: <YOUR EMAIL HERE>
    password: <YOUR PASSWORD HERE>
    properties:
      mail:
        smtp:
          auth: true
          starttls:
            enable: true
```

### 3. Build the project

```bash
mvn clean install
```

### 4. Run the application

```bash
mvn spring-boot:run
```

## 📬 API Endpoints

### Send Simple Email

- **URL:** `/api/v1/mailer/sendMail`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "recipient": "recipient@example.com",
    "subject": "Subject of the email",
    "messageBody": "Body of the email"
  }
  ```
- **Response:** Success message or error details

### Send Email with Attachment

- **URL:** `/api/v1/mailer/sendMailWithAttachment`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "recipient": "recipient@example.com",
    "subject": "Subject of the email",
    "messageBody": "Body of the email",
    "attachment": "path/to/attachment"
  }
  ```
- **Response:** Success message or error details

## 🛠️ Code Overview

### EmailController

```java
package com.thaprobane.mailapi.controller;

import com.thaprobane.mailapi.model.EmailModel;
import com.thaprobane.mailapi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/mailer")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailModel details) {
        return emailService.sendSimpleMail(details);
    }

    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailModel details) {
        return emailService.sendMailWithAttachment(details);
    }
}
```

## 🌟 Features

- **Send Simple Emails:** Easily send text-based emails.
- **Send Emails with Attachments:** Attach files to your emails.
- **Spring Boot Integration:** Seamless integration with Spring Boot framework.

## 📚 Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [JavaMail API](https://javaee.github.io/javamail/)

## 📝 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgements

- Spring Boot team for their excellent framework.
- JavaMail API for the robust email handling.

## 📧 Contact

If you have any questions or suggestions, feel free to reach out!

Happy mailing! 🎉
