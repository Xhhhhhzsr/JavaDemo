package Demo01;


import java.util.Arrays;
/*
R类里面有字符串型变量和二维数组如下，R类中禁止添加使用任何java方法：
String boy_filePath="img/boy.gif"
String girl_filePath="img/girl.gif"
int [ ][ ]array2d={{1,2,3},{4,5,6}}
在App主类里面继承R类，并在main方法中调用并输出这些变量。
*/
public class R {
	static void R(){
		String boy_filePath="img/boy.gif";
	    String girl_filePath="img/girl.gif";
	    int [ ][ ]array2d={{1,2,3},{4,5,6}};
		System.out.println(boy_filePath+"\n"+girl_filePath+"\n"+"array2d:"+Arrays.deepToString(array2d));
	}
}
