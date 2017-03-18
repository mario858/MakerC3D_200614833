package org.compi2.codigo3d.parser;
import java.util.ArrayList;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    
    private static int temp1 = 0;
    private static ArrayList<String> listaVerdaderas = new ArrayList<String>();
    private static ArrayList<String> listaFalsas = new ArrayList<String>();
    
    
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    public static String generarL(){
    
        return "L"+ temp1++;
    
    }
    
    public static void agregarVerdaderas(String verdadero){
    
        listaVerdaderas.add(verdadero);
    }
    
    public static void agregarFalsas(String falso){
    
        listaFalsas.add(falso);
    }
    
    public static String devolverVerdaderas(){
        
        String etiquetasVerdaderas = "";
        
        for(int i = 0; i < listaVerdaderas.size(); i++){
            
            etiquetasVerdaderas += listaVerdaderas.get(i) + " ";
        }
        
        return etiquetasVerdaderas;
    }
    
    public static void VaciarFalsas(){
    
        listaFalsas.clear();
    }
    
    public static void VaciarVerdaderas(){
    
        listaVerdaderas.clear();
    }
    
    public static String devolverFalsas(){
        
        String etiquetasFalsas = "";
        
        for(int i = 0; i < listaFalsas.size(); i++){
            
            etiquetasFalsas += listaFalsas.get(i) + " ";
        }
        
        return etiquetasFalsas;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    } 
}
