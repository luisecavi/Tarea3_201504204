/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201504204;

import java.util.Scanner;

/**
 *
 * @author Luis Caballeros
 */
public class Promedio {
    //Se declaran las variables fila y columna como enteros.
    int fila, columna;
    //Se crea un objeto matriz, bidimensional de tipo entero de tamaño 6x6. 
    int[][] matriz = new int[6][6];

    public void MenuPromedio() {
        //Se crea un objeto escaner leer.
        Scanner leer = new Scanner(System.in);
        //Se declara la variable opcion como un entero.
        int opcion;
        //System.out.println(); Muestra siguientes mensajes en consola.
        System.out.println("1.Ingresar notas");
        System.out.println("2.Mostrar promedio");
        System.out.println("3.Menu principal");
        //opcion toma el valor recibido por escaner.
        opcion = leer.nextInt();
        
        //switch toma el valor de opcion.
        switch (opcion) {
            case 1:
                //Si el valor es 1 llama al metodo IngresoNotas();
                IngresoNotas();
                break;
            case 2:
                //Si el valor es 2 llama al metodo Promedio();
                Promedio();
                break;
            case 3:
                //Si el valor es 3 llama al metodo MenuPrincipal() de la clase MenuPrincipal;
                MenuPrincipal menu = new MenuPrincipal();
                menu.MenuPrincipal();
        }

    }

    public void IngresoNotas() {
        //Se crea un objeto escaner leer.
        Scanner leer = new Scanner(System.in);
        
        //El primer for recorrera desde fila=0 hasta el valor del tamaño del vector.
        //Imprimira Ingrese id
        //Y el vector en la posicion fila y columna 0 tomara el valor recibido por escaner. 
        //Es decir que cada vez que el for recorra solo cambiara el valor de la fila y conserva el valor de la columna, esto para marcar la primer columna para los id de los estudiantes.
        //Luego sigue hacia el segundo for.
        for (fila = 0; fila < matriz.length; fila++) {
            System.out.println(" ");
            System.out.println("Ingrese id");
            matriz[fila][0] = leer.nextInt();
            
            //Este for recorrera desde valor de columna=1 hasta columna<5
            //Imprimira Ingrese nota no. columna. es para indicar el numero de nota.
            //Matriz[fila][columna] tomara el valor ingresado por escaner, asi hasta cumplir con la condicion del for
            //Es decir que tomara apartir de la segunda columna hasta la quinta para guardar los valores de las notas, sin tomar en cuenta la primera que es la de id y la ultima que es utilizada para promedios.
            for (columna = 1; columna < 5; columna++) {

                System.out.println("Ingrese nota" + " " + columna);
                matriz[fila][columna] = leer.nextInt();
            }//Terminada la condicion regresa al primer for.
        }
        
        //Este tercer for ira desde fila=0 hasta fila<6.
        for (fila = 0; fila < matriz.length; fila++) {
            //Este for recorrera desde columna=1 hasta columna 5, por que en estas posiciones se encuentran las notas.
            //Y dira que para matriz[fila][5] sera igual a la suma de las siguientes posiciones donde fueron almecenados los valores de las notas en los for anteriores
            //y sera divido dentro de 4 esto es para calcular el promedio debido a que son 4 notas las ingresadas.
            //Recordando que lo unico que ira cambiando es la posicion de la fila ya que las columnas son constantes.
            for (columna = 1; columna < 5; columna++) {
                matriz[fila][5] = ((matriz[fila][1] + matriz[fila][2] + matriz[fila][3] + matriz[fila][4]) / 4);
            }//Terminada la condicion regresara al primer for.
        }
        //Se llama al metodo MenuPromedio();
        MenuPromedio();
    }

    public void Promedio() {
        //Este for recorrera desde fila=0 hasta fila<6 es decir todas las filas de la matriz y entre cada paso imprimira un salto de linea.
        for (fila = 0; fila < matriz.length; fila++) {
            System.out.println(" ");
            //Este for recorrera desde columa=0 hasta columna <6 es decir todas las columnas de la matriz.
            //Imprimira los valores almacenados en la posicion fila y columna que en ese momento lleven los for.
            //Utilizando "\t" que sirve para tabular los resultados.
            for (columna = 0; columna < matriz.length; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
        }
        System.out.println(" ");
        //Llama al metodo MenuPromedio();
        MenuPromedio();
    }
}
