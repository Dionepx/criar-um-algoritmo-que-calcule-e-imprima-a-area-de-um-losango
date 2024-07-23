import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a diagonal maior: ");
        double diagonalMaior = scanner.nextDouble();

        System.out.println("Entre com a diagonal menor: ");
        double diagonalMenor = scanner.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("Área: " + area);

        scanner.close();
    }
}