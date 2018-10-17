/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

import java.sql.Time;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Consumo {
   private float km,litros,vMed,pGas;

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public Consumo() {
    }

    public void setKm(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public void setvMed(float vMed) {
        this.vMed = vMed;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
    }
    

    public float getTempo(){
        
        return this.km/this.vMed;  // devuelve en horas el tiempo que ha llevado el viaje
    
    }
    
    public float consumoMedio(){ // litros por cada 100 km.
        float consumo;
        
       consumo = this.litros/ this.km*100;
        
    
    return consumo;
    }
    
    
    public float consumoEuros (){
    float consEur;
    consEur = this.consumoMedio() * pGas;
    
    
    
    return consEur;
    }

    public float getvMed() {
        return vMed;
    }
    
    
}
