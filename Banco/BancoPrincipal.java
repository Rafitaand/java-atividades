package Banco;

public class BancoPrincipal {
    public static void main(String[] args) {
        Banco01 b1 = new Banco01(0, false);
        b1.SetNumconta(1);
        b1.SetDono("Jeremias");
        b1.abrirConta("cc");
        b1.depositar(300);
        b1.estadoAtual(); 


        Banco01 b2 = new Banco01(0, false);
        b2.SetNumconta(2);
        b2.SetDono("Julia");
        b2.abrirConta("cp");
        b2.depositar(500);
        b2.sacar(100);
        b2.estadoAtual(); 
    }
}
