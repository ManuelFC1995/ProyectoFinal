/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author manue
 */
public class Partido {
   private Equipo EquipoLocal;
   private Equipo EquipoVisitante;
   private int LocalGoles;
   private int VisitanteGoles;

    public Partido(Equipo EquipoLocal, Equipo EquipoVisitante) {
        this.EquipoLocal = EquipoLocal;
        this.EquipoVisitante = EquipoVisitante;
        LocalGoles=GolesLocal();
        VisitanteGoles=GolesVisitante();
    }
   
   

    public Equipo getEquipoLocal() {
        return EquipoLocal;
    }

    public void setEquipoLocal(Equipo EquipoLocal) {
        this.EquipoLocal = EquipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void setEquipoVisitante(Equipo EquipoVisitante) {
        this.EquipoVisitante = EquipoVisitante;
    }

    public int getResultado1() {
        return resultado1;
    }

    public void setResultado1(int resultado1) {
        this.resultado1 = resultado1;
    }

    public int getResultado2() {
        return resultado2;
    }

    public void setResultado2(int resultado2) {
        this.resultado2 = resultado2;
    }
   int resultado1=0;
   int resultado2=0;

    public Partido() {
    }
   
   

  

    

  public int GolesLocal(){
      
      int goles=0;
    if(  EquipoLocal!=null){
      int mediaLocal= EquipoLocal.CalculaMedia();
      
    }
      
    return goles;  
  }  
  public int GolesVisitante(){
      int goles=0;
      
      
      
      return goles;
  }  

    @Override
    public String toString() {
        return  EquipoLocal.getNombre()+""+""+GolesLocal()+"-"+GolesVisitante()+""+""+EquipoVisitante.getNombre();
                
    }
    
}
