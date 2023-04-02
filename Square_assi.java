package Com;

public class Square_assi {
	double side;

    public Square_assi(double side) {
        this.side = side;
    }
    public static double getArea(double side) {
        return side * side;
    }

    public static double getPerimeter(double side) {
        return 4 * side;
    }
    public static void main(String[] args) {
    	Square square1 = new Square(7.0);

    	double area1 = square1.getArea();
    	double peri1 = square1.getPerimeter();
    	System.out.println("Area: " + area1);
    	System.out.println("Perimeter: "+ peri1);
    }
    

}