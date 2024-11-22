/**
 *Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente: 
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% 
 * En caso que sea otro tipo de cliente, no hay descuento. 
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos: 
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 * @author Erick Malla
 */
import java.util.Scanner;
public class Problema6_Desc {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nomcl;
        double costPc, cont = 1, desc = 0, costf;
        int tipocl;
        while (cont <= 7) {            
            System.out.print("DAME NOMBRE, COSTO PC, TIPO CLIENTE ( 1 o 2): ");
            nomcl = tcl.next();
            costPc = tcl.nextDouble();
            tipocl = tcl.nextInt();
            if (tipocl == 1)
                desc = costPc * 0.1;
            else if (tipocl == 2)
                desc = costPc * 0.2;
            costf = costPc-desc;
            System.out.println("NOMBRE\t\tCOSTO PC\tTIPO CLIENTE\tCOSTO FINAL");
            System.out.println(nomcl + "\t\t$" + costPc + "\t\t" + tipocl + "\t\t$" + costf);
            cont ++;
        }
    }
}
