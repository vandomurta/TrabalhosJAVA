
/*Classe Pessoa: Crie uma classe que modele uma pessoa:

Atributos: nome, idade, peso e altura
Métodos: Envelhercer, engordar, emagrecer, crescer.
Obs: Por padrão, a cada ano que nossa pessoa envelhece,
sendo a idade dela menor que 21 anos,
ela deve crescer 0,5 cm.
*/

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Pessoa vando = new Pessoa("Vando",20,80,1.7f);


        System.out.println("O nome é:");
        vando.getNome();

        System.out.println("Quanto quer envelhecer?");
        vando.envelhecer(scanner.nextInt());

        System.out.println("A sua nova idade é :");
        vando.getIdade();

        System.out.println("Quanto engordou?");
        vando.engordar(scanner.nextFloat());
        System.out.println("Agora pesa:");
        vando.getPeso();

        System.out.println("Quanto quer emagrecer?");
        vando.emagrecer(scanner.nextFloat());
        System.out.println("Agora pesa:");
        vando.getPeso();

        System.out.println("A sua altura é:");
        vando.getAltura();



    }
}