/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea03031.controlador;


import Tarea03031.modelo.Personaje;
import Tarea03031.servicio.PersonajeServicio;
import java.util.List;

/**
 *
 * @author HP OME
 */

public class PersonajeControl {
   
    private final PersonajeServicio personajeServicio = new PersonajeServicio();
    
    public Personaje crear(String [] args){
        var personaje= new Personaje(Integer.valueOf(args[0]),args[1],args[2]);
        this.personajeServicio.crear(personaje);
        return personaje;
    }
    
    public List<Personaje> listar(){
        return this.personajeServicio.listar();
    }
    
} 

