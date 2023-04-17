package Abstraction;
import java.util.*;
class Calculator2{
	int addition(int... n) {
		int sum=0;
		for(int  i:n) {
			sum+=i;
		}
		return sum;
		}
	int substraction(int ...n) {
		int result=0;
		for(int i:n) {
			result-=i;
		}
		return result;
	}
	int multiplication(int ...n) {
		int result=1;
		for(int i:n) {
			result*=i;
		}
		return result;
	}
}
public class VarargsEg1 {
	public static void main(String[] args) {
		System.out.println("The addition of 4,5,6 is:"+Calculator.add(10,20,5));
		System.out.println("The substraction of 6,7,8,9 is:"+Calculator.subtract(10,2,6));
		System.out.println("The multiplication of 1,2,3,4 is:"+Calculator.multiply(2,3,4));
	}
	

}
