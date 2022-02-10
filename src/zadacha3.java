import java.util.Scanner;
public class zadacha3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = s.nextInt();
        if (a>0) {
            a++;
        }
        else if (a<0) {
            a-=2;
        }
        else {
            a=10;
        }
        System.out.println("Преобразованное целое число " + a);
    }
}
