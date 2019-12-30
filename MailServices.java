package com.knowledgefactory.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class MailServices {
	
	
	@Autowired
    private JavaMailSender javaMailSender;

	public void sendMail(String mailid) {
		
			System.out.println("sending mail...");
		 	SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo(mailid);

	        msg.setSubject("Testing from Spring Boot");
	        msg.setText("Hello World \n Spring Boot Email");

	        javaMailSender.send(msg);
	        
	        System.out.println("MAIL SENT!!!");
	}
}
