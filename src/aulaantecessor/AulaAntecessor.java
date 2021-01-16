
package aulaantecessor;
import java.util.Scanner;

public class AulaAntecessor {

    public static void main(String[] args) {
       
        
        
        float num1, resultado, resultado2;
        Scanner ante = new Scanner(System.in);
        
        System.out.print("Digite um numero:");
        num1 = ante.nextFloat();
        
        resultado = num1-1;
        resultado2 = num1+1;
        
        System.out.println("O antecessor é:" +resultado);
        System.out.println("O sucessor é:" +resultado2);
        
        
    }
    
}
