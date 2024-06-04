public class Conta {

    int numero;
    String nome;
    float saldo;

    public Conta(int numero,String nome){
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
    }


    public void getNumero() {
        System.out.println("O numero da conta é "+numero);

    }
    public void getNome() {
        System.out.println("O nome é "+nome);
    }
    public void getSaldo() {
        System.out.println("O saldo é "+saldo);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void deposito(float deposito) {
        this.saldo += deposito;
    }
    public void saque(float saque) {
        this.saldo -= saque;
    }
}
