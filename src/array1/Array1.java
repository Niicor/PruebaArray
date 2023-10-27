/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


/**
 *
 * @author niico
 */
public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int [] vector = {1,3,5,7,9,11,13,15,17,19};
    int [] vector2 = {2,4,6,8,10,12,14,16,18,20};
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i]+"-");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector2[i]+"-");
        }
        System.out.println("\nLa multiplicacion es ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i]*vector2[i]);
            System.out.println(" ");
        }
    List<Integer> v1 = new ArrayList<>();
    List<Integer> v2 = new ArrayList<>();
     System.out.println("Rellene la lista con numeros enteros");
        for (int i = 0; i < 3; i++) {
            System.out.println("Lista 1");
            v1.add(sc.nextInt());
            System.out.println("Lista 2");
            v2.add(sc.nextInt());
        }
        System.out.println("La multiplicacion es ");
        for (int i = 0; i < 3; i++) {
            System.out.print(v1.get(i)*v2.get(i)+" ");
        }
        
        
        // ARRAYLIST PARA INGRESAR NUMEROS
       /* Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        int n;

        do {
            System.out.println(
            "Introduce números enteros. 0 para acabar: "); 
 System.out.println("Numero: ");
            n = sc.nextInt();
            if (n != 0) {
                numeros.add(n);
            }
        } while (n != 0);

        System.out.println("Ha introducido: " + numeros.size() + " números:");
 
 //mostrar el arrayList completo
 System.out.println(numeros);

        //recorrido usando un iterador para mostrar un elemento por línea 
        Iterator it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //recorrido usando foreach para sumar los elementos
        double suma = 0;
        for (Integer i : numeros) {
            suma = suma + i;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + suma / numeros.size());*/
    }
}
