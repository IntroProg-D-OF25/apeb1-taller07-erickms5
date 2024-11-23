/**
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar: 
 * Nombre el jugador     
 * Posición en el campo de juego     
 * Edad     
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. 
 * Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */
import java.util.Scanner;
public class Problema4_Jugadores {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nomJugador, posicion;
        double estatura, prom_edad=0, prom_est=0;
        int edad, cont = 0, continuar = 1;
        do{
            System.out.println("Ingrese el nombre del jugador: ");
            nomJugador = tcl.next();
            System.out.println("Posición en el campo de juego: ");
            posicion = tcl.next();
            System.out.println("Edad del jugador: ");
            edad = tcl.nextInt();
            System.out.println("Estatura del jugador: ");
            estatura = tcl.nextDouble();
            System.out.println("Quiere ingresar otro jugador? (1.Si / 2.No)");
            continuar = tcl.nextInt();
            prom_edad = prom_edad + edad;
            prom_est = prom_est + estatura;
            cont ++;
            System.out.println("\tNOMBRE\tPOSICION\tEDAD\tESTATURA");
            System.out.println(cont + ".\t" + nomJugador + "\t-" + posicion + "-\t" + "edad " + edad + "\testatura" + estatura);            
        }while(continuar == 1);
    }    
}
/**
 * run:
 * Ingrese el nombre del jugador: 
 * Messi
 * Posici�n en el campo de juego: 
 * Delantero
 * Edad del jugador: 
 * 37
 * Estatura del jugador: 
 * 1,70
 * Quiere ingresar otro jugador? (1.Si / 2.No)
 * 1
 * NOMBRE	POSICION	EDAD	ESTATURA
 * 1.	Messi	-Delantero-	edad 37	estatura1.7
 * Ingrese el nombre del jugador: 
 * Cristiano
 * Posici�n en el campo de juego: 
 * Delantero
 * Edad del jugador: 
 * 39
 * Estatura del jugador: 
 * 1,87
 * Quiere ingresar otro jugador? (1.Si / 2.No)
 * 2
 * NOMBRE	POSICION	EDAD	ESTATURA
 * 2.	Cristiano	-Delantero-	edad 39	estatura1.87
 */