package °úÁ¦5;

class Box {
	public int width, length, height;

	public int getWidth(int a) {
		return width = a;
	}

	public int getLength(int b) {
		return length = b;
	}

	public int getHeight(int c) {
		return height = c;
	}

	public int getVolume() {
		return width * height * length;
	}

	public void print() {
		System.out.println(getVolume());
	}
}
