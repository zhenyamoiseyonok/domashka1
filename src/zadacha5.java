import java.util.Scanner;
public class zadacha5 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int i=0;
        int p=0;
        System.out.print("Введите первое число: ");
        int a= q.nextInt();
        System.out.print("Введите второе число: ");
        int b= q.nextInt();
        System.out.print("Введите третье число: ");
        int c= q.nextInt();
        if (a>0) {
            i++;
        }
        else
        {
            p++;
        }
        if (b>0) {
            i++;
        }
        else
        {
            p++;
        }
        if(c>0) {
            i++;
        }
        else
        {
            p++;
        }
        System.out.println("кол-во положительных- " + i + " кол-во отрицательных- " + p);
    }
}