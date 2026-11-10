package treinoCaneta;

public class Ex00 {

    public static void main(String[] args) {
       Caneta c1 = new Caneta(); 
       c1.modelo = "BIC";
       c1.cor = "Azul";
    // c1.ponta = 0.5f;
       c1.carga = 80;
       c1.tampada = true;       
       c1.status();

    //    Caneta c2 = new Caneta();
    //    c2.cor = "verde";
    //    c2.modelo = "ponta fina";
    //    c2.tampar();
    //    c2.status();

    }
}