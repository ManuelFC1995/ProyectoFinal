/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.Jugador;
import Modelo.Portero;
import Modelo.Futbolista;
public interface I_DAO {
    public void insert(Portero p);
    public void insert (Futbolista f);
}
