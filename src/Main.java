import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int user;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Whelcome!");
            System.out.println("Indovina il numero");
            Random r = new Random();

            number = r.nextInt(10)+1;
            user = scanner.nextInt();

            if(user == number){
                System.out.println("Congratulazioni!! il numero era proprio: " + number);
            }else {
                System.out.println("Ritenta! Il numero era: " + number);
            }
        }
    }
}