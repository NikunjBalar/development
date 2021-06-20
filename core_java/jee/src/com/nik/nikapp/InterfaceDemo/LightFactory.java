package com.nik.nikapp.InterfaceDemo;

public class LightFactory {
	// object creation logic
	public static ISwitch getLight(String type) {
		if(type.equalsIgnoreCase("TubLight")) {
			return new TubeLightIMPL();
		}
		else if(type.equalsIgnoreCase("LEDLight")) {
			return new LEDLightIMPL();
		}
		else {
			return null;
		}
	}
}
