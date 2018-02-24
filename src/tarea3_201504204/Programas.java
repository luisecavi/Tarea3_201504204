package tarea3_201504204;

import java.util.Scanner;

/**
 *
 * @author Luis Caballeros
 */
public class Programas {

    //Se crea un objeto scanner llamado leer para recibir datos ingresados.
    Scanner leer = new Scanner(System.in);
    //Se declaran como variables de tipo entero.
    int opcion, i, j;
    //Se crea un objeto usuarios[]de tipo String, un vector de tamaño 5 para almacenar usuarios.
    String usuarios[] = new String[5];

    public void Menu() {
        //System.out.println(); para mostrar mensajes del menu en la consola.
        System.out.println("1.Ingresar usuarios");
        System.out.println("2.Mostrar Usuarios ascendente");
        System.out.println("3.Mostrar Usuarios descendente");
        System.out.println("4.Menu principal");
        //Se asigna el valor ingresado a la variable opcion.
        opcion = leer.nextInt();
        //Recibe el valor ingresado en opcion.
        switch (opcion) {

            case 1:
                //Si el numero ingresado es 1, llama al metodo IngresarUsuario();
                IngresarUsuario();
                break;
            case 2:
                //Si el numero ingresado es 2, llama al metodo MostrarAscendente();
                MostrarAscendente();
                break;
            case 3:
                //Si el numero ingresado es 3, llama al metodo Mostrardescendente();
                MostrarDescendente();
                break;
            case 4:
                //Si el numero ingresado es 4, llama al metodo MenuPrincial(); de la clase MenuPrincipal.
                MenuPrincipal menu = new MenuPrincipal();
                menu.MenuPrincipal();
                break;
            default:

        }
    }

    public void IngresarUsuario() {
        //Se asigna a la posicion 0 del vector el valor recibido por el escaner.
        usuarios[0] = leer.nextLine();
        //El primer ciclo for recorrera desde valores de i=0 hasta el valor de 4 que vendran siendo las posiciones del vector de tamaño 5.

        for (i = 0; i < usuarios.length; i++) {
            //Imprimiendo en pantalla ingresar usuario.
            System.out.println("Ingresar usuario");
            //Asignando a las posiciones del vector a medida que el que ciclo for avance, los valores recibidos por el escaner.
            usuarios[i] = leer.nextLine();
            //El segundo for esta encargado de recorrer desde los valores de j=0 hasta el valor de i que en ese momento el primer for lleve recorrido.
            for (j = 0; j < i; j++) {
                //while tiene la condicion que toma el valor que contenga en ese momento el vector en la posicion i 
                //y comparara con los valores del vector desde la posicion j=0 hasta que el vector tenga una posicion anterior a la que tenga i en ese momento
                //Compara y si son iguales muentra un mensaje que el usuario esta repetido y que debe ingresar uno nuevo.
                //Y se ingresa un nuevo usuario que sera recibido por escaner y almacenado en la posicion i actual.
                //Esto se repetira mientras se cumpla la condicion.
                while (usuarios[i].equals(usuarios[j])) {
                    System.out.println("Usuario repetido");
                    System.out.println("Ingrese nuevo usuario");
                    usuarios[i] = leer.nextLine();
                }//Cuando ya no se cumple la condicion de while entonces, el programa sigue y avanza al primer for
                //Y el ciclo se repite hasta cumplir con todas las condiciones.
            }

        }
        //Cumplidas las condiciones entonces, se llama el metodo Menu(); para mostrar el menu en pantalla y seleccionar una nueva tarea.
        Menu();

    }

    public void MostrarAscendente() {
        //El ciclo for recorrera en forma regresiva desde un valor de i=4 hasta que este sea 0, y mostrara un mensaje en pantalla
        //Con el dato que contenga el vector en la posicion de valor i, asi hasta cumplir con la condicion.
        //Esto para mostrar los usuarios en forma contraria a la que se ingresaron.
        for (i = 4; i >= 0; i--) {
            System.out.println(usuarios[i]);
        }
        System.out.println("---------------------------");
        System.out.println(" ");
        //Terminado el ciclo for procedera a llamar el metodo Menu(); y mostrara nuevamente el menu en pantalla.
        Menu();
    }

    public void MostrarDescendente() {
        //El ciclo for recorrera desde un valor de i=0 hasta que este sea 4, y mostrara un mensaje en pantalla
        //Con el dato que contenga el vector en la posicion de valor i, asi hasta cumplir con la condicion.
        //Esto para mostrar los usuarios en el orden en que se ingresaron.
        for (i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i]);
        }
        System.out.println("---------------------------");
        System.out.println(" ");
        //Terminado el ciclo for procedera a llamar el metodo Menu(); y mostrara nuevamente el menu en pantalla.
        Menu();
    }

}
