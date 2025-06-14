package estruturasCondicionais;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.printf("%s, você tem %s anos e pode dirigir \n", name, age);
            System.out.println("Muito obrigado!");
        }else {
            System.out.printf("%s, você não pode dirigir \n", name);
            System.out.println("Muito obrigado!");
        }
    }
    /*
    OPERADOR TERNÁRIO.
    condição ? valor_se_verdadeiro : valor_se_falso;
    // Usando o operador ternário para definir a mensagem
        String mensagem = (age >= 18) ?
                String.format("%s, você tem %d anos e pode dirigir", name, age) :
                String.format("%s, você não pode dirigir", name);

        System.out.println(mensagem);
        System.out.println("Muito obrigado!");

     */
}
