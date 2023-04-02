package Com;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public static double getArea(double side) {
        return side * side;
    }

    public static double getPerimeter(double side) {
        return 4 * side;
    }
    public static void main(String[] args) {
    	Square square1 = new Square(5.0);

    	double area1 = square1.getArea();
    	double perimeter1 = square1.getPerimeter();
    	System.out.println("Square 1 area: " + area1 + ", perimeter: " + perimeter1);
	}
}