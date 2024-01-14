/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p8_introducciongui;
import java.util.*;
/**
 *
 * @author josedelafuente
 */
public class Circuito {
    
    private double[] rectas;
    private double[] curvas;
    
    
    public Circuito(double[] rectas,double[] curvas){
        
       
        this.rectas = new double[20]; //rectas;
        this.curvas = new double[20] ;//curvas;
        
        this.rectas = rectas;
        this.curvas = curvas;
    }

    public double getRectas(){
        
        int suma = 0;
        for(int i = 0 ; i < (this.rectas.length); i ++){
            suma += this.rectas[i];
        }
        return suma;
    }
    
    public double getCurvas(){
        int suma = 0;
        for(int i = 0 ; i < (this.curvas.length); i ++){
            suma += this.curvas[i];
        }
        return suma;
    }

}

