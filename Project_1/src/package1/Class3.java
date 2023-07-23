package package1;

public class Class3 {
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result is " + c);
		return c;
	}
	public int sub(int a1,int a2)
	{
		int a3;
		a3=a1-a2;
		System.out.println("result is " + a3);
		return a3;
	}
	public void multi(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("Final Result is " + z);
	}
	public static void main(String[] args) 
	{
		Class3 obj=new Class3();
		int sumresult = obj.sum(12, 13);
		int subresult = obj.sub(50, 24);
		obj.multi(sumresult, subresult);		
	}
}
