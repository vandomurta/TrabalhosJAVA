public class Cliente {
    private String nome;
    private int    tlm;
    private String email;



    public Cliente (String nome, int tlm , String email){
        this.nome= nome;
        this.tlm= tlm;
        this.email=email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTlm() {
        return tlm;
    }

    public void setTlm(int tlm) {
        this.tlm = tlm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
