package Demo;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("请问输入年份：范围是-3200<year<3200");

		try {

			// 循环读取用户输入的值

			while (true) {

				// 循环读取用户输入的值

				int year = scanner.nextInt();

				// 范围（-3200<year<3200,year!=0）

				if (year > 0 && year < 3200) {
				
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

						System.out.println(year + "年，是闰年");

					} else {

						System.out.println(year + "年，是平年，不是闰年啊");

					}

				} else if (year < 0 && year > -3200) { 

					int zyear=Math.abs(year);

					if (zyear % 4 == 1 || zyear % 400==1) {

						System.out.println(year + "年，是闰年哦");

					} else {

						System.out.println(year + "年，是平年，不是闰年");
					}
				}else {
					System.out.println("不能输入0 或者超出范围内的数字");
				}

		 



			}



		} catch (Exception e) {



			System.out.println("请输入正确年份：");



			e.getStackTrace();



		}
	}

}
