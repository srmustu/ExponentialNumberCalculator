import java.util.Scanner;
public class ExponentialNumberCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String message1,message2,message3;
        int number1,number2,calculator,result;

        result = 1;
        message1 = "Please enter the base number : ";
        message2 = "Please enter exponent number : ";
        message3 = "Result : ";

        System.out.print(message1);
        number1 = input.nextInt();
        System.out.print(message2);
        number2 = input.nextInt();

        for (int i=1; i<= number2; i++){
            result *= number1;
        }

        System.out.println(message3 + result);
    }
}
