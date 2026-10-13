package questao01.model;

import questao01.enums.StatusProduto;

public class Produto {

    private String codigo;
    private String nome;
    private Double preco;
    private Integer quantidadeEstoque;
    private StatusProduto status;

    public Produto() {
    }

    public Produto(String codigo, String nome, Double preco, Integer quantidadeEstoque, String status) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.status = StatusProduto.stringParaStatus(status);
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    private void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    private void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public StatusProduto getStatus() {
        return status;
    }

    private void setStatus(StatusProduto status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", status=" + status +
                '}';
    }

}