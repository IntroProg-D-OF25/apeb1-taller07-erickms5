/**
 *Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1 	10 	$2.5 	$25
 * Nombre 2 	11 	$2 	$22
 * Nombre 3 	9 	$3 	$27
 * Nombre 4 	5 	$4 	$20
 * Nombre 5 	12 	$2 	$24
 * @author Erick Malla
 */
import java.util.Scanner;
public class Problema3_Empleados {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nomEmplaeado;
        double costodia, valorcancel, numdia;
        int cont = 1;
        while (cont <= 5) {            
            System.out.println("INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: ");
            nomEmplaeado = tcl.next();
            numdia = tcl.nextDouble();
            costodia = tcl.nextDouble();
            valorcancel = numdia * costodia;
            System.out.println("NOMBRE\t\tDIAS_TRABAJADOS\t\tCOSTO_DIA\tVALOR_CANCELAR");
            System.out.println(nomEmplaeado + "\t\t" + numdia + "\t\t\t$" + costodia + "\t\t$" + valorcancel);
            cont ++;
        }
    }
}
/**
 * run:
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
Erick 10 2,5
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
Erick		10.0			$2.5		$25.0
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
Wang 11 2
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
Wang		11.0			$2.0		$22.0
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
Steven 9 3
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
Steven		9.0			$3.0		$27.0
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
Malla 5 4
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
Malla		5.0			$4.0		$20.0
INGRESE NOMBRE, NUMERO DE DIAS TRABAJADOS Y COSTO POR DIA: 
Sisalima 12 2
NOMBRE		DIAS_TRABAJADOS		COSTO_DIA	VALOR_CANCELAR
Sisalima		12.0			$2.0		$24.0
 */