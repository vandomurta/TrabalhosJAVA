import org.w3c.dom.ls.LSOutput;

public class Retangulo {

    int ladoA;
    int ladoB;


    public Retangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;


    }
    public void setLados(int ladoA,int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public void getLados() {
        System.out.println("O ladoA é "+ladoA+"\nO ladoB é "+ladoB);
    }

    public int area(){
        int a = ladoA*ladoB;
        return a;
    }
    public int perimetro(){
        int p = 2*(ladoA+ladoB);
        return p;
    }

}

