import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Pessoa vando = new Pessoa("Vando",1,80,1.7f);


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