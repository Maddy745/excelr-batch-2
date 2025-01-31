import java.util.Scanner;

public class Test002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reply;

        while (true) {
            System.out.println("Happy Sankranthi!");
            System.out.print("Do you want to see it again? (yes/no): ");
            reply = scanner.nextLine().trim().toLowerCase();

            if (reply.equals("no")) {
                break;
            }
        }

        scanner.close();
    }
}
