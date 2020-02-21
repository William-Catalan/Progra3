package Clase;

class Nodo 
{
    int dato;
    Nodo siguiente;
    
    public Nodo(int pdato)
    {
        dato = pdato;
        siguiente = null;
    }
    
    public Nodo(int pdato, Nodo psiguiente)
    {
        dato = pdato;
        siguiente = psiguiente;
    }
    
   
    public int recorrer()
    {
        return dato;
    }
    
    
}
