package com.java.map.HaseMap;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomHashMap {
	public static void main(String[] args) {
		Taluk motavarachha= new Taluk("motavarachha");
		Taluk varachha= new Taluk("varachha");
		Taluk lathi= new Taluk("lathi");
		Taluk katargame= new Taluk("katargame");
		Taluk gariyadhar= new Taluk("Gariyadhar");
		Taluk talaja= new Taluk("talaja");
		
		
		ArrayList<Taluk> amreli=new ArrayList<Taluk> ();
		amreli.add(lathi);
		ArrayList<Taluk> surat=new ArrayList<Taluk> ();
		surat.add(motavarachha);
		surat.add(varachha);
		surat.add(katargame);
		ArrayList<Taluk> bhavnager=new ArrayList<Taluk> ();
		bhavnager.add(gariyadhar);
		bhavnager.add(talaja);

		HashMap<String, ArrayList<Taluk>> mapOfDT=new HashMap<String, ArrayList<Taluk>>();
		mapOfDT.put(key, value);
			
		}
}

class Taluk {
	String name;

	Taluk(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Taluk [name=" + name + "]";
	}
}