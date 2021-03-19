package listas;


public class MyLista {
    /**
     * Las variables u objetos tipo nodo los tenemos
     * que crear nosotros
     **/
    private Nodo cabeza=null;//la cabeza puede valer null si la cabeza esta vacia
        private class Nodo{
        public int data;
        /**
         * este me permite acceder al nodo siguiente, y lo pongo inicailmente
         * en nulo por que puede ser una lista de un solo elemento.
         * 
         * El recolector de basura de Javca nos ayuda a eliminar los nodos no
         * instanciados
         **/
        public Nodo siguiente=null;
        
        public Nodo(int data){
            this.data=data;
        }
    }//Fin de la clase nodo
    
    /**
     * Este metodo me permite insertar un elemento al comienzo de 
     * my lista
     **/
    public void insertarComienzo(int data){
        Nodo nodo= new Nodo(data);//Creo el nodo del nuevo elemento de la lista 
        nodo.siguiente=cabeza;
        cabeza=nodo;
    }
    
    /**
     * Este metodo me permite insertar un nodo al final 
     * de mi lista
     **/
    public void insertarFinal(int data){
        //primero recorremos la lista
        //creamos el nodo
        Nodo nodo=new Nodo(data);
        //creamos el puntero para recorrer la lista
        Nodo puntero =cabeza;//inicia en le nodo actual(primero)
        //si el puntero.siguiente vale nulo llegamos al finald e la lista
        while(puntero.siguiente != null){
            puntero=puntero.siguiente;
            /*Hacemos que el puntero se posicione en el siguiente nodo hasta 
            que sea siguiente sea nulo*/
        }
        //una vez llega al final, le pasamos el nodo recien creado
        puntero.siguiente=nodo;
    }
    
    /**
     * El metoodo me permite insertar un nodo en medio de dos 
     * nodos mas
     **/
    public void insertarMedio(int n,int data){
        Nodo nodo= new Nodo(data);
        if(cabeza==null){
            /*Si la lista esta vacia solo 
            insertamos el nodo y ya*/
            cabeza=nodo;
        }else{
            //para encontrar el nodo n tengo que recorrer la lista
            Nodo puntero =cabeza;
            int contador=0;//me ayudara a comparar si ya llegue a n nodo
            while( contador<n && puntero.siguiente != null){
                puntero=puntero.siguiente;
                contador++;
            }
            //insertamos el nodo a la derecha 
            nodo.siguiente=puntero.siguiente;
            //insertamos el nodo a la izquierda
            puntero.siguiente=nodo;
        }
    }
    
    /**
     * El siguiente metodo devuelve un string, mostrando la lista
     **/
    public String mostrarList(){
        String salida="";
        Nodo puntero=cabeza;
        while(puntero != null){
           salida=salida+puntero.data+"  ";
           puntero=puntero.siguiente;
        }
           return salida;
    }
    
    public int contarNodos(){
        int contador=0;
        Nodo puntero=cabeza;
        while(puntero != null){
            contador ++;
            puntero=puntero.siguiente;
        }
        return contador;
    }
    
    public int sumarValores(){
        Nodo puntero=cabeza;
        int suma=0;
        if(puntero==null){
            suma=0;
        }else{
            while(puntero != null){
                suma=suma+puntero.data;
                puntero=puntero.siguiente;
            }

        }
        return suma;
    }
}
