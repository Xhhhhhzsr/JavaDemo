package Array;
//120701.寻找0的相邻坐标.Find.java
public class ArrayTest {
	 int R_x=0;//列 column 
	 int R_y=0;//行 row
//	R_Zero=(j,i);
	void FinnZero(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					System.out.println("0的坐标是:"+"R_Zero("+culumn+","+row+")");
				}
			
			}
		}
	}
	
	void Finnleft(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					int R_x=culumn;
					int R_y=row;
					System.out.println("0的左边数字"+10+"的坐标是:"+"R_left("+(R_x-1)+","+(R_y)+")");
				}
			
			}
		}
	}
	
	void Finnright(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					int R_x=culumn;
					int R_y=row;
					System.out.println("0的右边数字"+12+"的坐标是:"+"R_right("+(R_x+1)+","+(R_y)+")");
				}
			
			}
		}
		
	}

	//up
	void Finnup(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					int R_x=culumn;
					int R_y=row;
					System.out.println("0的上边数字"+5+"的坐标是:"+"R_up("+(R_x)+","+(R_y-1)+")");
				}
			
			}
		}
		
	}

	//down
	void Finndown(int array2d[][]){
		for (int row = 0;row < array2d.length; row++) {
			for (int culumn = 0; culumn < array2d[0].length; culumn++) {
				if (array2d[row][culumn]==0) {
					int R_x=culumn;
					int R_y=row;
					System.out.println("0的下边数字"+11+"的坐标是:"+"R_down("+(R_x)+","+(R_y+1)+")");
				}
			
			}
		}
		
	}
}
