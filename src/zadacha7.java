import java.util.Scanner;
public class zadacha7 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Vvedite kol-vo programmistov: ");
        int a= b.nextInt();
        if (a==1) {
            System.out.println(a + " programmist");
        }
        else if (a>=2 && a<=4 )
        {
            System.out.println(a + " programmista");
        }
        else System.out.println(a+ " programmistov");
    }
}
