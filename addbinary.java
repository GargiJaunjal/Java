package JAVAA;

import java.util.Scanner;

public class addbinary{
    public static String  abin(String a,String b){
        StringBuilder result=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;

        while(i>=0||j>=0||carry!=0)
        {
            int A=0;
            if(i>=0)
            {
                A=a.charAt(i)-'0';
            }
            int B=0;
            if(j>=0){
                B=b.charAt(j)-'0';
            }
        

        int sum=A+B+carry;

        result.append(sum%2);
        carry=sum/2;

        i--;
        j--;

        }

        return result.reverse().toString();
 }

public static void main(String argsp[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input  the string");
    String num1=sc.nextLine();
    //System.out.println(num1);

    System.out.println("Input the string");
    String num2=sc.nextLine();
    //System.out.println(num2);

    String sum=abin(num1,num2);

    System.out.println("SUM:"+sum);

    sc.close();

}
}
