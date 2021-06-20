package com.nik.nikapp.InterfaceDemo;

public class LEDLightIMPL implements ISwitch{

	@Override
	public void sOn() {
		System.out.println("LEDLight turn on");
	}

	@Override
	public void sOff() {
		System.err.println("LEDLight turn off");
	}

}
