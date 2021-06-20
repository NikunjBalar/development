package com.java.ObjectClass;

public class EqualsDemo {
	public static void main(String[] args) {
		Sunil sunil1 = new Sunil("Sunil Home", "light brown", 0.0, 25, "marrid");
		Sunil sunil2 = new Sunil("Sunil class", "ten brown", -0.0, 52, "unmarrid");
		System.out.println(sunil1);
		System.out.println(sunil2);
		System.out.println(sunil1.equals(sunil2));
	}
}

class Sunil {
	String name;
	String color;
	double price;
	int age;
	String status;

	Sunil(String name, String color, double price, int age, String status) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.age = age;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Sunil [name=" + name + ",\ncolor=" + color + ",\n price=" + price + ",\n age=" + age + ",\n status="
				+ status + "]";
	}

	public boolean equals(Object o) {
		if (o instanceof Sunil) {
			Sunil s = (Sunil) o;
			if (name.equals(s.name)) {
				if (color.equals(s.color)) {
					if (price == s.price) {
						if (age == s.age) {
							if (status.equals(s.status)) {
								return true;
							} else {
								return false;
							}
						} else {
							return false;
						}
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
			else {
				return false;
			}
		} else {
			return false;
		}
	}
}