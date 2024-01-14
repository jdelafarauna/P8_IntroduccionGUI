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
public class Coche {
    
    private String nombre;
    private int velocidadR;
    private int velocidadC;
    
    public Coche(String nombre){
        
        this.nombre = nombreValido(nombre);
        this.velocidadR = 0;
        this.velocidadC= 0;
        
    }
    
    public Coche(String nombre,int velocidadR){
        
        this.nombre = nombreValido(nombre);
        this.velocidadR = velocidadValida(velocidadR);
        this.velocidadC = 0;
        
    }
    public Coche(String nombre,int velocidadR, int velovidadC){
        
        this.nombre = nombre;
        this.velocidadR = velocidadValida(velocidadR);
        this.velocidadC = velocidadValida(velocidadC);
        
    }
    
    public Coche(String nombre, Coche coche){
        
        this.nombre = nombre;
        this.velocidadR = coche.getVelocidadR();
        this.velocidadC = coche.getVelocidadC();
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getVelocidadR(){
        return this.velocidadR;
    }
    
    public int getVelocidadC(){
        return velocidadC;
    }
    
    public void setVelRecta(int velocidad){
        this.velocidadR = velocidad;
    }
    
    public void setVelCurva(int velocidad){
        this.velocidadC = velocidad;
    }
    
    private String nombreValido(String nombre){
        
        if (nombre == null){
            return "";
        }else{
            return nombre;
        }
        
    }
    private int velocidadValida(int velocidad){
     
        if(velocidad >= 0){
            return velocidad;
        }else{
            throw new RuntimeException("Velocidad no valida.");
        }
        
    }
    
    public void aceleraRecta(){
        
        setVelRecta(this.velocidadR + 5);
        
    }
    public void aceleraCurva(){
        
        setVelCurva(this.velocidadC + 5);
        
    }
    public void frenaRecta(){
        
        setVelRecta(this.velocidadR - 5);
        
    }
    public void frenaCurva(){
        
        setVelCurva(this.velocidadC - 5);
        
    }
    
    public void mejora(){
        
        setVelRecta(this.velocidadR + 15);
        setVelCurva(this.velocidadC + 15);
    }
    
    public double calcularTiempoRecta(double kilometros){
        if (this.velocidadR == 0){
            return -1;
        }else{
            return (((kilometros * 1)/this.velocidadR)*60)*60;
        }
    }
    
    public double calcularTiempoCurva(double kilometros){
        if (this.velocidadC == 0){
            return -1;
        }else{
            return (((kilometros * 1)/this.velocidadC)*60)*60;
        }
    }
    public boolean esDetenido(){
        return this.velocidadR == 0 || this.velocidadC == 0;
    }
    
    public double vueltaCircuito(Circuito circuito){
        
        if(!(this.esDetenido())){
            return calcularTiempoRecta(circuito.getRectas()) + calcularTiempoCurva(circuito.getCurvas());
        }else{
            return -1;
        }
        
    }
    
    public Resultado competir(Coche coche2,Circuito circuito, int vueltas){
        
        
        
        int tiempo1 = ((int)this.vueltaCircuito(circuito)) * vueltas;
        
        
        int tiempo2 = ((int)coche2.vueltaCircuito(circuito)) * vueltas;
        
        Resultado resultado = new Resultado(this,tiempo1,coche2,tiempo2);
        
        return resultado;
        
    }
}
