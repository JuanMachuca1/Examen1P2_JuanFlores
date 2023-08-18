/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_juanflores;


public abstract class Jugador {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String pieHabil;
    protected int rating;
    private String equipo;
    
    protected int agarre;
    protected int lanzamiento;
    protected int fisico;
    protected int ritmo;
    protected int entrada;
    protected int vision;
    protected int passing;
    protected int regate;
    protected int disparo;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String nacionalidad, String pieHabil, int rating, String equipo, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.rating = rating;
        this.equipo = equipo;
        this.agarre = agarre;
        this.lanzamiento = lanzamiento;
        this.fisico = fisico;
        this.ritmo = ritmo;
        this.entrada = entrada;
        this.vision = vision;
        this.passing = passing;
        this.regate = regate;
        this.disparo = disparo;
    }

    public Jugador(String nombre, int edad, String nacionalidad, String pieHabil, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.rating = rating;
        this.equipo = equipo;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public int getRating() {
        return rating;
    }

    public abstract void setRating(); 

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public abstract void setAgarre(); 
       
    

    public int getLanzamiento() {
        return lanzamiento;
    }

   public abstract void setLanzamiento(); 

    public int getFisico() {
        return fisico;
    }

    public abstract void setFisico(); 

    public int getRitmo() {
        return ritmo;
    }

    public abstract void setRitmo(); 

    public int getEntrada() {
        return entrada;
    }

    public abstract void setEntrada(); 

    public int getVision() {
        return vision;
    }

    public abstract void setVision(); 

    public int getPassing() {
        return passing;
    }

    public abstract void setPassing(); 

    public int getRegate() {
        return regate;
    }

    public abstract void setRegate(); 

    public int getDisparo() {
        return disparo;
    }

    public abstract void setDisparo(); 

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", pieHabil=" + pieHabil + ", rating=" + rating + ", equipo=" + equipo + ", agarre=" + agarre + ", lanzamiento=" + lanzamiento + ", fisico=" + fisico + ", ritmo=" + ritmo + ", entrada=" + entrada + ", vision=" + vision + ", passing=" + passing + ", regate=" + regate + ", disparo=" + disparo + '}';
    }
    
    
}
