public class Ejercicio2{
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int contador = 0, primos = 0, noPrimos = 0;
        System.out.println("Numeros primos en los primeros 15 terminos de Fibonacci:");
        while (contador < 15) {
            boolean esPrimo = true;

            if (a <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= a / 2; i++) {
                    if (a % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                System.out.println(a + " es num primo");
                primos++;

            } else {
                System.out.println(a + " no es primo");
                noPrimos++;
            }
            c = a + b;
            a = b;
            b = c;
            contador++;
        }
        System.out.println("Cantidad de primos: " + primos);
        System.out.println("Cantidad de no primos: " + noPrimos);
    }
}