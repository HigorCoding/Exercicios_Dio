package estruturasCondicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 -  Segunda feira");
        System.out.println("2 -  terça feira");
        System.out.println("3 -  quarta feira");
        System.out.println("Selecione uma opção de 1 a 3 acima: ");
        byte option = scanner.nextByte();

        switch (option){
            case 1:
                System.out.println("Você solicitou segunda feira");
                break;
            case 2:
                System.out.println("Você solicitou terça feira");
                break;
            case 3:
                System.out.println("Você solicitou quarta feira");
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
    }
    /*
    podemos trabalhar com outra maneira no Switch Case
    case 1 -> System.out.println("Você solicitou terça feira");
    nesse caso não usamos o break.
    default -> System.out.println("Opção invalida!");
     */
}
