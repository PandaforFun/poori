abstract class Shape {
	abRestract double area();
	abstract double perimeter();
}

class Rectangle extends Shape {
	double l, w;
	Rectangle(double l, double w) {
		this.l = l;
		this.w = w;
	}
	double area() {
		return l * w;
	}
	double perimeter() {
		return 2 * (l + w);
	}
}

class Circle extends Shape {
	double r;
	Circle(double r) {
		this.r = r;
	}
	double area() {
		return Math.PI * r * r;
	}
	double perimeter() {
		return 2 * Math.PI * r;
	}
}

class Triangle extends Shape {
	double a, b, c;
	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	double area() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	double perimeter() {
		return a + b + c;
	}
}

public class Main {
	public static void main(String[] args) {
		Shape r = new Rectangle(5, 3);
		Shape c = new Circle(4);
		Shape t = new Triangle(3, 4, 5);

		System.out.println("Rectangle area: " + r.area() + ", perimeter: " + r.perimeter());
		System.out.println("Circle area: " + c.area() + ", perimeter: " + c.perimeter());
		System.out.println("Triangle area: " + t.area() + ", perimeter: " + t.perimeter());
	}
}
