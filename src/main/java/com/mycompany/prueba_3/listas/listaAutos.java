
package com.mycompany.prueba_3.listas;

import com.mycompany.prueba_3.mto.auto;
import java.util.ArrayList;


public class listaAutos {
    
    public class listaVendedor {
    
    private ArrayList<auto> listaAutos;

    public listaVendedor(ArrayList<auto> listavendedor) {
        this.listaAutos = listavendedor;
    }
   public listaVendedor() {
        this.listaAutos = new ArrayList();
   
   
   }

    public ArrayList<auto> getListaArriendo() {
        return listaAutos;
    }

    public void setListaArriendo(ArrayList<auto> listaArriendo) {
        this.listaAutos = listaArriendo;
    }

    
    
    public void GuardarArriendos(auto a){
        
            listaAutos.add(a);
        
        }
    
    
    
    }
}
