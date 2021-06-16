/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author USUARIO PC
 */
public class Reporte  {
    protected String codigo;
    public Reporte (String c){
        codigo = c;
    }

    public void setCodigo(String c){
     codigo = c;
    }
    public String getCodigo(){
        return codigo;
    }
    public String toString(){
     return String.format("Codigo: %s", getCodigo() );   
    }
}

