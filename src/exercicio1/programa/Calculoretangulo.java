src/exercicio1/programa/Calculoretangulo.java

package exercicio1.programa;

import exercicio1.entidade.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Calculoretangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();


        System.out.println(retangulo.toString());

      sc.close();

    }
}
