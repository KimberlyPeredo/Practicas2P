package Practica3;

public class ListaCircularSimplementeEnlazada {
    private Nodo inicio;

    public ListaCircularSimplementeEnlazada(){
        inicio=null;
    }

    public boolean estaVacia(){
        return inicio==null;
    }

    public  int tamaño(){
        int contador=0;

        if (!estaVacia()){
            Nodo ultimo=inicio;
            while (ultimo.getSiguente() !=inicio){
                ultimo=ultimo.getSiguente();

                contador++;
            }
            contador++;
        }
        return contador;
    }
    public void insertarFin(Object dato){
        if (estaVacia()){
            Nodo nuevo= new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguente(nuevo);

            inicio=nuevo;

        }else {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguente(inicio);

            Nodo ultimo = inicio;
            while (ultimo.getSiguente() != inicio) {
                ultimo = ultimo.getSiguente();

            }
            ultimo.setSiguente(nuevo);
        }
    }
    public  void  eliminarFin(){
        if (!estaVacia()){
            Nodo penultimo=inicio;
            while (penultimo.getSiguente()!=inicio){
                penultimo=penultimo.getSiguente();
            }
            penultimo.setSiguente(inicio);
        }
    }
    public void mostrar(){
        if(!estaVacia()) {
            Nodo ultimo = inicio;
            while (ultimo.getSiguente() != inicio) {
                System.out.print(ultimo.getDato() + "   ");

                ultimo = ultimo.getSiguente();

            }
            System.out.print(ultimo.getDato() + "   ");
            System.out.println();
        }
    }
    public void mostrarCircular(int vueltas) {
        if (!estaVacia()) {
            int contador=0;
            Nodo temp = inicio;
            while (temp != null && contador<(tamaño()*vueltas) ) {
                System.out.print(temp.getDato() + "   ");

                temp = temp.getSiguente();
                contador++;

            }
            System.out.println();
        }
    }
}
