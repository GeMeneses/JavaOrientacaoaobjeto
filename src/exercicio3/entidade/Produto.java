src/exercicio3/entidade/Produto.java

  
package exercicio3.entidade;

public class Produto {

    public String name;
    public double price;
    public int quantity;


    public double valorTotalEmEstoque(){

        return price * quantity;
    }

    public  void addProdutos(int quantity){
        this.quantity += quantity;
    }

    public  void removerProdutos (int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades, Total: $ "
                + String.format("%.2f", valorTotalEmEstoque());
    }
}

  
