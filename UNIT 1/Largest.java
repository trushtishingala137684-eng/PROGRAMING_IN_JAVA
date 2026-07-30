class Largest
{
	public static void main(String args[])
	{
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		int no3 = Integer.parseInt(args[2]);

	if(no1>no2&&no1>no3)
	{
		System.out.println("no1 is greater: ");
	}
	else if(no2>no1&&no2>no3)
	{
		System.out.println("no2 is greater");
	}
	else
	{
		System.out.println("no3 is greater");
	}
	}
}

