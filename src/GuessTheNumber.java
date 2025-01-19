import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //....опыт
        boolean a= true;
        while ( true){
              int aiNumber = random.nextInt(10);
           // while ( true){
          System.out.printf("Ведите число от 0 до 9");
        int answer = scanner.nextInt();
        if ( answer == aiNumber ){
                  System.out.println("вы угадали число ");
                break;
          }  else {
            System.out.println("не угадали "+ aiNumber);
        }a = (false) ;
        }
    }
}
