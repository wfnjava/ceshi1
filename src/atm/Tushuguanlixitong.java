

import java.util.Scanner;

/*
 *
 */
public class Tushuguanlixitong {
    static Scanner input = new Scanner(System.in);
    //需要具有 登陆 查询  插入 删除等功能


    public static String Login() {

        String	 result;
        String	 raw_Account="09161525";
        String   raw_Password="123456";

        System.out.println("请输入账号");
        String account =input.next();
        System.out.println("请输入账号");
        String password =input.next();
        if(account.equals(raw_Account) && password.equals(raw_Password)) {
            result= "success";
        }else {
            result= "failure";
        }

        return result;

    }


    public static void main(String[] args) {

        String  result=Login(); //调用登陆方法
        if("success".equals(result)) {
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }


    }

}