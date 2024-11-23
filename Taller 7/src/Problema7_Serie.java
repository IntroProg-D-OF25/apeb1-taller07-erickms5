/**
 *Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author UTPL
 */
import java.util.Scanner;
public class Problema7_Serie {
        public static void main(String[] args) {
        int cont = 1, lim;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame limite: ");
        lim = tcl.nextInt();
        while (cont <= lim) {  
            if ((cont%2)== 1) {
                System.out.print("-(1/"+cont+")");                
            }
            else
                System.out.print("+(1/"+cont+")");
            cont++;
        }
    }
}
/**
 * run:
 * Dame limite: 10
 * -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */