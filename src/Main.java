import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        String a = sc.nextLine();
        switch (a) {
            case "*":
                System.out.println("sandardy jazynyz");
                multiplication(b, sc.nextInt() );
                break;
            case "-":
                minus(b, sc.nextInt());
                break;
            case "/":
                division(b, sc.nextInt());
                break;
            case "+":
                plus(b, sc.nextInt());
                break;
            case "%":
                percent(b, sc.nextInt());
                break;
            default:
                System.out.println("It's not true");
        }

    }
    public  static void multiplication(int a , int b ) {
        int sum = a*b;
        System.out.println(sum);
    }
    public static void  minus (int a , int b) {
        int sum = a-b;
        System.out.println(sum);
    }
    public  static  void division ( int a ,int b) {
        int sum = a / b;
        System.out.println(sum);
    }
    public  static  void plus ( int a , int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public  static  void percent ( int a , int b) {
        int sum = a % b;
        System.out.println(sum);
    }
}