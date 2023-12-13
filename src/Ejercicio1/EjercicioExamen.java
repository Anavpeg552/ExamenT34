package Ejercicio1;

public class EjercicioExamen {
    public static void main(String[] args) throws Exception {
        Examen examen1 =new Examen("tem1",7.3);
        Examen examen2 =new Examen("tem2",5.2);
        Examen examen3 =new Examen("tem3", 3);

        System.out.println(examen1.toString());
        System.out.println(examen2.toString());
        System.out.println(examen3.toString());

        examen1.redondear();
        System.out.println(examen1.toString());

        examen3.estaAprobado();
        examen2.estaAprobado();

        
    }
}
