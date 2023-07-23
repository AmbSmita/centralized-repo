package package1;

public class Assignment3 
{
	int num1, num2;
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sub(int a1,int a2)
	{
		return a1-a2;
	}
	public int multi(int x, int y)
	{
		return x*y;
	}
	public int div(int d1, int d2)
	{
		return d1/d2;
	}
	public static void main(String[] args) 
	{
	Assignment2 obj=new Assignment2();
	obj.num1 = 10;
	obj.num2 =2;
	
	int div1= obj.div(obj.num1, obj.num2);
	int sub1=obj.sub(div1, obj.num2);
	int add1=obj.sum(sub1, obj.num2);
	int sub2=obj.sub(add1,obj.num2);
	int multi1=obj.multi(sub2, obj.num2);
	
	System.out.println("Result of (((((10/2)-2)+2)-2)*2) is " +multi1);
	}
	
}
