public class App {
    public static void main(String[] args) {

        ContaCorrente c1  = new ContaCorrente();
        c1.valor = 1000;
        c1.sacar = 500;
        
        //c1.obtercao();
        //c1.debitado();
        //c1.Status();

        ClienteEspecial c2 = new ClienteEspecial();
        c2.valor = 1000;
        c2.sacar = 500;


        c2.obtercao();
        c2.debitado();
        c2.Status();


    }
}
