/*Classe Conta Corrente: Crie uma classe
para implementar uma conta corrente.
A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo.
Os métodos são os seguintes:
 alterarNome, depósito e saque;
 No construtor, saldo é opcional,
 com valor default zero e
 os demais atributos são obrigatórios.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        System.out.println("Qual o numero da conta?");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();



        Conta c1 = new Conta(numero, nome);

        c1.getNome();
        c1.getNumero();

        System.out.println("Digite outro nome:");
        c1.setNome(scanner.nextLine());
        c1.getNome();

        System.out.println("Quanto quer depositar?");
        c1.deposito(scanner.nextFloat());
        c1.getSaldo();

        System.out.println("Quanto quer sacar?");
        c1.saque(scanner.nextFloat());
        c1.getSaldo();






    }
}