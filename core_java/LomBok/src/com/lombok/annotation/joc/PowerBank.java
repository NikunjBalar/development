package com.lombok.annotation.joc;

import lombok.AllArgsConstructor;
import lombok.CustomLog;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter
@AllArgsConstructor
@ToString

@EqualsAndHashCode

public class PowerBank {
	
	
	private String brandName;
	private float price;
	private int capacity;
	
}
