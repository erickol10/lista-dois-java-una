import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();
        System.out.print("Digite o valor pago: ");
        double valorPago = sc.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Valor pago é insuficiente para realizar a compra.");
            return;
        }

        double troco = valorPago - valorCompra;

        int notas50 = (int) (troco / 50);
        troco = troco % 50;
        int notas20 = (int) (troco / 20);
        troco = troco % 20;
        int notas10 = (int) (troco / 10);
        troco = troco % 10;
        int notas5 = (int) (troco / 5);
        troco = troco % 5;
        int notas2 = (int) (troco / 2);
        troco = troco % 2;
        int notas1 = (int) (troco / 1);

        System.out.println("O troco é R$" + String.format("%.2f", (valorPago - valorCompra)));
        System.out.println("Notas de R$50: " + notas50);
        System.out.println("Notas de R$20: " + notas20);
        System.out.println("Notas de R$10: " + notas10);
        System.out.println("Notas de R$5: " + notas5);
        System.out.println("Notas de R$2: " + notas2);
        System.out.println("Notas de R$1: " + notas1);
    }
}
