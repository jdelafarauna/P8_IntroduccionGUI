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
public class Resultado {
    
    private ArrayList<Datos> resultados;
    
    
    public Resultado(Coche coche1, int tiempo1, Coche coche2, int tiempo2){
        
        resultados = new ArrayList<Datos>();
        
        Datos datos1 = new Datos(coche1,tiempo1);
        resultados.add(datos1);
        
        Datos datos2 = new Datos(coche2,tiempo2);
        resultados.add(datos2);
    }
    
    public void añadir(Coche coche, int tiempo){
     
        Datos datos = new Datos(coche,tiempo);
        resultados.add(datos);
        
    }

    public String ganador(){
        
        if((this.getDatos(0).getTiempo())< (this.getDatos(1).getTiempo())){
            
            return this.getDatos(0).toString();
        
        }else if ((this.getDatos(0).getTiempo()) > (this.getDatos(1).getTiempo())){
        
            return this.getDatos(1).toString();
        
        }else{
        
            return "Empate!";
        
        }
        
    }
    
    
    public Datos getDatos(int index){
            
            return resultados.get(index);
            
        }

    
      
    public class Datos{
            
            private Coche coche;
            private int tiempo;

        public Datos(Coche coche, int tiempo){

            this.coche = coche;
            this.tiempo = tiempo;

        }
        
        public int getTiempo(){
            
            return tiempo;
        
        }

        @Override
        public String toString() {
            return "Datos{" + "coche=" + coche.getNombre() + ", tiempo=" + tiempo + '}';
        }
        
        
}
          
}


