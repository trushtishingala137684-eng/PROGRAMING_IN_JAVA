class Exception
{
	public static void main(String args[])
	{
		String studentName="vivan";
		System.out.println(studentName+"started math calculation...");
		
		try
		{
			int totalMarks=100;
			int subject=0;
			int result = totalMarks / subjects;

			System.out.println("Result:"+ result);
		
		}
		catch (ArithmeticExecption e)
		{
			System.out.println("Exception caught: Division by zero is not allowed for"+ studentName+"!");
			System.out.println("System Error Detail:"+e.getMessage());
		}
	   System.out.println(studentName = " 's program continues execution smoothly!");
	}
}