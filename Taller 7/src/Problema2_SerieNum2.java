/**
 *Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20
 * @author Erick Malla
 */
import java.util.Scanner;
public class Problema2_SerieNum2 {
    public static void main(String[] args) {
        int cont = 5, lim, acum =10;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame limite: ");
        lim = tcl.nextInt();
        while (cont <= lim) {            
            System.out.print(cont + "/" + acum + ", ");
            cont +=5;
            acum += 2;
        }
    }
}
/**
 * run:
 * Dame limite: 30
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 
 */