import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Scanner sc = new Scanner(System.in);
        System.out.println("--Conversor de numeral cardinal em numero por extenso--");
        while (true){
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            conversor.logica(numero);
            System.out.println();
        }

    }
}

