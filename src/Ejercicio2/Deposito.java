package Ejercicio2;


public class Deposito {

    private int capacidad;
    private int cantidad;
    Contenido contenido;

    public Deposito(int capacidad,Contenido contenido ) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "capacidad=" + capacidad +
                '}';
    }

    public void estaVacio(){

    }
    public void llenar(int cantidad, Contenido contenido){
        this.cantidad=this.cantidad+cantidad;
    }
}
