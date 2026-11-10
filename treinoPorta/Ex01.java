package treinoPorta;


// Crie a classe Porta com cor (String), material (String), aberta (boolean) e trancada (boolean). 
// Crie abrir(), fechar(), trancar() e destrancar(). 
// A regra: a porta só abre se não estiver trancada, e só pode ser trancada se estiver fechada. 
// Mostre uma mensagem de erro quando a ação não for possível.

public class Ex01 {
    public static void main(String[] args) {
        Porta p1 = new Porta();

        p1.cor = "Marrom";
        p1.material = "Madeira";

        p1.abrir();
        p1.fechar();
        p1.trancar();


    }
}
