package com.joker.register.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="address")

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RegisterEntityAddress {

	@Id
	@GenericGenerator(name="kunj",strategy="increment")
	@GeneratedValue(generator="kunj")
	@Column(name = "A_id")
	private int id;

	@Column(name="A_street")
	private String street;
	@Column(name="A_city")
	private String city;
	@Column(name="A_pincode")
	private int pincode;

	public RegisterEntityAddress() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
}
