/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_juanflores;

import java.util.ArrayList;


public class Equipo {
    private String nombreEq;
    private String pais;
    private int rating;
    private ArrayList<Jugador> Plantilla = new ArrayList();

    public Equipo() {
        
    }

    public Equipo(String nombreEq, String pais) {
        this.nombreEq = nombreEq;
        this.pais = pais;
        setRating();
    }
    

    public String getNombre() {
        return nombreEq;
    }

    public void setNombre(String nombre) {
        this.nombreEq = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return rating;
    }

    public void setRating() {
         int acum=0; 
         int rat=0;
        for (Jugador jugador : Plantilla) {
            
            acum+=jugador.getRating();
            
            rat=acum/Plantilla.size();
        }
        
        this.rating=rat;
    }

    public ArrayList<Jugador> getPlantilla() {
        return Plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> Plantilla) {
        this.Plantilla = Plantilla;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombreEq + ", pais=" + pais + ", rating=" + rating + ", Plantilla=" + Plantilla + '}';
    }
    
    
    
}
