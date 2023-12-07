public class Produto {
    private String nome;
    private String categoria;
    private Float preco;
    private Integer quantidadeEstoque;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public Float getPreco(){
        return this.preco;
    }
    public void setPreco(Float preco){
        this.preco = preco;
    }
    public Integer getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }
    public void setQuantidadeEstoque(Integer quantidade){
        this.quantidadeEstoque = quantidade;
    }

    public void vender(Integer quantidade){
        if (this.quantidadeEstoque >= quantidade){
            this.quantidadeEstoque -= quantidade;
        }
        
    }
}

