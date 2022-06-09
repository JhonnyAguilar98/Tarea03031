/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea03031.servicio;

import Tarea03031.modelo.Personaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP OME
 */
public class PersonajeServicio implements IPersonajeServicio {
    
    private static List<Personaje> personajeList = new ArrayList<>();

    @Override
    public Personaje crear( Personaje personaje) {
        this.personajeList.add(personaje);
        return personaje;
    }
    
    public List<Personaje> listar(){
        return this.personajeList;
    }  
    
}
