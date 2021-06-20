package com.xworkz.mediport.Util;

import org.springframework.stereotype.Component;

@Component
public class RndomPasswordGenerate {
	public RndomPasswordGenerate() {
		System.out.println(this.getClass().getCanonicalName()+" is created...............");
	}
	
	String copLetters="ABCDEFGHIJKLMNOPQRSTUVXYZ";
	String lowLetters="abcdefghijklmnopqrstuvxyz";
	String specLetters="*^%#/-+";
	String numLetters="1234567890";
	
	public String generatePassword() {
		
		StringBuilder builder = new StringBuilder();
		/*builder.append(RandomStringUtils.random(2, copLetters)).append(RandomStringUtils.random(2, lowLetters))
				.append(RandomStringUtils.random(2, specLetters)).append(RandomStringUtils.random(2, specLetters));
	*/	return new String(builder);
	}
}
