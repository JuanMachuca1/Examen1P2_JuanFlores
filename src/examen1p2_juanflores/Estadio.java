/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_juanflores;


public class Estadio {
    private String nombreEs;
    private String ciudad;
    private int capacidad;
    private Equipo equipo = new Equipo();

    public Estadio() {
    }

    public Estadio(String nombreEs, String ciudad, int capacidad) {
        this.nombreEs = nombreEs;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
    }

    
    public String getNombreEs() {
        return nombreEs;
    }

    public void setNombreEs(String nombreEs) {
        this.nombreEs = nombreEs;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Estadio{" + "nombreEs=" + nombreEs + ", ciudad=" + ciudad + ", capacidad=" + capacidad + ", equipo=" + equipo + '}';
    }
    
    
}
