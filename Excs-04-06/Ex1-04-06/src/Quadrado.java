public class Quadrado {

    int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public void setLado(int lado){
        this.lado = lado;
    }
    public void getLado(){
        System.out.println(lado);
    }
    public int area(){
        int area = lado * lado;
        return area;
    }

}
