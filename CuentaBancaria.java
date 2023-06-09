public class CuentaBancaria {
    public static void main(String[] args){
        double saldo = 1000.75;
        double cantidadARetirar= 250;
        double saldoActualizado= saldo-cantidadARetirar;
        double cantidadParaCadaAmigo= saldoActualizado/3;
        boolean puedeComprarTicket= cantidadParaCadaAmigo >= 250;
        System.out.println("¿Puede cada amigo comprar un boleto? " + puedeComprarTicket);
        System.out.println("Cantidad para cada amigo: " + cantidadParaCadaAmigo);
    }
    
}