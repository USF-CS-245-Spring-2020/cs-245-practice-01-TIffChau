class Practice01MathRecursive implements Practice01Math{
	public int fib(int i){
		if (i < 0)
			throw new IllegalArgumentException("Please enter a possitive number.");
		if (i == 0 || i == 1)
			return i;
		return fib(i-1)+fib(i-2);
	}
	public int fact(int i){
		if (i<0)
			throw new IllegalArgumentException("Please enter a possitive number");
		if (i==0)
			return 1;
		return fact(i-1)*i;
	}
}