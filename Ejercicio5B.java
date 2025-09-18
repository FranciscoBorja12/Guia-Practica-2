public class Ejercicio5B {
    public static void main(String[] args) {
        for (int fila = 1; fila <= 7; fila++) {
            if (fila == 1 || fila == 4 || fila == 7) {
                for (int i = 0; i < 5; i++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}