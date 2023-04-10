package Polymorphism;

public class Chagning_ReturnType {
	static int sum(int a,int b) {
		return a+b;
		
	}
	static double sum (int a,int b) {
		return a+b;
	}
public static void main(String[] args) {
	System.out.println(Chagning_ReturnType.sum(5,6));
}
}


