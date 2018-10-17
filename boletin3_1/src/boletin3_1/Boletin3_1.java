/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin3_1 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Consumo cons = new Consumo();
        cons.setLitros(50);
        cons.setpGas(1.57f);
        
        
        Consumo cons2 = new Consumo(50f,6f,80f,1.57f);
        System.out.println(" Consumo medio cons2 = " + cons2.consumoMedio());
        
        cons2.setLitros(20);
        System.out.println("vMed = "+ cons2.getvMed());
        
    }
    
}
