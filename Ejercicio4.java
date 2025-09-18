import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0, precio, subtotal;
        int cantidad;
        char continuar;

        do {
            System.out.print("Ingrese precio del producto: ");
            precio = sc.nextDouble();
            System.out.print("Ingrese cantidad del producto: ");
            cantidad = sc.nextInt();

            subtotal = precio * cantidad;
            total = total+subtotal;

            System.out.print("¿Desea ingresar otro producto? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        double descuento = 0;

        if (total >= 20 && total <= 35) {
            descuento = total * 0.05;
        } else if (total >= 36 && total <= 50) {
            descuento = total * 0.08;
        } else if (total > 50) {
            descuento = total * 0.10;
        }

        double totalFinal = total - descuento;
        sc.close();
        System.out.println("Total de la compra: $" + total);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}
 