package Q2;

public class Main {
    public static void main(String[] args){

        Clinica clinica = new Clinica("Roberto",true,false);
        Cirurgiao cirurgiao = new Cirurgiao("Roberto",true);

        System.out.println("O Doutor "+clinica.getNome()+" estar examinando o paciente!");
        cirurgiao.tratarpaciente();
        System.out.println("Esperer sair os resultados do examens para verificarmos a sua condição");
        cirurgiao.fazerincisao();
        System.out.println("Antes de marcamos a incisão, primeiro teremos que ver os horarios disponiveis com o doutor "+clinica.getNome()+" , e ele " +
                "apenas atende hospital ("+ clinica.isTrabalhanoHospital()+")");
    }
}