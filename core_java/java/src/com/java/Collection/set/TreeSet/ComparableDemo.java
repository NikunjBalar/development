package com.java.Collection.set.TreeSet;

import java.util.TreeSet;

public class ComparableDemo {
	public static void main(String[] args) {
		TreeSet<PoliceStation>  ts=new TreeSet<PoliceStation>();
		PoliceStation ps1=new PoliceStation(2,"Surat");
		PoliceStation ps2=new PoliceStation(3,"Amedabad");
		PoliceStation ps3=new PoliceStation(4,"Bengalore");
		PoliceStation ps4=new PoliceStation(5,"Gujrat");
		PoliceStation ps5=new PoliceStation(6,"Delhi");
		PoliceStation ps6=new PoliceStation(7,"Mumbai");
		PoliceStation ps7=new PoliceStation(1,"rajasthan");
		ts.add(ps7); 
		ts.add(ps6);
		ts.add(ps5);
		ts.add(ps4);
		ts.add(ps3);
		ts.add(ps2);
		ts.add(ps1);
		
		for(PoliceStation p : ts) {
			System.out.println(p);
		}

	}
}

class PoliceStation implements Comparable {
	
	int stationId;
	String location;
	
	PoliceStation (int stationId ,	String location){
		this.stationId=stationId;
		this.location=location;
	}

	@Override
	public String toString() {
		return "PoliceStation [stationId=" + stationId + ", location=" + location + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		PoliceStation ps=(PoliceStation)arg0;
		if (this.stationId<ps.stationId) {
			return +1;
		}
		else if (this.stationId>ps.stationId) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

