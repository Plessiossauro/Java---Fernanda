package Q1;

public class Leao extends Animal {
    private boolean juba;

    public Leao(double tamanho, String cor, boolean juba, String nome){
        super(tamanho, cor,nome);
        this.juba =juba;
    }
    public void setJuba(boolean juba){
        this.juba = juba;
    }
    public boolean getJuba(){
        return juba;
    }
    public void cacar(){
        String nome;
    }
}