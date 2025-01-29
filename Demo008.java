
import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = null;
        String pwd = null;
        String reply;
        do { 
            System.out.println("Welcome to mallareddy university");
            System.out.println("have you visited our site earlier");
            reply=sc.nextLine();
            if(reply=="no") {
                System.out.println("login here");
                System.out.println("enter your id and pwd");
                loginid=sc.nextLine();
                pwd=sc.nextLine();

            }else
            System.err.println("you are our valued customer");
        }while((loginid == "Madhav") && (pwd == "12345"));
        }
    }
