import java.util.Scanner;
public class zadacha1 {
    public static void main(String[] args) {
        int i=0;
        Scanner peremennaya= new Scanner( System.in);
        System.out.print("Введите число: ");
        int a= peremennaya.nextInt();
        if (a>0) {
            System.out.print("Число положительное");
        }
        else if(a<0) {
            System.out.print("Число отрицательное");
        }
        while (a>0 || a<0) {
            a= a/10;
            i++;
        }
        System.out.print(" и количество разрядов "+ i);
    }
}