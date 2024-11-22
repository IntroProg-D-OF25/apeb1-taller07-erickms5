/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 1/10 , 2/11 , 3/12 , 4/13, 5/14 , 6/15 
 * @author Erick Malla
 */
import java.util.Scanner;
public class Problema1_SerieNum1 {
    public static void main(String[] args) {
        int cont = 1, lim;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame limite: ");
        lim = tcl.nextInt();
        while (cont <= lim) {            
            System.out.print(cont + "/" + (cont+9) + ", ");
            cont++;
        }
    }
}
/**
 * run:
 * Dame limite: 6
1/10, 2/11, 3/12, 4/13, 5/14, 6/15,
 */