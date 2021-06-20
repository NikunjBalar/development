package com.java.Collection.List.ArrayList;

import java.util.ArrayList;

public class CustomArrayList {
	public static void main(String[] args) {
		ArrayList<Object> carromBoard = new ArrayList<Object>();
		Pawns p1 = new Pawns("white", 10);
		Pawns p2 = new Pawns("white", 10);
		Pawns p3 = new Pawns("black", 10);
		Pawns p4 = new Pawns("black", 10);
		Pawns p5 = new Pawns("pink", 10);
		Striker s = new Striker("white", 20, 30);

		carromBoard.add(p1);
		carromBoard.add(p2);
		carromBoard.add(p3);
		carromBoard.add(p4);
		carromBoard.add(p5);
		carromBoard.add(s);

		for (Object obj : carromBoard) {
			if (obj instanceof Pawns) {
				Pawns p = (Pawns) obj;
				/*if (p.color.equals("pink")) {
					System.out.println(p);
				}*/
				 System.out.println(p);
			} else {
				Striker striker = (Striker) obj;
				 System.out.println(striker);
			}
		}
	}
}

class Pawns {
	String color;
	int size;

	Pawns(String color, int size) {
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Pawns [color=" + color + ", size=" + size + "]";
	}
}

class Striker {
	String color;
	int size;
	double wight;

	Striker(String color, int size, double wight) {
		this.color = color;
		this.size = size;
		this.wight = wight;
	}

	@Override
	public String toString() {
		return "Striker [color=" + color + ", size=" + size + ", wight=" + wight + "]";
	}
}