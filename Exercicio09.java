/* Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino
 ou N-noturno. Imprima a mensagem "Bom dia!", "Boa tarde!", ou "Boa noite! ou "valor inválido", conforme o caso.
*/
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno você estuda: ");
        String turno = scan.next();
        /*
        if (turno.equalsIgnoreCase("M")){
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")){
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("N")){
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }
        */


        switch (turno){
            case "m":
            case "M": System.out.println("Bm dia!"); break;
            case "v":
            case "V":  System.out.println("Boa tarde!"); break;
            case "n":
            case "N": System.out.println("Boa noite!"); break;
            default: System.out.println("Valor inválido");
        }
    }
}
