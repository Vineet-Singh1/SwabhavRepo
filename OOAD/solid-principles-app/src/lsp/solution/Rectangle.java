package lsp.solution;

public class Rectangle implements IPolygon {
	private int height;
	private int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int calculateArea() {

		return this.width * this.height;
	}

}
