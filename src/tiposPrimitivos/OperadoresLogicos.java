package tiposPrimitivos;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresLogicos {
public static void main(String[] args) {

        //== verifica se são valores iguais
        //!= verifica se são valores diferentes
        //! se colocarmos ! antes da variável, ele inverte o valor, se é true fica false e vice-versa;
        //>= verificar se é maior ou igual
        //<= verificar se é menor ou igual
        //|| operador ou
        //&& operador e

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantos é 2 + 2 ?");
        float result = scanner.nextFloat();
        boolean isRight = result == 4;
        boolean isWrong = result != 4;

        System.out.printf("O resultado é 4, voce acertou? (%s) \n", isRight );
        System.out.printf("O resultado é 4, voce errou? (%s) ", isWrong);

        System.out.println("Vamos verificar se voce pode dirigir!");
        System.out.println("Qual sua idade: ");
        byte idade = scanner.nextByte();
        boolean canDrive = idade < 18;

        System.out.printf("Voce pode dirigir? (%s)", !canDrive);
    }
}
