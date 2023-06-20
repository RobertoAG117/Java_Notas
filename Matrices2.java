import java.util.*;
public class Matrices2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int columnas=0;
        int filas=0;
        System.out.print("Bienvenido al Programa de matrices: ");
        System.out.print(" ");
        System.out.print("¿Cuantas columnas quieres?: ");
        columnas = sc.nextInt();
        sc.nextLine();
        System.out.print(" ");
        System.out.print("¿Cuantas filas quieres?: ");
        filas = sc.nextInt();
        sc.nextLine();
        int numeros[][]=new int[columnas][filas];

        int dato= 1;
        for(int j=0; j< filas; j++){
            for(int i=0; i<columnas; i++){
                numeros[j][i]=dato;
                dato++;
                System.out.print("["+numeros[j][i]+ "]");
            }
            System.out.println(" ");
        }
        
        
    }
}