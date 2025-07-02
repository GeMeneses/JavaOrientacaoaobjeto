src/exercicio3/programa/CalculoProduto.Java

package exercicio3.programa;

import exercicio3.entidade.Produto;

import java.util.Locale;
import java.util.Scanner;

public class CalculoProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Entre com o produto:");
        System.out.print("Nome: ");
        produto.name = sc.nextLine();

        System.out.print("Preço: ");
        produto.price = sc.nextDouble();

        System.out.print("Quantidade: ");
        produto.quantity = sc.nextInt();

        System.out.println(produto);
        System.out.println();

        System.out.print("Quantidade de produtos para adicionar ao estoque: ");
        int quantity = sc.nextInt();
        produto.addProdutos(quantity);
        System.out.printf("Estoque atualidado: "+ produto);
        System.out.println();

        System.out.println();
        System.out.print("Quantidade de produtos que deseja retirar do estoque:");
        quantity = sc.nextInt();
        produto.removerProdutos(quantity);
        System.out.printf("Estoque atualizado: "+ produto);



        System.out.println(produto);

        sc.close();

    }
}
