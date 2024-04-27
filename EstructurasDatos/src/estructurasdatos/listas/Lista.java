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
public class Lista<E> {
    
    private Elemento<E> inicio = null;
    private Elemento<E> fin = null;
    private Iterador iterador;
    private int tamano=0;
    
    public boolean estaVacia(){
        if(tamano != 0){
            return false;
        }
        return true;
    }
    
    public void agregar(E elemento){
        tamano++;
        Elemento<E> nuevo = new Elemento<E>(elemento);
        if(inicio==null){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.agregarSiguiente(nuevo);
            fin = fin.getSig();
        }
    }
    
    public boolean buscar(E elemento){
        iterador = new Iterador(inicio);
        if(inicio!=null&&iterador.getIterable().getElemento().equals(elemento)){
            return true;
        }
        while(iterador.tieneSiguiente()){
            if(iterador.getIterable().getSig().getElemento().equals(elemento)){
                return true;
            }
            iterador.siguiente();
        }
        return false;
    }
    
    public boolean borrar(E elemento){
        if(buscar(elemento)){
            if(iterador.getIterable().equals(inicio)){
                if(iterador.tieneSiguiente()){
                    inicio = inicio.getSig();
                    return true;
                }else{
                    inicio = null;
                    fin = null;
                    return true;
                }
            }else{
                iterador.remover();
                return true;
            }
        }
        return false;
    }
    
    public boolean borrar(int posicion){
        if(posicion>tamano){
            return false;
        }
        if(posicion==0){
            if(inicio.getSig()!=null){
                inicio = inicio.getSig();
                return true;
            }else{
                inicio = null;
                fin = null;
                return true;
            }
        }else{
            iterador = new Iterador(inicio);
            while(iterador.tieneSiguiente()){
                if(posicion--==1){
                    iterador.remover();
                    return true;
                }
                iterador.siguiente();
            }
        }
        return false;
    }
    
}
