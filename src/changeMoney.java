import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        usd = sc.nextDouble();
        double change = usd * vnd;
        System.out.print("Tien VND: " + change);
    }
}
