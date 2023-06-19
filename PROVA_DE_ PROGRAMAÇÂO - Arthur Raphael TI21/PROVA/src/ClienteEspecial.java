public class ClienteEspecial extends ContaCorrente{

    public void obtercao() {
        obter = valor - sacar;
        
    }

    
    public void debitado() {
       resul = (valor - 0.1f)/100; 
    }


    public void Status() {
        System.out.println("Seu valor cliente especial: " + valor);
        System.out.print("O que você tem: " + resul);
    }
}
