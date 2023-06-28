/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.poo2;

/**
 *
 * @author PILARES
 */
import java.util.*;
public class Usuario {
    
    String nombre;
    String folio;
    int edad;
    
        Scanner sc = new Scanner(System.in);
    
    public Usuario(String nombre, String folio, int edad){
        this.nombre=nombre;
        this.folio = folio;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }   
    public String getFolio(){
        return folio;
    }
    public void setFolio(String folio){
        this.folio = folio;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("nombre: "+nombre);
        System.out.println("folio: "+folio);
        System.out.println("edad: "+edad);
    }
    public void modificarDatos(){
        System.out.println("Ingresa el nuevo nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa el nuevo folio: ");
        folio = sc.nextLine();
        System.out.println("Ingresa la nueva edad: ");
        edad= sc.nextInt();
        sc.nextLine();
    }
    public void entrarPrograma(){
        if(edad>18 & edad<29){
            System.out.println("puede entrar al programa");
        }else{
            System.out.println("no puede entrar al programa");
        }
    }
}