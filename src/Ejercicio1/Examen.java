package Ejercicio1;

public class Examen {

    private String titulo;
    private double calificacion;

    private static String asignatura;
    public Examen(String titulo, double calificacion) throws Exception {

        if(titulo==null){
            throw new Exception("El titulo no puede estar vacío");
        }

        if(calificacion<0 || calificacion>10){
            throw new Exception("La nota no es válida");
        }

        this.titulo = titulo;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificaion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return asignatura +'-'+ titulo +'-'+ calificacion;
    }

    public void redondear(){
        this.calificacion=Math.round(calificacion);
    }

    public void estaAprobado(){
        if (calificacion<5){
            System.out.println("Suspenso");
        }else{
            System.out.println("Aprobado");
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public static String getAsignatura() {
        return asignatura;
    }

    public static void setAsignatura(String asignatura) {
        Examen.asignatura = asignatura;
    }
}
