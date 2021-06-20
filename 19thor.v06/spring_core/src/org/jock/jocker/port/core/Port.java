package org.jock.jocker.port.core;

public class Port {

	public Port() {
		System.out.println("creating default counstructor \t"+this.getClass().getSimpleName());
	}
	
	public void importGoods() {
		System.out.println("import goods from the other port");
	}
}
