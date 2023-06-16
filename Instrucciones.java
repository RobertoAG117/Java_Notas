import java.util.Scanner;
public class Instrucciones{
    public static void main(String[]args){
        Scanner semana = new Scanner(System.in);
        int dia;
        System.out.print("Introduce un número del 1 al 7 para conocer el día de la semana ");
        dia = semana.nextInt();
        switch(dia){
            case 1:
                System.out.println("Ingresaste el dia 1 que es el Lunes");
                break;
            
            case 2:
                System.out.println("Ingresaste el dia 2 que es el Martes");
                break;
            
            case 3:
                System.out.println("Ingresaste el dia 3 que es el Miercoles");
                break;
            
            case 4:
                System.out.println("Ingresaste el dia 4 que es el Jueves");
                break;
            
            case 5:
                System.out.println("Ingresaste el dia 5 que es el Viernes");
                break;
            
            case 6:
                System.out.println("Ingresaste el dia 6 que es el Sabado");
                break;
            
            case 7:
                System.out.println("Ingresaste el dia 7 que es el Domingo");
                break;
            
            default: 
                System.out.println("Opcion incorrecta");
            
        }
    }
}