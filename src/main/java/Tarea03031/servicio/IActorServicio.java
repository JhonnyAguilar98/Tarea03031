/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tarea03031.servicio;

import Tarea03031.modelo.Actor;
import java.util.List;

/**
 *
 * @author HP OME
 */
public interface IActorServicio {
    
    public Actor crear (Actor actor);
    public List<Actor> listar();
}
