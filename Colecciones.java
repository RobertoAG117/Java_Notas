import java.util.*;
public class Colecciones{
    public static void main(String[]args){
        //Generemos el array de tipo linkedlist
        LinkedList<String>usuarios = new LinkedList<>();
        usuarios.add("Sam");
        usuarios.add("Pedro");
        usuarios.add("Pablo");

        //System.out.print("usuarios: "+ usuarios);
        System.out.println("el elemento en el simbolo 1 es: "+ usuarios.get(1));
        usuarios.set(1,"Lupe");
        System.out.println("");
        System.out.println("el elemento en el simbolo 1 es: "+ usuarios.get(1));
        System.out.println("");
        usuarios.remove(1);
        System.out.println("el elemento en el simbolo 1 es: "+ usuarios.get(1));

        //Pilas ("stack")
        Stack<String>pila = new Stack<>();

        pila.push("Juan");
        pila.push("Pedro");
        pila.push("Pablo");
        //System.out.println("Los elementos de la pila son: "+ pila());
        pila.pop();
        System.out.println(pila.peek());
        System.out.println("La posición 1 es: " + pila.search("Juan"));
        System.out.println(pila.empty());

        //  Colas
        Queue<String>cola = new LinkedList<>();
        
        cola.offer("Pedro");
        cola.offer("Pablo");
        cola.offer("Luis");
        System.out.println(cola.peek());
        System.out.println(cola.element());
        //cola.pol("Luis");
        //System.out.println(cola());

        //Metodos de Cadenas
    /*
        String nombre;
        String curp;
        String folio;
        String edad;
        int edadtotal;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de usuario: ");
        nombre = sc.nextLine();
        nombre=nombre.toLowerCase();
        System.out.println("Ingresa el folio: ");
        folio = sc.nextLine();
        folio=folio.toUpperCase();
        System.out.println("Ingresa tu curp: ");
        curp = sc.nextLine();
        curp=curp.toUpperCase();
        if(curp.length()!=18){
            System.out.println("Longitud del curp incorrecta ");
        }
        
        System.out.println("Ingresa la edad: ");
        edad = sc.nextLine();
        int edad2=Interger.parseInt(edad);
        edadtotal= (edad2+5);
        System.out.println("Esta es la nueva edad: "+ edadtotal);*/
        String nombre;
        String curp;
        String folio;
        String edad;
        int edadtotal;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre de usuario: ");
        nombre = sc.nextLine();
        nombre = nombre.toLowerCase();
        
        System.out.println("Ingresa el folio: ");
        folio = sc.nextLine();
        folio = folio.toUpperCase();
        
        System.out.println("Ingresa tu CURP: ");
        curp = sc.nextLine();
        curp = curp.toUpperCase();
        if (curp.length() != 18) {
            System.out.println("Longitud del CURP incorrecta ");
        }
        
        System.out.println("Ingresa la edad: ");
        edad = sc.nextLine();
        edadtotal = Integer.parseInt(edad);
        int nuevaEdad = edadtotal + 5;
        System.out.println("Esta es la nueva edad: " + nuevaEdad);
    }
}
