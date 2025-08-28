package com.klef.fsad.spd.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.klef.fsad.spd.model.Email;
import com.klef.fsad.spd.repository.EmailRepository;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
    private EmailRepository emailRepository;
	
	private void sendEmail(String to, String subject, String body) {
		Email e= new Email();
	
		e.setRecipient(to);
		e.setSubject(subject);
		e.setMessage(body);
		e.setSentAt(LocalDateTime.now());
		
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(to);
			message.setSubject(body);
			
			mailSender.send(message);
			e.setStatus("SUCCESS");
			
			
		}
	catch(Exception ex) {
		e.setStatus("FAILURE");
		System.out.println(ex.getMessage());
	}
		emailRepository.save(e);
	}
    
}
