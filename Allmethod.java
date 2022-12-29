interface Imp
{
	public void m2();
	default void m3()
	{
		System.out.println(" it implementing the default value");
	}
	static void m4()
	{
		System.out.println(" it is implementing static value");
	}

}
class Allmethod 
{
	public static void main(String args[])
	{
		Imp i = () -> System.out.println(" it printing the abstract value");
		i.m2();
		i.m3();
		Imp.m4();
	}
}
