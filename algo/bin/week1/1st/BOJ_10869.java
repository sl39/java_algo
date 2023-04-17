class BOJ_10896{
	int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
	BOJ_10896 sum = new BOJ_10896();
	int c = sum.fact(5);
	System.out.println(c);
	
	
	}
}
		
