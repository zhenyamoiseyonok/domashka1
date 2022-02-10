import java.util.Scanner;
public class zadacha6 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = q.nextDouble();
        System.out.print("Введите второе число: ");
        double b = q.nextDouble();
        if (a>b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        }
    }

