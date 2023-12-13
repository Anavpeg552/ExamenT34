package Ejercicio2;

public class EjercicioDeposito {

    public static void main(String[] args) throws Exception {

            Deposito deposito1= new Deposito(150,Contenido.aceite);
            Deposito deposito2= new Deposito(150,Contenido.gasoleo);
            Deposito deposito3= new Deposito(150,Contenido.gasoleo);

            System.out.println(deposito1.toString());
            System.out.println(deposito2.toString());

            deposito1.llenar(90,Contenido.aceite);
            deposito2.llenar(40,Contenido.gasoleo);

            deposito1.extraer(30);
            deposito2.extraer(3);

            deposito1.getPorcentaje();
            deposito2.getPorcentaje();

            //transvasar(deposito3);


            deposito1.dibujar(10);
            deposito2.dibujar(7);
    }
}
