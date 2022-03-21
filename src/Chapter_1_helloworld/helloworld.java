package Chapter_1_helloworld;

public class helloworld {

	public static int sum(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10, j = 20;
		int s;
		String str = "Korea";
		
		final int PI = 3;
		
		s = sum(i, j);
		System.out.println("s값은 " + s + " 입니다");
		System.out.println("HelloWorld!!!");
		System.out.println(str);
		
		
	}

}
