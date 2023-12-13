package Ejercicio2;


import java.util.Objects;

public class Deposito {

    private int capacidad;
    private int cantidad;
    Contenido contenido;



    public Deposito(int capacidad, Contenido contenido) {
        this.capacidad = capacidad;
        this.contenido = contenido;
    }

    public void estaVacio(){
        this.cantidad=0;
    }
    public void llenar(int cantidad, Contenido contenido) throws Exception{
        if(contenido!=this.contenido) {
            throw new Exception("El contenido no coincide");
        }

        if(this.cantidad+cantidad>capacidad){
            throw new Exception("Supera la capacidad");
        }
        this.cantidad=this.cantidad+cantidad;
    }

    public void extraer(int cantidad) throws Exception{
        if(cantidad>capacidad){
            throw new Exception("No hay suficiente");
        }
        this.cantidad=this.cantidad-cantidad;
    }

    public int getPorcentaje(){
        return Math.round(cantidad*100/capacidad);
    }

    public void transvasar(Deposito deposito){
        deposito.estaVacio();
    }

    public void dibujar(int longitud){


        System.out.print(getPorcentaje()+"%|");
        for(int i=0; i<longitud; i++){
            if((getPorcentaje()*longitud/100)<i){
                System.out.print("#");
            }else{
                System.out.print(".");
            }
        }
        System.out.print("|");
        System.out.println();
    }

    @Override
    public String toString() {
        return contenido +"  ("+cantidad+"/"+capacidad+")";

    }
}
