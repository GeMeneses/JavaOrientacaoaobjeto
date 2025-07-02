src/exercicio2/entidade/Funcionario.java

package exercicio2.entidade;

public class Funcionario {
    public String nome;
    public double salario;
    public double taxa;

    public double salarioLiquido (){
        return salario - taxa;
    }
    public double salarioAumento(double porcentagem){
        salario += salario * porcentagem / 100.0;
        return salario;
    }
    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", salarioLiquido());
    }


}
