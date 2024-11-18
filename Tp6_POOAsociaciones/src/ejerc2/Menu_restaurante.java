package ejerc2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Restaurante {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<Plato>platosMenu=new ArrayList<>();

        do {
            Plato plato = pedir_plato();
            platosMenu.add(plato);

            System.out.println("Desea añadir otro plato al menu? Ingrese 'True' por Si o 'False' por No: ");

        } while (leer.nextBoolean() != false);

        mostrar_menu(platosMenu);
    }

    public static Plato pedir_plato(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del plato:");
        String nombre_completo=leer.nextLine();

        System.out.println("Ingrese el precio:");
        double precio=leer.nextDouble();

        System.out.println("¿Su plato es una bebida? ingrese 'True' por Si o 'False' por No: ");
        boolean es_bebida=leer.nextBoolean();

        Plato plato = new Plato(nombre_completo,precio,es_bebida);

        if (es_bebida==false){
            do{

                Ingrediente nuevoIngrediente=pedir_ingredientes();
                plato.agregarIngrediente(nuevoIngrediente);

                System.out.println("Desea añadir otro ingrediente al plato? Ingrese 'True' por Si o 'False' por No: ");

            } while (leer.nextBoolean() != false);
        }

        return plato;


    }

    public static Ingrediente pedir_ingredientes(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del ingrediente");
        String nombre = leer.nextLine();

        System.out.println("Ingrese la unidad de medida de "+nombre+": ");
        String unidad_medida=leer.nextLine();

        System.out.println("Ingrese la cantidad de "+nombre+" en "+unidad_medida+": ");
        double cantidad = leer.nextDouble();

        return new Ingrediente(nombre, cantidad, unidad_medida);

    }

    public static void mostrar_menu(ArrayList<Plato>platosMenu){

        System.out.println("----------------------------------");
        System.out.println("---------------MENU---------------");
        System.out.println("----------------------------------");

        for (Plato p : platosMenu){

            System.out.println(p.getNombre_completo()+" $"+p.getPrecio());;

            if (p.isEs_bebida()==false){
                System.out.println("Ingredientes:");

                for (Ingrediente i : p.getIngredientes()){
                    System.out.println(i.getNombre() +" "+ i.getCantidad() + " " + i.getUnidad_medida() );
                }
            }


            System.out.println("----------------------------------");
        }
        System.out.println("----------------------------------");

    }

}
