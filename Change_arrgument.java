package Polymorphism;

public class Change_arrgument {
void add(int a,double b) {
	System.out.println(a+b);
}
void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	Change_arrgument obj=new Change_arrgument(); 
		obj.add(2, 3);
		obj.add(10, 20,20);
}
}
