import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Retangulo ret1 = new Retangulo(10, 20);

        int a = ret1.area();
        int p = ret1.perimetro();
        ret1.getLados();

        System.out.println(a);
        System.out.println(p);*/


        System.out.println("Digite o lado A e o lado B do local:");
        Retangulo ret2 = new Retangulo(scanner.nextInt(), scanner.nextInt());
        int pisos = ret2.area();
        int rodapes = ret2.perimetro();
        System.out.println("Precisa de "+pisos+"m quadrados de piso");
        System.out.println("Precisa de "+rodapes+"m de rodapes");




    }
}