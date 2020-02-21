package Clase;

public class Pila 
{
    protected Nodo Inicio, Final;
    
    public void Apilar(int pdato)
    {
      if(Inicio == null)
        {
            Inicio = new Nodo(pdato);
          
        }
        
        else
        {
            Inicio = new Nodo(pdato,Inicio);
        }
    }
    
    public void IngresarFinal(int pdato)
    {
        Nodo aux = Inicio;
        
        if(Inicio != null)
        {
            while(aux.siguiente !=null)
            {
                aux = aux.siguiente;
                Final = new Nodo(pdato);
            }
            
            aux.siguiente = Final;
        } 
    }
    
     public void EliminarInicio()
    {
        //Nodo aux = inicio
        if(Inicio == null)
        {
            System.out.println("Lista Vacia");
        }
        else
        {
            //nodo aux = inicio
            Inicio = Inicio.siguiente;
        }
    } 
    
    public Nodo DarUltimo()
    {
        Nodo aux = Inicio;
        
        if(Inicio != null)
        {
            while(aux.siguiente != null)
            {
                aux = aux.siguiente;
            }
        }
        
        else
        {
            System.out.println("Pila Vacia");
            return null;
        }
        
        return aux;
    }
    
    public void EliminarFinal()
    {
        Nodo aux = Inicio;
        
        if(aux.siguiente != null)
        {
            aux = aux.siguiente;
        }
            
        aux.siguiente = null;
    }
    
    public void RemplazaralFinal(int pdato)
    {
        Nodo aux = Inicio;
        
        if(Inicio != null)
        {
            while(aux.siguiente !=null)
            {
                aux = aux.siguiente;
                Final = new Nodo(pdato);
                aux.siguiente = Final;
                aux = aux.siguiente;
            }
        }
        
    }
    
     public int Cima()
    {
        return Inicio.dato;
    } 
     
    public void Recorrer()
    {
        Nodo aux = Inicio;
        
        while(aux != null)
        {
            System.out.println(aux.recorrer());
            aux = aux.siguiente;
        }
    }
    
     public static void main(String[] args)
    {
        Pila l1 = new Pila();
        
        l1.Apilar(1);
        l1.Apilar(2);
        l1.Apilar(3);
        l1.EliminarFinal();
        l1.IngresarFinal(4);
        l1.Recorrer();
        System.out.println("Ultimo dato: " + l1.DarUltimo().dato);
        //System.out.println("La Cima es: "+l1.Cima());
    }
}
