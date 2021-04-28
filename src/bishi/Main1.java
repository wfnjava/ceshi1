package bishi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入三个正整数:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a<=0||b<=0||c<=0){
            System.out.println("输入错误，请输正整数");
        }
        if ((a+b>c)&&(b+c>a)&&(c+a>b)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
