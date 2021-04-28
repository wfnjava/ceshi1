package atm;

import java.util.Scanner;

/**
 * 2021.3.11
 * @author w
 *
 */
public class ATM {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("欢迎使用ATM系统");
        String name1="111";   //用户1
        String password1="09161525";
        double balance1=2520;
        String name2="222";   //用户2
        String password2="09161525";
        double balance2=10000;
        String name3="333";   //用户3
        String password3="09161525";
        double balance3=12356;

        Scanner input=new Scanner(System.in);
        double balance=0;
        int i=0;  //用于记录密码输入的次数
        int result=2; //用于保存密码是否正确  0是错误，  1是正确


        String zhanghao = null;
        String password = null;
        while(1==1) {

            if(i==0) {	           //第一次输入比较客气
                System.out.println("请输入您的账号");
                zhanghao=input.next();
                System.out.println("请输入您的密码");
                password=input.next();
            }else {                //多次输入比较不客气
                System.out.println("您还有"+(3-i) +"请输入您的账号");
                zhanghao=input.next();
                System.out.println("您还有"+(3-i) +"请输入您的密码");
                password=input.next();

            }

            if(zhanghao.equals(name1) && password1.equals(password)){
//				System.out.println("恭喜您，输入正确");
//				System.out.println("欢迎您，用户"+1);
//				balance=balance1;
//				result=1;
//				break;
            }else if(zhanghao.equals(name2) && "09161525".equals(password)) {
                System.out.println("恭喜您，输入正确");
                System.out.println("欢迎您，用户"+2);
                balance=balance2;
                result=1;
                break;
            }else if("333".equals(zhanghao) && "09161525".equals(password)) {
                System.out.println("恭喜您，输入正确");
                System.out.println("欢迎您，用户"+3);
                balance=balance3;
                result=1;
                break;
            }else{
                i++;
                if(i<=3) {
                    System.out.println("您输入错误，请重新输入");
                }else {
                    System.out.println("您输入错误，不好意思请退卡");
                    result=0;
                    break;
                }
            }

        }
        //密码输入部分已经结束，接下来判断是走出循环还是跳出循环的
        if(result==0) {
        }else {
            while(1==1) {
                System.out.println("请输入存款1？还是取款2？还是查询余额3？还是退出4？");
                String caozuo =input.next();
                if("1".equals(caozuo)) {
                    System.out.println("请输入存款金额");
                    double cunkuan= input.nextDouble();
                    balance =balance+cunkuan;
                    System.out.println("存入金额为"+cunkuan+"余额为"+balance);
                }else if("2".equals(caozuo)) {
                    System.out.println("请输入存款金额");
                    double qukuan= input.nextDouble();
                    balance=balance-qukuan;
                    System.out.println("取款金额为"+qukuan+"余额为"+balance);
                }else if("3".equals(caozuo)) {
                    System.out.println("余额为"+balance);
                }else if("4".equals(caozuo)) {
                    break;
                }else {
                    System.out.println("请重新输入");
                }

            }

        }
        System.out.println("谢谢小薇薇制作");
    }
}
