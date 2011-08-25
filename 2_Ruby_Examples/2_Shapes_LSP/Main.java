public class Main {
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(0,0,10,20);
		Square sqr = new Square(0,0,10);
		scale(rect,2,3);
		scale(sqr,2,3);
	}
	
	private void scale(Rectangle rect, int horizontalScaleFactor, int verticalScaleFactor) {
		rect.setSideLength(rect.getHorizontalLength() * horizontalFactor, rect.getVerticalLength() * verticalFactor);
	}
	
}