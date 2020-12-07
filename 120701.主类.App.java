package Array;

public class App {
/*	
 * 120701.主类.App.java

 * 找到0 的位置与上下左右的数的位置输出坐标
矩阵：
array2d[ ][ ]={
{1,2,3,4,5,6},
{7,8,9,10,0,12},
{8,8,9,10,11,12},
{7,8,3,10,11,12},
{88,66,92,102,151,999}
};
输出坐标：
R_zero(4,1)、R_left（3,1）、R_right（5,1）、R_up(4,0)、R_down(4,2)
*/
	public static void main(String[] args) {
		 int 	array2d[ ][ ]={
					{1,2,3,4,5,6},
					{7,8,9,10,0,12},
					{8,8,9,10,11,12},
					{7,8,3,10,11,12},
					{88,66,92,102,151,999}
					};
		 for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[0].length; j++) {
				System.out.print(array2d[i][j]+" ");
			}
			System.out.println();
		}
		 new ArrayTest().FinnZero(array2d);
		 new ArrayTest().Finnleft(array2d);
		 new ArrayTest().Finnright(array2d);
		 new ArrayTest().Finnup(array2d);
		 new ArrayTest().Finndown(array2d);
	}

}
