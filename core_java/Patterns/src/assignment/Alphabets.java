package assignment;

import java.util.Scanner;

//complet;
public class Alphabets {
	public static void main(String[] args) {
		System.out.println("main methos started");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of raw");
		int raw = s.nextInt();
		int column = raw;

		a(raw, column);
		b(raw, column);
		c(raw, column);
		d(raw, column);
		e(raw, column);
		f(raw, column);
		g1(raw, column);
		g2(raw, column);
		h(raw, column);
		i(raw, column);
		j(raw, column);
		k(raw, column);
		l(raw, column);
		m(raw, column);
		n(raw, column);
		o(raw, column);
		p(raw, column);
		q(raw, column);
		r(raw, column);
		s(raw, column);
		t(raw, column);
		u(raw, column);
		v(raw, column);
		w(raw, column);
		x(raw, column);
		y(raw, column);
		z(raw, column);

		System.out.println("main method ended..");
	}

	static void a(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((j == 0 && i > raw / 2) || (j == column - 1 && i > raw / 2) || (i + j == raw / 2)
						|| j == i + raw / 2 || i == raw / 2 + 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void b(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || (j == (column - 1) && i != (raw / 2)) || (i == (raw / 2) && j != (column - 1))
						|| i == (raw - 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void c(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || i == (raw - 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void d(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 1 || (i == 0 && j != column - 1) || (i == raw - 1 && j != column - 1)
						|| (j == (column - 1) && i != j && i + j != column - 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void e(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || i == (raw - 1) || (i == (raw / 2) && j <= column / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void f(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || (i == (raw / 2) && j <= column / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void g1(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || i == (raw - 1) || (j == (column - 1) && i >= raw / 2)
						|| ((i == raw / 2) && j >= column / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void g2(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || (i == raw - 1 && j <= column / 2) || (j == column / 2 && i >= raw / 2)
						|| (i == raw / 2 && j >= column / 2) || (j == i && i >= raw / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}

	static void h(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || j == column - 1 || i == (raw / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void i(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == (column / 2) || i == (raw - 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void j(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == (column / 2) || (i == (raw - 1) && j <= column / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void k(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || (i == raw / 2 && i >= j) || ((i == j || i + j == raw - 1) && j >= column / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void l(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || i == (raw - 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void m(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || j == (column - 1) || ((i == j || i + j == raw - 1) && i <= (column / 2))) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void n(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || j == column - 1 || i == j) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void o(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (((i == 0 || j == 0 || i == (raw - 1) || j == (column - 1)) && i != j) && i + j != column - 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void p(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || (i == 0 && j != column - 1) || (i == (raw / 2) && j != column - 1)
						|| ((j == (column - 1) && i < raw / 2) && i != 0)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void q(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((i == 0 && j != column - 1) || (j == 0 && i != raw - 1) || (i == (raw - 2) && j != column - 1)
						|| (j == (column - 2) && i != raw - 1) || (i == j && i >= raw / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void r(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((i == 0 && j != column - 1) || j == 0 || ((j == (column - 1) && i < raw / 2) && i != 0)
						|| (i == raw / 2 && j != column - 1) || (i == j && j >= column / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void s(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((i == 0 && i != j) || ((i == raw / 2 && j != 0) && j != column - 1) || (i == (raw - 1) && i != j)
						|| ((j == 0 && i < raw / 2) && i != 0) || ((j == column - 1 && i > raw / 2) && i != raw - 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void t(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == column / 2) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void u(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((j == 0 && i + j != column - 1) || ((i == raw - 1 && i != j) && i + j != column - 1)
						|| (j == column - 1 && i != j)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void v(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (((j == 0 || j == column - 1) && i <= raw / 2) || i == j + raw / 2 || i + j == raw - 1 + raw / 2) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void w(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || j == column - 1 || (i == j && i >= raw / 2) || (i + j == raw - 1 && i >= raw / 2)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void x(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j || i + j == raw - 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void y(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((i == j && i <= raw / 2) || (j == column / 2 && i >= raw / 2)
						|| (i + j == raw - 1) && j >= column / 2) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void z(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || i + j == raw - 1 || i == (raw - 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}