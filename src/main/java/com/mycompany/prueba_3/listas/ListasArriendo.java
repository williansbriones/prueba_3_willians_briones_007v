
package com.mycompany.prueba_3.listas;

import com.mycompany.prueba_3.mto.Arriendos;
import java.util.ArrayList;


public class ListasArriendo {
    
   private ArrayList<Arriendos> listaArriendo;

    public ListasArriendo(ArrayList<Arriendos> listaArriendo) {
        this.listaArriendo = listaArriendo;
    }
   public ListasArriendo() {
        this.listaArriendo = new ArrayList();
   
   
   }

    public ArrayList<Arriendos> getListaArriendo() {
        return listaArriendo;
    }

    public void setListaArriendo(ArrayList<Arriendos> listaArriendo) {
        this.listaArriendo = listaArriendo;
    }

    
    
    public void GuardarArriendos(Arriendos a){
        
            listaArriendo.add(a);
        
        }
    
    
   
   
    
   
    
}
