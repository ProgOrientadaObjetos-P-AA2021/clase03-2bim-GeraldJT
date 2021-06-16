/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

/**
 *
 * @author USUARIO PC
 */
public class Docente extends Persona {
    private double sueldo;

    public Docente(String n, String a, int e, double s) {
        super(n, a, e);
        sueldo = s;
    }
    public void setSueldo (double r){
        if ( sueldo < 1000){
            sueldo = 1000;
        }else{
            sueldo = r ;
        }
    } 
     public double getSueldo (){
     return sueldo;
     }
     @Override
    public String toString(){
    
        return String.format("%s - %.2f", super.toString(), getSueldo());
    }
}
