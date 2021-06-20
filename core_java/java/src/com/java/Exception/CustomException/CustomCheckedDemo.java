package com.java.Exception.CustomException;

public class CustomCheckedDemo {
	public static void main(String[] args) {
		RailWayStation rs=new RailWayStation();
			try {
				rs.trainArrival();
			} catch (TrackExp e) {
				System.out.println(e);
			}
	}
}

class TrackExp extends Exception{
	public String toString() {
		return "track not found";
	}
}
class RailWayStation{
	boolean isTrackExist=false;
	void trainArrival() throws TrackExp{
		if(isTrackExist) {
			System.out.println("Train can depart");
		}
		else {
			TrackExp te=new TrackExp();
			throw te;
		}
	}
}
