
package colas;


public class Cola {
    
    NodoCola inicio  , fin;
    
    int tamanio;
    
    public Cola(){
        
        inicio = fin = null;
        tamanio = 0;
    }
    
    public boolean estaVacia(){
        
        return inicio == null;
    }
    
    public void Insertar(int elmento){
        
        NodoCola nuevo = new NodoCola(elmento);
        
        if(estaVacia()){
            
            inicio = nuevo;
            
        }else{
            
            fin.siguiente = nuevo;
        }
        
        fin = nuevo;
        tamanio++;
    }
    
    public int quitar(){
        
        int aux = inicio.dato;
        
        inicio = inicio.siguiente;
        tamanio--;
        return aux;
        
    }
    
}
