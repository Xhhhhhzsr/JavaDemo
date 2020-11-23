package Week12;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        //生成随机的坐标
        int arr[][]={{1,100},{100,200},{999,666},{150,520}};
        while(true){
            Thread.sleep(1000);
            int rand=(int)(Math.random()*10%4);
            System.out.println("随机二维数组是："+"\n"+"("+arr[rand][0]+","+arr[rand][1]+")");
        }
    }
}
