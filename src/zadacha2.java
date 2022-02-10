import java.util.Scanner;
public class zadacha2 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Введите сторону а треугольника: ");
        double a = q.nextDouble();
        System.out.println("Введите сторону b треугольника: ");
        double b = q.nextDouble();
        System.out.println("Введите сторону c треугольника: ");
        double c = q.nextDouble();
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
