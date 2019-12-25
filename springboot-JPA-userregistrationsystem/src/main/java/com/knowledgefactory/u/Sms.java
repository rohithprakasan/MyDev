package com.knowledgefactory.u;

import org.springframework.stereotype.Component;


@Component
public class Sms {

	
	public void sendSms(String mobile,String message)
	{
		System.out.println("Send sms");
	}
	
}
