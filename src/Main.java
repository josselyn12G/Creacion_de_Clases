//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciación: Llamo a la clase, le pongo un nombre y le lllamo a mi constructor.
        Automovil auto = new Automovil(); //Primer objeto.
        //Asignación de valores
        auto.marca = "BMW";
        auto.modelo = "i320";
        auto.color = "Blanco";

        //El molde es negro pero le estamos modificando por POLIMORFISMO.
        auto.cilindraje = 3.2;

        //sout
        System.out.println("La marca del auto es: "+auto.marca); //Metodo de salida. LLamo al objeto que engloba el atributo.
        //soutv
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindraje = " + auto.cilindraje);



        // -------------------------------------Ejercicio-------------------------------------------
        //Crear una nueva clase. Declaramos 4 atributos en la clase. Instanciar la clase.Desplegar valores.
        Zapatos shoe = new Zapatos();
        //Asignación de valores
        shoe.marca = "Nike";
        shoe.modelo = "Air Force";
        shoe.talla = 35;
        shoe.edicion = 2020;
        System.out.println("Marca = "+shoe.marca);
        System.out.println("Modelo = "+shoe.modelo);
        System.out.println("Talla = "+shoe.talla);
        System.out.println("Edicion = "+shoe.edicion);

    }
}
