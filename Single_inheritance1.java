package Inheritance;

public class Single_inheritance1 {
	public static void main(String[] args) {
		SIchild child=new SIchild();
		child.display();
		child.show()
	}

}
class SIParent{
	void show() {
		System.out.println("Show details of parent clas");
	}
}
class SIchild etends SIParent{
	void display() {
		System.out.println("Display the result:");
	}
}
