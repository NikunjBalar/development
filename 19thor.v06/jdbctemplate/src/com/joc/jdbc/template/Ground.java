package com.joc.jdbc.template;

/*@Entity
@Table(name="ground_details")*/
public class Ground {
	
	/*@Id
	@Column(name="G_id")*/
	private int id;
	//@Column(name="G_name")
	private String name;
	//@Column(name="G_noofgate")
	private int noOfGate;
	public Ground() {
		System.out.println(this.getClass().getSimpleName()+" banavu");
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfGate() {
		return noOfGate;
	}
	public void setNoOfGate(int noOfGate) {
		this.noOfGate = noOfGate;
	}
	
	
}
