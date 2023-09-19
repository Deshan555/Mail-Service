package com.thaprobane.mailapi.service;

import com.thaprobane.mailapi.model.EmailModel;

// Interface for the Email-Service
public interface EmailService {
    // Method
    // To send a simple email
    String sendSimpleMail(EmailModel details);
    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailModel details);
}
