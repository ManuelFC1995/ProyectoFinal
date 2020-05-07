/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public interface Iequipo {
    public boolean AlineDefensa(Futbolista f);
    public boolean AlineaCentroCampista(Futbolista f);
    public boolean AlineaDelantero(Futbolista f);
    public boolean AlienaPortero(Portero p);
    public int CalculaMedia();
   public boolean equipolleno();
}
