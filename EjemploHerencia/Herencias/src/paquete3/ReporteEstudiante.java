/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;
/**
 *
 * @author USUARIO PC
 */

public class ReporteEstudiante extends Reporte {
    double promedioM;
    ArrayList <Estudiante> lista;
    public ReporteEstudiante (String c, ArrayList<Estudiante> l){
        super (c);
        setListaEst(l);
    }
    
    public void setPromedioMat(){
       double suma = 0;
        for(int i = 0; i < lista.size(); i++){
            suma = suma + lista.get(i).getMatricula();
        }
        promedioM = suma / lista.size();
    }
    public double getPromedioMat(){
        return promedioM;
    }
    public void setListaEst ( ArrayList <Estudiante> l){
        lista = l;
    }
    public  ArrayList<Estudiante> getListaEst (){
        return lista;
    }
    public String toString(){
        String cadenaF = "";
        cadenaF = String.format("%s\nReporte Estudiantes:\n", super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadenaF = String.format("%s\nNombre:%s\nApellido:%s\nEdad:%d\n"
                    + "Matricula: %.2f\n",cadenaF, getListaEst().get(i).getNombre(),
                    getListaEst().get(i).getApellido(),getListaEst().get(i).
                            getEdad(),getListaEst().get(i).
                            getMatricula());
        }
         cadenaF = String.format("%s\nPromedio de Matriculas: %.2f", cadenaF, 
                getPromedioMat());
        return cadenaF;
    }
}
