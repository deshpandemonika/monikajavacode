package AssignmentPackage;


public class Assignment2 {

	int a,b,c,d,e;

	public Assignment2()
	{
		this(10,20,30);
		System.out.println("Default construction");
	}
	public Assignment2(int x1)
	{
		this();
		System.out.println("One parameter construction");
	}
	public Assignment2(int x1, int x2)
	{
		this(10);
		System.out.println("Two parameter construction");
	}
	public Assignment2(int x1,int x2, int x3)
	{
		
		System.out.println("Three parameter construction");
	}
	
	 public static void main(String[] args) {
		
		 Assignment2 obj1 = new Assignment2(10,20);
		 
		 

	}
	
}
