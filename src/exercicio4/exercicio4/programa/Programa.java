package exercicio4.programa;

import exercicio4.entidade.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite seu nome: ");
        aluno.nome = sc.nextLine();

        System.out.println("Digite as notas dos três semestres: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Grade Final: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.0){
            System.out.println("FALHOU");
            System.out.printf("FALTARAM %.2f PONTOS %n", aluno.pontosFaltantes());
        } else{
            System.out.println("PASSOU");
        }




        sc.close();
    }
}
