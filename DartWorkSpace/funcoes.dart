// funcao

void main() {
  // funcao padrao
  void funcao() {
    print('funcao'); // sem retorno
  }

  // com retorno int e parametro obrigatorio!
  int funcaoInt(int num1) {
    return num1;
  }

  // com retorno String e parametro opcional! []
  String funcaoString([String nome]) {
    return nome;
  }

  // parametro nomeado sao nullables por default {}
  // com retorno double e parametro opcional e NOMEADO! {}
  double funcaoDouble({double? num1, double? num2}) {
    if (num1 != null && num2 != null) {
      return num1 + num2;
    } else
      return 0.0;
  }

  // parametros sao PROMOVIDOS apos checagem, para tipo non-null
}
