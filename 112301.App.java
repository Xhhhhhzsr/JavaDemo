package Week12;

import java.util.Scanner;
//输入一个a，生成随机坐标
public class Demo1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       while (true){
           String num1=sc.next();

           if (num1.equals("a")) {
               System.out.println("坐标轴为："+(int)(Math.random()*100)+","+(int)(Math.random()*100));
           }else{
               System.out.println("输入错误请输入a");
           }
        }


    }
}
