package questao01;

import questao01.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        IO.println("Quantos produtos serão cadastrados: ");
        int totalProdutos = entrada.nextInt();
        entrada.nextLine();

        List<Produto> produtos = new ArrayList<>();

        for (int indice = 0; indice < totalProdutos; indice++){
            IO.println("Produto #" + (indice + 1));
            IO.println("Código: ");
            String codigo = entrada.nextLine();
            IO.println("Nome: ");
            String nome = entrada.nextLine();
            IO.println("Preço: ");
            Double preco = entrada.nextDouble();
            IO.println("Quantidade em estoque: ");
            int quantidadeEstoque = entrada.nextInt();
            entrada.nextLine();
            IO.println(
                    "--- Status do produto ---" +
                            "\nativo" +
                            "\ninativo" +
                            "\ndescontinuado" +
                            "\nsem estoque" +
                            "\n-------------------------"
            );
            String status = entrada.nextLine();
            Produto produto = new Produto(codigo, nome, preco, quantidadeEstoque, status);
            produtos.add(produto);
        }

        entrada.close();

        for (Produto produto : produtos) {
            IO.println(produto.toString());
        }
    }

}
