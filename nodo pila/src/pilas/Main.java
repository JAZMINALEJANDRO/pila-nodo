package pilas;

import java.util.Scanner;

/**
 * Clase principa que implementa los metodos de la clase pila.
 * @author xavier
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opt = 0;
        Scanner texto = new Scanner(System.in);
        pila c = new pila();
        do {
            System.out.println("1 agregar");
            System.out.println("2 mostrar");
            System.out.println("3 eliminar");
            System.out.println("4 salir");
            
            switch (opt = texto.nextInt()) {
                case 1:
                    c.insertarnodo();
                    break;
                case 2:
                    c.mostrar();
                    break;
                case 3:
                    c.eliminar();
                    break;
               
                default:
                    System.out.println("opcion no valida"); 
                    break;
            }

        } while (opt != 4);

    }

}

