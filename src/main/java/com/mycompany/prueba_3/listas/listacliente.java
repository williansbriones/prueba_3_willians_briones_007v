
package com.mycompany.prueba_3.listas;

import com.mycompany.prueba_3.mto.Cliente;
import java.util.ArrayList;


public class listacliente {
    
    private ArrayList<Cliente> listacliente;

    public listacliente(ArrayList<Cliente> listacliente) {
        this.listacliente = listacliente;
    }
   public listacliente() {
        this.listacliente = new ArrayList();
   
   
   }

    public ArrayList<Cliente> getListaArriendo() {
        return listacliente;
    }

    public void setListaArriendo(ArrayList<Cliente> listaArriendo) {
        this.listacliente = listaArriendo;
    }

    
    
    public void GuardarArriendos(Cliente a){
        
            listacliente.add(a);
        
        }
    
    
}
