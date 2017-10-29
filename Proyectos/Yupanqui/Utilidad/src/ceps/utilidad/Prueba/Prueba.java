/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceps.utilidad.Prueba;

import ceps.utilidad.Service.Utilidad;

public class Prueba {

    private static Utilidad utilidadService;
    
    
    public static void main(String[]  args)
            {
                String curso= "Desarrollo Web con Java";
                String Nivel="intermedio";
                int  vacantes= 20;
                
                
                utilidadService= new Utilidad ();
                
                double Itotal= Service.Itotal(Nivel,vacantes);
                double Utilidad= Service.Itotal(Itotal, descuento);
                
                        
             System.out.println("input")  ;
             System.out.println("Nivel" + Nivel)  ;
             System.out.println("vacantes" + vacantes)  ;
                   
             
             
             System.out.println("output")  ;
             System.out.println("Itotal" + Itotal)  ;
             System.out.println("Utilidad" + Utilidad)  ;
             
             
             
             
             
             
}    
}
