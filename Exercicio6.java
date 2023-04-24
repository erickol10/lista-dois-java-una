import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        
        int menor, maior;
        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }
        
        int sorteado = (int) (Math.random() * (maior - menor + 1)) + menor;
               
        if (sorteado % 2 == 0) {
            System.out.println("O número sorteado é " + sorteado + " e é par.");
        } else {
            System.out.println("O número sorteado é " + sorteado + " e é ímpar.");
        }
        
        sc.close();
    }
}
