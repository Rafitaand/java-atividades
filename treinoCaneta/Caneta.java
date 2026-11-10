package treinoCaneta;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga " + this.carga);
        System.out.println("Uma caneta " + this.cor);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro, não posso escrever.");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar () {
        this.tampada = true;
    }

    protected void destampar () {
        this.tampada = false;
    }

}