package Inheritance;

 class Simpleeg_inheri {
	int marks=55;

}
class inheritance_eg extends Simpleeg_inheri{
	int addition_marks=8;
	public static void main(String[] args) {
	inheritance_eg obj=new inheritance_eg();
	System.out.println("TOtal MArks:"+(obj.marks+obj.addition_marks));
			
		
	}
	
} 
