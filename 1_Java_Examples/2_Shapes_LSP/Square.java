public class Square extends Rectangle {
	
	public Square(int x, int y, int sideLength) {
		super(x, y, sideLength, sideLength);
	}
	

	@Override public void setSideLengths(int horizontalLength, int verticalLength) {
		if (horizontalLength != verticalLength) throw new IllegalArgumentException("For squares, both sides have to have equal lengths.");
		super.setSideLengths(horizontalLength, verticalLength);
	}
	
}