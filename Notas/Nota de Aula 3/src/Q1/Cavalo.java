package Q1;

public class Cavalo extends Animal{
    private String raca;

    public Cavalo(double tamanho, String cor, String raca, String nome) {
        super(tamanho, cor,nome);
        this.raca = raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }

    public void fugir(){
        String Nome;
    }
}