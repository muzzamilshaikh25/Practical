package Polymorphism;

public class Test {
	void show() {
		System.out.println("Show result!!!");
	}

}
class without_Overriding extends Test{
	public static void main(String[] args) {
		without_Overriding obj-new without_Overriding();
		obj.show();
		
	}
}