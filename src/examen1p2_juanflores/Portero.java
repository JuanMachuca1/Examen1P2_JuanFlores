/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_juanflores;

import java.util.Random;
import java.util.Scanner;



public class Portero extends Jugador{
    static Random ran = new Random();
    static Scanner leer = new Scanner(System.in);
    public Portero(String nombre, int edad, String nacionalidad, String pieHabil, String equipo) {
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
        int numero = random();
        while(numero<70 && numero>=100){
            
            numero = random();
            
        }
        this.agarre=numero;
    }

   
    @Override
    public void setLanzamiento() {
         int numeroLan = random();
        while(numeroLan<70 && numeroLan>=100){
            
            numeroLan = random();  
        }
         this.lanzamiento=numeroLan;
    }

    
    @Override
    public void setFisico() {
        int numeroFi = random2();
        
        this.fisico=numeroFi;
    
    }

   
    @Override
    public void setRitmo() {
        int numeroRi = random2();
        
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
        
         int numeroPas = random();
        while(numeroPas<=70 && numeroPas>=100){
            numeroPas = random();           
        }
        this.passing=numeroPas;
    }

    
    @Override
    public void setRegate() {
        int numeroRe = random2();
        
        this.regate=numeroRe;

    }

    
    
    @Override
    public void setDisparo() {
        int numeroDi = random2();
        
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
