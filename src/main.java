import java.util.Scanner;

/**
 * Created by YANGJIAWANG on 2018/5/16.
 */
public class main {
    public static void main(String[] args) {
     Yonghu a=new VIPYonghu();
        Scanner sc=new Scanner(System.in);
 System.out.println("请输入你的姓氏");
     String name=sc.next();
     a.setName(name);
a.setJibie(3);
a.Tousu();
a.XX();
    }
}
