package Array;
//120701.寻找0的相邻坐标.Find.java
public class ArrayTest {
	 int R_x=0;//行 row
	 int R_y=0;//列 column
//	R_Zero=(j,i);
	void FinnZero(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					System.out.println("0的坐标是:"+"R_Zero("+row+","+culumn+")");
				}
			
			}
		}
	}
	
	void Finnleft(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					R_x=row;
					R_y=culumn;
					System.out.println("0的左边数字"+10+"的坐标是:"+"R_left("+(R_x)+","+(R_y-1)+")");
				}
			
			}
		}
	}
	
	void Finnright(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					R_x=row;
					R_y=culumn;
					System.out.println("0的右边数字"+12+"的坐标是:"+"R_right("+(R_x)+","+(R_y+1)+")");
				}
			
			}
		}
		
	}

	//up
	void Finnup(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					R_x=row;
					R_y=culumn;
					System.out.println("0的上边数字"+5+"的坐标是:"+"R_right("+(R_x-1)+","+(R_y)+")");
				}
			
			}
		}
		
	}

	//down
	void Finndown(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					R_x=row;
					R_y=culumn;
					System.out.println("0的下边数字"+11+"的坐标是:"+"R_right("+(R_x+1)+","+(R_y)+")");
				}
			
			}
		}
		
	}
}
