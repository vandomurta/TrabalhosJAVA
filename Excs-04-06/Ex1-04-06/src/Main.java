public class Main {
    public static void main(String[] args) {

        Quadrado quadrado1 = new Quadrado(5);

        int a = quadrado1.area();

        quadrado1.getLado();
        quadrado1.setLado(2);
        quadrado1.getLado();
        System.out.println(a);




    }
}