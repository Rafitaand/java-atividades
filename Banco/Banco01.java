package Banco;

//numConta, tipo (cp +150, cc +50), dono, saldo, status
//abrirConta(muda o status p true), fecharConta(tem que sacar p fechar), 
// depositar(status true), 
// sacar(true e tem que ter saldo), pagarMensal(cc = rs 12, cp = rs20)
public class Banco01 {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumconta());
        System.out.println("Tipo: " + this.GetTipo());
        System.out.println("Dono: " + this.GetDono());
        System.out.println("Saldo: " + this.GetSaldo());
        System.out.println("Status: " + this.GetStatus());
        System.out.println("------------------------------");
    }
    public Banco01 (float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumconta(){
        return this.numConta;
    }

    public void SetNumconta(int n) {
        this.numConta = n;
    }

    public String GetTipo() {
        return this.tipo;
    }

    public void SetTipo(String t) {
        this.tipo = t;
    }

    public String GetDono() {
        return this.dono;
    }

    public void SetDono(String d) {
        this.dono = d;
    }

    public float GetSaldo() {
        return this.saldo;
    }

    public void SetSaldo(float s) {
        this.saldo = s;
    }

    public boolean GetStatus() {
        return this.status;
    }

    public void SetStatus(boolean st) {
        this.status = st;
    }


    public void abrirConta(String t) {
        this.SetStatus(true);
        this.SetTipo(t);
        if (t == "cc") {
            this.SetSaldo(50);
        }else if (t == "cp") {
            this.SetSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro, não pode ser fechada. Necessário estar com a conta zerada");
        } else if (saldo < 0){
            System.out.println("Conta em débito, não pode ser fechada.");
        } else {
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar (float v) {
        if (GetStatus()) {
            SetSaldo(GetSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de: " + this.GetDono());
        }else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }

    }

    public void sacar(float v) {
        if(GetStatus() && GetSaldo() >= v) {
            SetSaldo(GetSaldo() - v);
            System.out.println("Saque realizado na conta de: " + this.GetDono());
        } else {
            System.out.println("Não foi possível sacar, verifique se está com uma conta aberta ou se não há saldo para sacar.");
        }


    }

    public void pagarMensal() {
        int v = 0;
        if (this.GetTipo() == "cc" && status == true && saldo >= v) {
            v = 12;
            SetSaldo(GetSaldo() - v);
            System.out.println("Pago com sucesso.");
        } else if (this.GetTipo() == "cp" && status == true && saldo >= v) {
            v = 20;
            SetSaldo(GetSaldo() - v);
            System.out.println("Pago com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou Conta não aberta, verifique.");
        }
            
    }

}
 

    
