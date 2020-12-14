package Demo;

/*奇数求和，求下列算式的值:
	 1+3+5+7+....+2147483647=?*/

public class App {
	public static void main(String[] args) {
		int i;
		int sum=0;
		 for ( i = 1; i <= 2147483647; i+=2) {
			 sum=sum+i;
		}
		 System.out.println("sum的奇数求和为："+sum);
	}

}
