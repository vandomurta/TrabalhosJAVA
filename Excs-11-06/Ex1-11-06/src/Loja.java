import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Produto> listaProduto;
    private ArrayList<Cliente> listaClientes;

    public Loja(String nome) {
        this.nome = nome;
        this.listaProduto = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }


    public void addProduto(Produto prod) {

        this.listaProduto.add(prod);
    }

    public void addProduto(String nome,
                           float preco,
                           int quantidade,
                           catProduto categoria) {

        this.listaProduto.add(new Produto(nome, preco, quantidade, categoria));
    }

    public void addCliente(Cliente novo_cliente) {
        this.listaClientes.add(novo_cliente);
    }

    public void addCliente(String nome, int tlm, String email) {
        this.listaClientes.add(new Cliente(nome, tlm, email));
    }

    public void listarPordutos() {

        for (Produto elm : this.listaProduto) { //por cada elemento da lista produtos (objeto produto)
            System.out.println(elm.getNome());
        }
    }

    public void listarPordutos(catProduto cat) {

        for (Produto elm : this.listaProduto) {

            if (elm.getCategoria() == cat) {
                System.out.println(elm.getNome());
            }

        }
    }
    public void listarClientes() {

        for (Cliente elm : this.listaClientes) { //por cada elemento da lista Clientes (objeto Cliente)
            System.out.println(elm.getNome());
        }
    }

    public String getNome() {
        return nome;
    }


}