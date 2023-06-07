import java.util.*;
public class Vac {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int num=0;
        String nombre= "";
        int anti= 0;
        int clave= 0;
        
        System.out.print("Bienvenido al sistema: ");
        System.out.print(" ");       
        System.out.print("¿Cual es el nombre de trabajador?: ");
        nombre = entrada.nextLine();
        System.out.print(" ");
        System.out.print("¿Cuantos años de servicio tiene el trabajador?: ");
        anti = entrada.nextInt();
        System.out.print("¿Cual es la clave de su departamento?: ");
        clave = entrada.nextInt();
        //entrada de los datos e usa nextLine para meter el nombre y usamos nextInt para meter enteros

        if(clave == 1){
            if(anti == 1){
                System.out.print(nombre + " derecho a 6 días");
            }else if(anti>=2 || anti<=6){
                System.out.print(nombre + " derecho a 14 días");
            }else if(anti ==7){
                System.out.print(nombre + " derecho a 14 días");
            }else{
                System.out.print(nombre + " No tiene derecho a vacaciones");
            }
        }else if(clave == 2){
            if(anti == 1){
                System.out.print(nombre + " derecho a 7 días");
            }else if(anti>=2 || anti<=6){
                System.out.print(nombre + " derecho a 15 días");
            }else if(anti ==7){
                System.out.print(nombre + " derecho a 22 días");
            }else{
                System.out.print(nombre + " No tiene derecho a vacaciones");
            }
        }else if(clave == 3){
            if(anti == 1){
                System.out.print(nombre + " derecho a 10 días");
            }else if(anti>=2 || anti<=6){
                System.out.print(nombre + " derecho a 20 días");
            }else if(anti ==7){
                System.out.print(nombre + " derecho a 30 días");
            }else{
                System.out.print(nombre + " No tiene derecho a vacaciones");
            }
        }else{
            System.out.print("La clave ingresada no es valida ");
        }
    }
}