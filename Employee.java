package Method;

class Employee {
	  private String name1,name2,name3,name4,name5;

	  // constructor
	  Employee() {
	    System.out.println("Constructor Called:");
	    name1 = "Aakash";
	    name2 = "Rajesh";
	    name3 = "Ravi";
	    name4 = "David";
	    name5 = "Muzzz";
	  }

	  public static void main(String[] args) {

	    
		Employee obj = new Employee();
	    System.out.println("First Employee name is " + obj.name1);
	    System.out.println("Second Employee name is " + obj.name2);
	    System.out.println("Third Employee name is " + obj.name3);
	    System.out.println("Fourth Employee name is " + obj.name4);
	   
	  }
	}