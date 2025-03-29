package Q2;

public class Medico {
    private String nome;
    private boolean trabalhanoHospital;

    public Medico(String nome, boolean trhospital){
        this.nome = nome;
        this.trabalhanoHospital = trhospital;
    }
    public void tratarpaciente(){
        System.out.println("O paciente precisar de tratamento");
    }

    public boolean isTrabalhanoHospital() {
        return trabalhanoHospital;
    }

    public void setTrabalhanoHospital(boolean trabalhanoHospital) {
        this.trabalhanoHospital = trabalhanoHospital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}