/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tarea03031.servicio;

import Tarea03031.modelo.Personaje;
import java.util.List;

/**
 *
 * @author HP OME
 */
public interface IPersonajeServicio {
    
    public Personaje crear (Personaje personaje);
    public List<Personaje> listar();
}
