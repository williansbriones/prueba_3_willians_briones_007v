
package com.mycompany.prueba_3.listas;

import com.mycompany.prueba_3.mto.Vendedor;
import java.util.ArrayList;

public class listaVendedor {
    
    private ArrayList<Vendedor> listavendedor;

    public listaVendedor(ArrayList<Vendedor> listavendedor) {
        this.listavendedor = listavendedor;
    }
   public listaVendedor() {
        this.listavendedor = new ArrayList();
   
   
   }

    public ArrayList<Vendedor> getListaArriendo() {
        return listavendedor;
    }

    public void setListaArriendo(ArrayList<Vendedor> listaArriendo) {
        this.listavendedor = listaArriendo;
    }

    
    
    public void GuardarArriendos(Vendedor a){
        
            listavendedor.add(a);
        
        }
    
    
}
