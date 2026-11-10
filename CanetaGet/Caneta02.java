package CanetaGet;

public class Caneta02 {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    public Caneta02(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar() {
        this.tampada = false;
    }
    public void status() {
        System.out.println("sobre a caneta");
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("cor: " + this.cor);
        System.out.println("tampada " + this.tampada);
    }
}
