public class Pessoa {

    String nome;
    int idade;
    float peso;
    float altura;

    public Pessoa(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(int anos){
        for(int i=0; i<anos; i++){

            if(this.idade<21){
                this.altura+=0.005f;
            }
            this.idade++;

        }

    }
    public void engordar(float maikg){
        this.peso = this.peso + maikg;
    }
    public void emagrecer(float menkg){
        this.peso = this.peso - menkg;
    }
    public void crescer(float m){
        this.altura = this.altura+m;

    }
    public void getNome(){
        System.out.println(this.nome);
    }
    public void getIdade(){
        System.out.println(this.idade);
    }
    public void getPeso(){
        System.out.println(this.peso);
    }
    public void getAltura(){
        System.out.println(this.altura);
    }









}
