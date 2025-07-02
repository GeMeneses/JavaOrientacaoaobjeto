src/exercicio2/programa/Calculosalario.java

package exercicio2.programa;

import exercicio2.entidade.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Calculosalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("nome: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Salario: ");
        funcionario.salario = sc.nextDouble();

        System.out.print("Taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println(funcionario);

        System.out.println("Which percentage to increase salary? ");
        double porcentagem = sc.nextDouble();
        funcionario.salarioAumento(porcentagem);
        System.out.println(funcionario);

      sc.close();

    }
}
