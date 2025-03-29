package Q2;

public class Clinica extends Medico {
    private boolean atendeemcasa;

    public Clinica(String nome,boolean trhospital,boolean atendeemcasa){
        super(nome,trhospital);
        this.atendeemcasa = atendeemcasa;
    }
    public void receita(){
        System.out.println("O Doutor está prescrever a receita medica");
    }

    public boolean isAtendeemcasa() {
        return atendeemcasa;
    }

    public void setAtendeemcasa(boolean atendeemcasa) {
        this.atendeemcasa = atendeemcasa;
    }
}