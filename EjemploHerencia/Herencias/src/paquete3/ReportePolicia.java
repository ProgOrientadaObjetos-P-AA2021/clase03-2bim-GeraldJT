/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author USUARIO PC
 */
public class ReportePolicia extends Reporte{
    double promedioE;
    ArrayList <Policia> lista;

    public ReportePolicia(String c, ArrayList<Policia> l) {
        super(c);
        setListaPol (l);
    }

public void setPromedioEd(){
        double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getEdad();
        }
        promedioE = suma/ lista.size();
    }
    public double getPromedioEd(){
        return promedioE;
    }
    public void setListaPol ( ArrayList <Policia> l){
        lista = l;
    }
    public  ArrayList<Policia> getListaPol (){
        return lista;
    }
    public String toString(){
        String cadenaF = "";
        cadenaF = String.format("%s\nReporte Estudiantes:\n", super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadenaF = String.format("%s\nNombre:%s\nApellido:%s\nRango:%s\nEdad:"
                    + "%d\n",cadenaF,
                    getListaPol().get(i).getNombre(),
                    getListaPol().get(i).getApellido(),getListaPol().get(i).
                            getRango(),getListaPol().get(i).getEdad());
        }
         cadenaF = String.format("\n%sPromedio de Sueldos: %.2f", cadenaF, 
                getPromedioEd());
        return cadenaF;
    }
}