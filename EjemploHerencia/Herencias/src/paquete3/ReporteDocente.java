/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author USUARIO PC
 */
public class ReporteDocente extends Reporte {
    double promedioS ;
    ArrayList <Docente> lista;

    public ReporteDocente(String c, ArrayList<Docente> l) {
        super(c);
        setListaDocen(l);
    }
    
    public void setPromedioSue(){
       double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getSueldo();
        }
        promedioS = suma/ lista.size();
    }
    public double getPromedioSue(){
        return promedioS;
    }
    public void setListaDocen ( ArrayList <Docente> l){
        lista = l;
    }
    public  ArrayList<Docente> getListaDocen (){
        return lista;
    }
     public String toString(){
        String cadenaF = "";
        cadenaF = String.format("%s\nReporte Docente:\n", super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadenaF = String.format("%s\nNombre:%s\nApellido:%s\nEdad:%s\n"
                    + "Sueldo: %.2f\n",cadenaF,getListaDocen().get(i).getNombre(),
                    getListaDocen().get(i).getApellido(),getListaDocen().get(i).
                            getEdad(),getListaDocen().get(i).
                            getSueldo());
        }
        cadenaF = String.format("\n%sPromedio de Sueldos: %.2f", cadenaF, 
                getPromedioSue());
        return cadenaF;
    }
}
