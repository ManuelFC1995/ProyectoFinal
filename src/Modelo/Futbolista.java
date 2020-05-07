/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Enum.posicion;

/**
 *
 * @author manue
 */
public class Futbolista extends Jugador {
  int n_goles;
  int n_asistencias;
  posicion posicion;
    
  

    public Futbolista(int n_goles, int n_asistencias,posicion posicion, String Nombre, String Nacionalidad, int nacimiento, int puntuacion, String clubes, int n_Titulos, String Titulos, String Titulos_individuales, int N_Partidos) {
        super(Nombre, Nacionalidad, nacimiento, puntuacion, clubes, n_Titulos, Titulos, Titulos_individuales, N_Partidos );
        this.n_goles = n_goles;
        this.n_asistencias = n_asistencias;
        this.posicion=posicion;
        
    }
    
    public void CambiaPosicion(posicion p){
        this.posicion=p;
    }
    
}
