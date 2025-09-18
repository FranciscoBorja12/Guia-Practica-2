import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r, h, area;
        System.out.print("Ingrese el radio del cilindro: ");
        r = sc.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        h = sc.nextDouble();

        area = 2 * Math.PI * r * (r + h);

        System.out.println("El área del cilindro es: " + area);
        sc.close();

    }
}