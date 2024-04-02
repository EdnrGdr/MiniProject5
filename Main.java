import java.util.Scanner;

public class Main {

    public static  void main (String [] args) {
        // Kullanıcıdan Alınan 3 Sayıdan En Büyük Sayıyı Bulma Örenği


        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Number1.. :");
        int number1 = scanner.nextInt();
        System.out.print("Please Enter Number2.. :");
        int number2=scanner.nextInt();
        System.out.print("Please Enter Number3.. :");
        int number3 = scanner.nextInt();


        int max = -1;

        if ( number1 >= number2  &&  number1>= number3 ) {
            
            max= number1;

            
        } else if ( number2>= number1 && number2>=number3 ) {

            max= number2;
            
        } else {

            max= number3;
        }
        System.out.println("Max Number..: " + max);
    }
}
