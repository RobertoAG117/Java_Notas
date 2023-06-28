/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.poo2;
import java.util.ArrayList;
/**
 *
 * @author PILARES
 */
public class POO2 {
    
    public static void main(String[] args){
        ArrayList<Usuario> usuariosActuales = new ArrayList();
        
        Usuario usuario1 = new Usuario("juan","folio1",23);
        usuariosActuales.add(usuario1);
        
        Usuario usuario2 = new Usuario("pedro","folio2",15);
        usuariosActuales.add(usuario2);
        
        Usuario usuario3 = new Usuario("miguel","folio3",35);
        usuariosActuales.add(usuario3);
        
        Usuario usuario4 = new Usuario("juan","folio4",33);
        usuariosActuales.add(usuario4);
        
        System.out.println("el total de usuarios es: "+usuariosActuales.size());
        
        
        
        //System.out.println( usuario1.getNombre());
        
        //usuario1.mostrarDatos();
        //usuario1.modificarDatos();
        //usuario1.mostrarDatos();
        
        //usuario1.entrarPrograma();/*
    }
    
}
