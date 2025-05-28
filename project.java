import java.util.*;
public class project {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mynum=(int)(Math.random()*100);
        int usernum=0;

        do{
            System.out.println("Guess my number");
            usernum=sc.nextInt();

            if(usernum==mynum){
                System.out.println("CORRECT NUMBER");
                break;
            }
            else if(usernum>mynum){
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is too small");
            }
        } while(usernum>=0);

        System.out.println("My number was:");
        System.out.println(mynum);
        sc.close();

    }
}
