package °úÁ¦10;

class Shape {
	int width;
	int height;
	public void setShape(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class Rectangle extends Shape {
	public double area() {
		return width * height;
	}
}

class Triangle extends Shape {

	public double area() {
		return width * height / 2;
	}
}

class Circle extends Shape {

	public double area() {
		return width * width * Math.PI;
	}
}
