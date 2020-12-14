package Demo02;

import java.util.Scanner;
/*
用户每次输入一个int型数字的项数n，都可以输出斐波那契数列的第n项的值。本程序取值区间：(1<=n<=40)。*/ 

public class App {
public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
  System.out.println("斐波那契数列第n项；请随便输入本程序取值区间：(1<=n<=40)");
  int n,fn;//n为第n项，fn为第n项的值      

  n=scanner.nextInt();     
  fn=function(n);

  System.out.println("斐波那契数列第"+n+"项为："+fn);	
  }
public static int function(int n){     
	if(n==1 || n==2) return 1;       
	return function(n-1)+function(n-2);
	}
}


