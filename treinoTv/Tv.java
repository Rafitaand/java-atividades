package treinoTv;

// Crie a classe Televisao com marca, ligada (boolean), canal (int) e volume (int). 
// Crie ligar(), desligar(), aumentarVolume() e diminuirVolume() (de 1 em 1), e proximoCanal() e canalAnterior(). 
// Nenhum desses botões deve funcionar com a TV desligada.

public class Tv {
    public boolean ligado;
    public int canal;
    public int volume;
    

    public void ligar() {
        if (this.ligado == true) {
            System.out.println("A TV já está ligada.");
        } else if (this.ligado == false){
            this.ligado = true;
            System.out.println("Ligando TV.");
        } 
    }
    public void desligar() {
        if (this.ligado == true) {
            this.ligado = false;
            System.out.println("Desligando TV.");
        } else {
            System.out.println("TV já está desligada.");
        }
    }

    public void aumentarVolume() {
        if (this.ligado == false) {
            System.out.println("A TV está desligada.");
        } else if (this.volume >= 10) {
            System.out.println("TV já está com o som no máximo.");
        } else {
            this.volume++;
            System.out.println("Aumentando som. Volume: " + this.volume);
        }
    }

    public void diminuirVolume() {
        if (this.ligado == false) {
            System.out.println("A TV está desligada. ");
        } else if (this.volume <= 0) {
            System.out.println("TV está com o som no mínimo.");
        } else {
            this.volume--;
            System.out.println("Diminuindo som. Volume: " + this.volume);
        }
    }

    public void proximoCanal() {
        if (this.ligado == false) {
            System.out.println("A TV está desligada.");
        } else if(this.canal >= 10) {
            this.canal = 1;
            System.out.println("Voltando para o primeiro canal: " +this.canal);
        } else {
            this.canal++;
            System.out.println("Próximo canal. Canal atual: " + this.canal);
        }
    }

    public void canalAnterior() {
        if (this.ligado == false) {
            System.out.println("A TV está desligada.");
        } else if(this.canal <= 0) {
            this.canal = 10;
            System.out.println("Indo para o último canal: " + this.canal);
        } else {
            this.canal--;
            System.out.println("Voltando canal. Canal atual: " + this.canal);
        }

    }

  
}
