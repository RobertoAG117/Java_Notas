import java.util.*;
public class Matrices4 {
    public static void main(String[]args){
        int [][] matrizA = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] matrizB = {{9,8,7},{6,5,4},{3,2,1}};
        int filas = matrizA.length;
        int columnas = matrizB.length;
        int [][] matrizC = new int [filas][columnas];
        
        System.out.println(" Matriz C: ");
        for (int j = 0; j < filas; j++){
            for (int i=0; i< columnas; i++){
                matrizC [j][i] = matrizA[j][i]+matrizB[j][i];
                System.out.print("["+ matrizC[j][i]+ "]");
                }
                System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" Matriz A: ");
        for (int j = 0; j < filas; j++){
            for (int i=0; i< columnas; i++){
                matrizA [j][i] =matrizA[j][i] ;
                System.out.print("["+ matrizA[j][i]+ "]");
                }
                System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" Matriz B: ");
        for (int j = 0; j < filas; j++){
            for (int i=0; i< columnas; i++){
                matrizB [j][i] =matrizB[j][i] ;
                System.out.print("["+ matrizB[j][i]+ "]");
                }
                System.out.println(" ");
        }
    }
}