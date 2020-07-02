package pilas;

import java.util.Scanner;

public class pila {

    nodo primero;
    nodo ultimo;
    Scanner teclado = new Scanner(System.in);
    int contador =0;

    public pila() {
        primero = null;
        ultimo = null;

    }

    public void insertarnodo() {
        System.out.println("ingrese el dato: ");
        nodo nuevo = new nodo();
        nuevo.dato = teclado.nextInt();
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;
        } else {

            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.println("dato agregado ");
    }

    public void mostrar() {
        nodo actual = new nodo();
        actual = primero;
        if (primero != null) {
            while (actual != null) {
                System.out.println("" + actual.dato);
                actual = actual.siguiente;
            }
        } else {
            System.out.println("La pila esta vacia vacia");
        }
    }

    public void eliminar() {
        nodo actual = new nodo();
        actual = primero;
        nodo anterior = new nodo();
        anterior = null;
        boolean encontrado = false;
        System.out.println("ingrese un dato");
        int nodobuscado = teclado.nextInt();
        if (primero != null) {
            while (actual != null && encontrado != true) {
                if (actual.dato == nodobuscado) {
                    if (actual == primero) {
                        primero = primero.siguiente;
                    } else if (actual == ultimo) {
                        anterior.siguiente = null;
                        ultimo = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;

                    }
                    System.out.println("dato eliminado");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println("dato no encontrado");

            }
        } else {
            System.out.println("pila vacia");
        }
    }
    
}