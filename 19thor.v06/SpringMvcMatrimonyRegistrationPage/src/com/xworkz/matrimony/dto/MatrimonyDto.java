package com.xworkz.matrimony.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "spring_info")
public class MatrimonyDto {
@Id
@GenericGenerator(name = "incr",strategy = "increment")
@GeneratedValue(generator = "incr")
@Column(name = "S_ID")
	private int id;
@Column(name = "S_NAME")
	private String name;
@Column(name = "S_DOB")
	private String DOB;
@Column(name = "S_GENDER")
	private String gender;
@Column(name = "S_STATUS")
	private String status;
@Column(name = "S_OCCUPATION")
	private String occupation;
@Column(name = "S_LOOKINGFOR")
	private String lookingFor;
	
	public MatrimonyDto() {
		System.out.println("created\t"+this.getClass().getModifiers());
	}
	
	UUID uuid=UUID.randomUUID();
	
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public UUID getUuid() {
		return uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setLookingFor(String lookingFor) {
		this.lookingFor = lookingFor;
	}
	public String getLookingFor() {
		return lookingFor;
	}

	@Override
	public String toString() {
		return "MatrimonyDto [name=" + name + ", DOB=" + DOB + ", gender=" + gender + ", status=" + status
				+ ", occupation=" + occupation + ", lookingFor=" + lookingFor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lookingFor == null) ? 0 : lookingFor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	
	
}
