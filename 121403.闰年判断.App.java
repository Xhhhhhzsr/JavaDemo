package Demo03;

import java.util.Scanner;

/*
用户输入一个int型数字的年
份year（-3200<year<3200,year!=0），输出是否为闰年。负数为公元前年份，-1表示公元前1年。
(因为回归年的计算方法较为复杂且有误差，涉及到级数，8万年后的闰年尚未统一。所以这里只
计算-3200<year<3200,year!=0即可)
*/
public class AppTest {
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
						System.out.println(year + "年，是平年，不是闰年");
					}
				} else if (year < 0 && year > -3200) { 
					int zyear=Math.abs(year);
					if (zyear % 4 == 1 || zyear % 400==1) {
						System.out.println(year + "年，是闰年");
					} else {
						System.out.println(year + "年，是平年，不是闰年");
					}
				}
		 

			}

		} catch (Exception e) {

			System.out.println("请输入正确年份：");

			e.getStackTrace();

		}

	}
}
