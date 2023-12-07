public record Teste(int hora, int minuto) {
  // AUTOMATICAMENTE 
  // private final int hora;
  // private final int mninuto;

  // ao criar um record o compilador cria ESSE construtor padrao de atribuicao!
  // com exatemente o mesmo nome dos atributos na assinatura da classe, e na mesma ordem
  public Teste(int hora, int minuto){
    this.hora = hora;
    this.minuto = minuto;
  }
  // construtor compacto
  // sem atribuicoes, sao automaticamente feitas
  public Teste{
    //  aqui somente validacoes!!!
  }
}


