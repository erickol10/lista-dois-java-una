import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os coeficientes da equação de segundo grau (ax^2 + bx + c = 0):");

        System.out.print("a = ");
        double a = input.nextDouble();

        System.out.print("b = ");
        double b = input.nextDouble();

        System.out.print("c = ");
        double c = input.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double x = -c / b;
            System.out.printf("A raiz real da equação é x = %.2f\n", x);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.printf("As raízes da equação são x1 = %.2f e x2 = %.2f\n", x, x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.printf("As raízes da equação são x1 = %.2f e x2 = %.2f\n", x1, x2);
            }
        }

        input.close();
    }
}
