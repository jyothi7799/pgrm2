interface Rem
{
	public void add(a,b);
	public void sub(x,y);
	 public void mul(u,v);
}

abstract class Assign implements Rem
{
	public void add(a,b)
	{
		System.out.println("ADDITION METHOD : " +(a+b));
		// return a+b ;
	}
	public void sub(a,b)
	{
		System.out.println("SUBTRACTION METHOD :" +(x-y));
		//return a-b ;
	}
	public void mul(a,b)
	{
		System.out.println("MULTIPLICATION METHOD :" +(u*v));
		// return a*b ;
	}
}

abstract class  Check
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Assign a = new Assign();
		System.out.println(a.add(5 , 5));
		System.out.println(a.sub(20,10));
		System.out.println(a.mul(2,5));
	}

}
