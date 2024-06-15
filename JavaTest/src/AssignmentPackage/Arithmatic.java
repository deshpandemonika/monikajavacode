package AssignmentPackage;

import AssignmentPackage.Arithmatic;

public class Arithmatic {
	public int sum(int a, int b)
	{
		 int c;
		 c=a+b;
		 System.out.println(" Value of additon"+c);
		 return c;
	}
	public int substraction(int a, int b)
	{
		 int c;
		 c=a-b;
		 System.out.println(" Value of substraction"+c);
		 return c;
	}
	public int multiplication(int a, int b)
	{
		 int result;
		 result=a*b;
		 System.out.println(" Value of multiplication"+result);
		 return result;

	}
	public void Div(int a, int b)
	{
		 int divresult;
		 divresult=a/b;
		 System.out.println(" Value of Divison\n"+divresult);
		 
	}
	public static void main(String[] args) {
		Arithmatic op = new Arithmatic();
		//(((((10+2)+2)-2)*2)/2)
		int sumresult1= op.sum(10, 2);
		int sumresult2 = op.sum(sumresult1, 2);
		int subresult = op.substraction(sumresult2, 2);
		int mulresult = op.multiplication(subresult, 2);
		op.Div(mulresult, 2);
				
				
		//(((((10*2)-2)+2)-2)/2)
		Arithmatic op2 = new Arithmatic();
		int multiplresult= op2.multiplication(10, 2);
		int subtractresult = op2.substraction(multiplresult, 2);
		int additionresult = op2.sum(subtractresult, 2);
		int subtractresult2 = op2.substraction(additionresult, 2);
		op.Div(subtractresult2, 2);
		
	}
	
}
