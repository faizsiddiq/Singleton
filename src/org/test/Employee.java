package org.test;

public class Employee {
	
	static Employee emp;
	private Employee() {
		
	}
	
	public static  Employee add() {
		if (emp==null) {
			
			emp=new Employee();
			
		}
		
		return emp;
		}
	public void empID() {
		
		System.out.println("Emp ID is 555");

	}
	public static void main(String[] args) {
		
		Employee e = add();
		
		System.out.println(System.identityHashCode(e));
		
	
		
	}

}
