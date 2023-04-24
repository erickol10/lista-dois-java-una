import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, / ou ^): ");
        char operacao = input.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Símbolo da operação inválido!");
                break;
        }

        if (operacao == '/' && num2 != 0) {
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operacao, num2, resultado);
        } else if (operacao != '/') {
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, operacao, num2, resultado);
        }

        input.close();
    }
}
