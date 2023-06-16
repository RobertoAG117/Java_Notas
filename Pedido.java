public class Pedido {
    public static void main(String[] args) {
        double costoArticulo = 30.99;
        boolean listoEviar=false;
        if (costoArticulo > 24) {
            System.out.println("El valor del articulo es alto");
        }
        if (listoEviar == true) {
                System.out.println("Enviado");
            } else {
                System.out.println("Pedido no listo");
            }
    }
}

