import java.util.Scanner;
public class zadacha4 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int i=0;
        System.out.print("Введите первое число: ");
        int a= q.nextInt();
        System.out.print("Введите второе число: ");
        int b= q.nextInt();
        System.out.print("Введите третье число: ");
        int c= q.nextInt();
        if (a>0) {
            i++;
        }
        if (b>0) {
            i++;
        }
        if(c>0) {
            i++;
        }
        System.out.println("кол-во положительных " + i);
    }
}
