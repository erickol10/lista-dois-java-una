import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da operação (1 para perímetro do círculo, 2 para área do círculo, 3 para volume da esfera): ");
        int codigo = sc.nextInt();

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        if (codigo == 1) {
            double perimetro = 2 * Math.PI * raio;
            System.out.println("O perímetro do círculo é: " + perimetro);
        } else if (codigo == 2) {
            double area = Math.PI * raio * raio;
            System.out.println("A área do círculo é: " + area);
        } else if (codigo == 3) {
            double volume = (4 * Math.PI * raio * raio * raio) / 3;
            System.out.println("O volume da esfera é: " + volume);
        } else {
            System.out.println("Código da operação inválido.");
        }

        sc.close();
    }
}
