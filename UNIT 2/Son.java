class Father
{
	void house()
	{
	 	System.out.println("father house");
	}
}
class Son extends Father
{
	void bike()
	{
		System.out.println("it's my bike");
	}
	public static void main(String args[])
	{
		Son ob=new Son();
		ob.bike();
		ob.house();
	}	
}