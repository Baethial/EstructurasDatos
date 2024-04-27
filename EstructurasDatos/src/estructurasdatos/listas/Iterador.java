/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.listas;

/**
 *
 * @author sehjud
 */
public class Iterador {
    
    private Elemento iterable=null;

    public Iterador(Elemento elemento) {
        this.iterable = elemento;
    }
    
    
    public void siguiente(){
        if(tieneSiguiente()){
            setIterable(getIterable().getSig());
        }
    }
    
    public boolean tieneSiguiente(){
        if(getIterable()!=null){
            if(getIterable().getSig()!=null){
                return true;
            }
        }
        return false;
    }
    
    public void remover(){
        iterable.setSig(iterable.getSig().getSig());
    }

    /**
     * @return the iterable
     */
    public Elemento getIterable() {
        return iterable;
    }

    /**
     * @param iterable the iterable to set
     */
    public void setIterable(Elemento iterable) {
        this.iterable = iterable;
    }
    
}
