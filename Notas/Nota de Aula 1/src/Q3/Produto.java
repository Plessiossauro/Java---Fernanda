package Q3;

public class Produto {
    String nome;
    double preço;
    int quantidade;
    int quantidade1;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void adicionarEstoque(int quantidade1) {
        quantidade = quantidade + quantidade1;
    }

    public int exibirEstoque() {
        return quantidade;
    }

    public void venderProduto(int quantidade1) {
        quantidade = quantidade - quantidade1;
    }
}
