import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Loja loja1= new Loja ( "Minha loja");
        Produto frigorifico= new Produto("Frigorifico", 300, 1, catProduto.eletrodomestico);

        loja1.addProduto("Asus",500,1, catProduto.PCs);
        loja1.addProduto(frigorifico);

        String nomeLoja = loja1.getNome();
        System.out.println(nomeLoja);
        loja1.listarPordutos();
        loja1.listarPordutos(catProduto.PCs);

        loja1.addCliente("Vando",999999999,"12345@gmail.com");
        loja1.addCliente("José",123456789,"88888@hotmail.com");
        loja1.listarClientes();












    }


}