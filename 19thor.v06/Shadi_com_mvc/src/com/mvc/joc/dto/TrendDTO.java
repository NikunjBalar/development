package com.mvc.joc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "trend_info")
public class TrendDTO implements Serializable {

	@Id
	@GenericGenerator(name = "xworkz", strategy = "increment")
	@GeneratedValue(generator = "xworkz")
	@Column(name = "t_id")
	int id;
	@Column(name = "t_name")
	String name;
	@Column(name = "t_dob")
	String DOB;
	@Column(name = "t_gender")
	String gender;
	@Column(name = "t_status")
	String status;
	@Column(name = "t_occupation")
	String occupation;
	@Column(name = "t_lookingfor")
	String lookingFor;

}
