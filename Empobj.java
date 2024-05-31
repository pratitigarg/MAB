package boi;

public class Empobj {
	int empid;
	String name;
	float balance;
	public void display()
	{
		System.out.println("\nempname:" + name+ "\nempid:" +empid+ "\navailbalebalance:" +balance);
	}

	public static void main(String[] args) {
		Empobj emp1= new Empobj();
		emp1.name="pratiti";
		emp1.empid=101;
		emp1.balance=10000;
		emp1.display();

	
		Empobj emp2= new Empobj();
		emp2.name="rahul";
		emp2.empid=100;
		emp2.balance=100000;
		emp2.display();
	}
	
	
}
