package Polymorphism;
class Father{
	void shoot() {
		System.out.println("I am Father!!");
	}
}

class Child extends Father{
	void shoot() {
		System.out.println("I am sonn!!!");
	}
}
public class Method_Overiid {
	public static void main(String[] args) {
		Father f=new Father();
		f.shoot();
		Father fc=new Child();
		fc.shoot();
		
	}

}
