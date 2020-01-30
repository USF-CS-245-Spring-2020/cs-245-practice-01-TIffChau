public class Practice01MathIterative implements Practice01Math
{
	public int fact(int n)throws Exception
	{
		if (n<0)
		{
			throw new Exception();
		}
		int x=1;
		for (int i=1; i<=n; i++)
		{
			x=x*i;
		}
		return x;
	}	

	public int fib (int n) throws Exception
	{
		if (n<0)
		{
			throw new Exception();
		}
		if (n<=1)
		{
			return n;
		}
		int x=1;
		int y=1;
		for (int i=2; i<n; i++){
			int temp = x;
			x+=y;
			y=temp;
		}
		return x;
	}
}