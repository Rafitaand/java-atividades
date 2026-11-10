package treinoPorta;

// Crie a classe Porta com cor (String), material (String), aberta (boolean) e trancada (boolean). 
// Crie abrir(), fechar(), trancar() e destrancar(). 
// A regra: a porta só abre se não estiver trancada, e só pode ser trancada se estiver fechada. 
// Mostre uma mensagem de erro quando a ação não for possível.

public class Porta {
    public String cor;
    public String material;
    public boolean aberta;
    public boolean trancada;

    public void abrir() {
        if (this.trancada == true) {
            System.out.println("A porta não pode ser aberta, está trancada.");
        } else if (this.aberta == true){
            System.out.println("Porta já se encontra aberta.");
        } else {
            this.aberta = true;
            System.out.println("Abrindo porta.");
        }
    }

    public void fechar () {
        if (this.aberta == true) {
            this.aberta = false;
            System.out.println("Fechando porta.");
        }else{
            System.out.println("A porta já se encontra fechada.");
        }
    }

    public void destrancar () {
        if (this.trancada == true) {
            this.trancada = false;
            System.out.println("Destrancando porta.");
        } else {
            System.out.println("Porta já está destrancada.");
        }
    }

    public void trancar () {
        if (this.trancada == true) {
            System.out.println("Porta já se encontra trancada.");
        } else if (this.aberta == true){
            System.out.println("Não é possível trancar, a porta encontra-se aberta");
        } else {
            this.trancada = true;
            System.out.println("Trancando porta.");
        }
    }
}
