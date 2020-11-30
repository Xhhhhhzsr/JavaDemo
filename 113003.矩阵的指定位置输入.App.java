package Demo03;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	int [][] arr=new int [10][10];
	System.out.println("请输入十行十列的，二维坐标的row和col，并且输入此位置的数字");
	Scanner scanner=new Scanner(System.in);
	//row -->i  ,col-->j
	int i=scanner.nextInt();
	int j=scanner.nextInt();
	int value=scanner.nextInt();

	arr[i][j]=value;
	
	for (int row = 0; row < arr.length; row++) {
		for (int col = 0; col < arr[0].length; col++) {
			System.out.print(arr[row][col]+" ");
		}
		System.out.println("");
	}
	
}
}
