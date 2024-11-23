/** 
 *Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de 
 * ellos ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte
 * Estudiante 1 	10 	Aprobado
 * Estudiante 2 	6.9 	Reprobado
 * Estudiante 3 	7 	Aprobado
 * Estudiante 4 	5 	Reprobado
 * @author Erick Malla
 */
import java.util.Scanner;
public class Problema5_PromEst {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nomEst, estado;
        double promedio, cont = 1;
        while (cont <= 4) {            
            System.out.print("DAME NOMBRE Y PROMEDIO: ");
            nomEst = tcl.next();
            promedio = tcl.nextDouble();
            estado = (promedio>=7)? "APROBADO" : "REPROBADO" ;
            System.out.println("NOMBRE\tPROMEDIO\tESTADO");
            System.out.println(nomEst + "\t" + promedio + "\t\t" + estado);
            cont ++;
        }
    }
}
