public class Lampada{
    //iremos utilizar boleanos pois é um caso de sim/nao 0 ou 1
    boolean ligado;
    // metodo para ligar a luz
    void ligar(){
        ligado = true;
        System.out.println("ligado? "+ligado);
    }
    
    // metodo para desligar a luz
    void desligar(){
        ligado = false;
        System.out.println("ligado? "+ligado);
    }
    public static void main(String[] args){
        // criamos objetos que mostram a composição da lâmpada
        // duas novas classes de lâmpadas
        
        Lampada led = new Lampada();
        Lampada halogenio = new Lampada();
     
         // ligamos a lâmpada feita de halogênio
     
        halogenio.ligar();
     
         //mantemos a lâmpada de led desligada
         led.desligar();
    }
}