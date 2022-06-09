/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea03031.controlador;

import Tarea03031.modelo.Actor;
import Tarea03031.servicio.ActorServicio;
import java.util.List;

/**
 *
 * @author HP OME
 */

public class ActorControl {
        private final ActorServicio actorServicio = new ActorServicio();
    
    public Actor crear(String [] args){
        var actor = new Actor(Integer.valueOf(args[0]),args[1],args[2]);
        this.actorServicio.crear(actor);
        return actor;
    }
    
    public List<Actor> listar(){
        return this.actorServicio.listar();
    }
}
