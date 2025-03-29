package Q1;

public class Animal {
    private double tamanho;
    private String cor, nome;

    public Animal(double tamanho, String cor,String nome) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}