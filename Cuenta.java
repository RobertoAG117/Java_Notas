/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;
import java.util.*;
/**
 *
 * @author PILARES
 */
public class Cuenta {
    String nombre;
    double cantidad;
    double saldo;    
    int opcion;
    Scanner sc = new Scanner(System.in);
    
    public Cuenta(String nombre, double cantidad){
        this.nombre=nombre;
        this.cantidad = cantidad;
        
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Double getCantidad(){
        return cantidad;
    }
    public void setCantidad(Double Cantidad){
        this.cantidad = cantidad;
    }
    public void mostrarDatos(){
        System.out.println("nombre: "+nombre);
        System.out.println("cantidad: "+cantidad);   
    }
    public void modificarDatos(){
        System.out.println("Quieres retirar o depositar: ");
        System.out.println("Depositar opcion 1: ");
        System.out.println("Depositar opcion 2: ");
        
        switch(opcion){
            case 1:
                    System.out.println("Ingresa la cantidad a depositar: ");
                saldo= sc.nextDouble();
                cantidad= (cantidad + saldo);
                System.out.println("Tu nueva es: " + cantidad );
                break;
            case 2:
                    System.out.println("Ingresa la cantidad a retirar ");
                saldo= sc.nextDouble();
                cantidad= (cantidad - saldo);
                System.out.println("Tu nueva es: " + cantidad);
                break;
            default:
                System.out.println("Opcion inexistente");
                break;
        }
    }
    
    
    
}