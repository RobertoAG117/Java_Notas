/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PILARES
 */
public class Ordenamiento {

        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], elementos, auxiliar, posicion;
        int i;
        elementos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de elmentos"));
        arreglo=new int [elementos];
        
        // int arreglo[5]; para definir un tamaño estandar
        for(i=0; i<elementos; i++){
            System.out.println("ingresa el elemento: "+i);
            arreglo[i]=sc.nextInt();
            
        }
             //ordenamiento de burbuja
        for(int j=0; j<(elementos-1); j++){
            for(int k=0;k<(elementos-1);k++){
                if(arreglo[k]>arreglo[k+1]){
                    auxiliar=arreglo[k];
                    arreglo[k]=arreglo[k+1];
                    arreglo[k+1]=auxiliar;
                    
                }
            }
        }
        
        for(int j=0; j<elementos; j++){
        System.out.println(arreglo[j]);
        }
        
    }
    
}
