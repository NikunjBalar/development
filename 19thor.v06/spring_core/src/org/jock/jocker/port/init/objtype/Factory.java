package org.jock.jocker.port.init.objtype;

public class Factory {
	private String name;//simple type 
	private String type;//simple type
	private Machine machine;//obj type
	public Factory(String name) {
		System.out.println("craeted \t"+this.getClass().getSimpleName());
		System.out.println(""+name);
		this.name=name;
	}
	public void setMachine(Machine machine) {   //setter method of object
		System.out.println("invoked setMachine()" +machine);
		this.machine = machine;
	}
	public void setType(String type) {
		System.out.println("invoked setType() \t "+type);
		this.type = type;
	}
	@Override
	public String toString() {
		return "Factory [name=" + name + ", type=" + type + "]";
	}
	public void polishing() {
		System.out.println("invoked polishing");
		System.out.println("will do polishing");
		if(machine!=null) {
			System.out.println("machine is there, can do polishing"+this.machine.getPurpose());
			machine.polishingInMachine();
		}
	}	
}