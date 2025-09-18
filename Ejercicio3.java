import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, mayor, menor;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        mayor = numero;
        menor = numero;

        for (int i = 1; i < 6; i++) {
            System.out.print("Ingrese numero: ");
            numero = sc.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        sc.close();
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}