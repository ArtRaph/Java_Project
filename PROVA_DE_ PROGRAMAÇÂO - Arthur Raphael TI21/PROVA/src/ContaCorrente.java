public class ContaCorrente {
    float valor;
    float sacar;
    float obter;
    float resul;
    

    public void obtercao() {
        this.obter = this.valor - this.sacar;
        
    }
    

    public void debitado() {
        this.resul = (this.valor - 0.5f )/100;
    }
    

    public void Status() {
        System.out.println("Seu valor: " + this.valor);

        System.out.print("O que você tem: " + this.resul);
    }
     
}
