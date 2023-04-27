/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import EjercicioClase3.Peliculas;
public class EjecutorUno {

    public static void main(String[] args) {
        
        Peliculas p1 = new Peliculas();
        p1.setVersion(18);
        System.out.println(p1.getVersion());
        
        p1.setPresupuesto(99);
        System.out.println(p1.getPresupuesto());
        
    }
    
}
