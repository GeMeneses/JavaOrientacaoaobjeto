src/exercicio1/entidade/Retangulo.java

package exercicio1.entidade;

public class  Retangulo {
    public double largura;
    public double altura;

    public double calculoArea(){
        return largura * altura;
    }

    public double calculoPerimetro(){
        return 2 * (largura + altura);
    }

    public double calculoDiagonal (){
        return Math.sqrt(Math.pow(largura, 2)+ Math.pow(altura, 2));
    }

        public String toString(){
            return"AREA: "
                    +String.format("%.2f%n", calculoArea())
                    +"PERIMETRO: "
                    +String.format("%.2f%n", calculoPerimetro())
                    +"DIAGONAL: "
                    +String.format("%.2f",calculoDiagonal());
    }

}
