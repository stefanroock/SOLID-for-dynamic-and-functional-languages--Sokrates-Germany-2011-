public class Rectangle {
	
	private int x, y, horizontalLength, verticalLength;
	
	public Rectangle(int x, int y, int horizontalLength, int verticalLength) {
		this.x = x;
		this.y = y;
		this.horizontalLength = horizontalLength;
		this.verticalLength = verticalLength;
	}
	
	public int getHorizontalLength() {
		return this.horizontalLength;
	}
	
	public int getVerticalLength() {
		return this.verticalLength;
	}
	
	public int computeArea() {
		return horizontalLength * verticalLength;
	}
	
	public int computePerimenter() {
		return horizontalLength * 2 + verticalLength * 2;
	}
	
	public void setSideLengths(int horizontalLength, int verticalLength) {
		this.horizontalLength = horizontalLength;
		this.verticalLength = verticalLength;
	}
	
}
