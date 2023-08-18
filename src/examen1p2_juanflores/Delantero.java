/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_juanflores;

import java.util.Random;
import java.util.Scanner;

public class Delantero extends Jugador{
    static Random ran = new Random();
    static Scanner leer = new Scanner(System.in);
    public Delantero(String nombre, int edad, String nacionalidad, String pieHabil, String equipo) {
        super(nombre, edad, nacionalidad, pieHabil, equipo);
        
        setAgarre();
        setLanzamiento();
        setFisico();
        setRitmo();
        setEntrada();
        setVision();
        setPassing();
        setRegate();
        setDisparo();
        setRating();  
    }

    
    @Override
    public void setAgarre() {
         int numero = random2();
        
        this.agarre=numero;
    }

   
    @Override
    public void setLanzamiento() {
        int numeroLan = random2();
        
        this.lanzamiento=numeroLan;
    }

    
    @Override
    public void setFisico() {
       int numeroFi = random2();
        
        this.fisico=numeroFi;
    }

   
    @Override
    public void setRitmo() {
           int numeroRi = random();
        while(numeroRi<70 && numeroRi>=100){
            
            numeroRi = random();
            
        }
        this.ritmo=numeroRi;
    }

    
    @Override
    public void setEntrada() {
         int numeroEn = random2();
        
        this.entrada=numeroEn;
    }

    
    @Override
    public void setVision() {
        int numeroVi = random2();
        
        this.vision=numeroVi;
    }

    
    @Override
    public void setPassing() {
        
         int numeroPa = random2();
        
        this.passing=numeroPa;
    }

    
    @Override
    public void setRegate() {
         int numeroRe = random();
        while(numeroRe<70 && numeroRe>=100){
            
            numeroRe = random();
            
        }
        this.regate=numeroRe;

    }

    
    
    @Override
    public void setDisparo() {
           int numeroDi = random();
        while(numeroDi<70 && numeroDi>=100){
            
            numeroDi = random();
            
        }
        this.disparo=numeroDi;

    }

    @Override
    public void setRating() {

        this.rating = (agarre+disparo+entrada+fisico+lanzamiento+passing+rating+regate+ritmo+vision)/9;
        
    }
     
    
    
    public int random(){
        int total = 0;
        int num = 1+ran.nextInt(12);
        
        total = num*12;
        
        return num;
    }
    
    public int random2(){
        int total2 = 0;
        int num2 = 1+ran.nextInt(5);
        
        total2 = num2*13;
        
        return num2;
    }
    
    
    
}
