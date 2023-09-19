package com.thaprobane.mailapi.controller;

import com.thaprobane.mailapi.model.EmailModel;
import com.thaprobane.mailapi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/mailer")
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailModel details) {
        return emailService.sendSimpleMail(details);
    }
    // Sending email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailModel details) {
        return emailService.sendMailWithAttachment(details);
    }
}
