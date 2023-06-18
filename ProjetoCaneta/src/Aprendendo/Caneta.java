package Aprendendo;
public class Caneta {
    String cor;
    float ponta;
    int carga;  
    boolean tampada;
    String modelo;
    void status(){
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Uma caneta" + this.cor);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println("Está tampada? " + tampada);      
    }

    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Beleza, eu estou rabiscando ");
        }
    }
    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
         
    }

}


