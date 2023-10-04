# Controle de Placas

Com seu emprego recém adquirido no Centro de Veículos de Ratanabá do Norte, você é a pessoa responsável por fazer a checagem das placas de todos os veículos que entram no estacionamento.

Sua tarefa principal é fazer o controle dessas placas e determinar quais veículos pertencem a Ratanabá do Norte e estão submetidos a suas leis de trânsito.

As placas de Ratanabá do Norte seguem padrões ditados por `license_rules`. Estes padrões são formados por letras, números e caracteres especiais.

Um exemplo de padrão seria `LLLNLNN`, onde `L` representa uma letra e `N` um número. Dessa forma, a placa `ABC1D23` é válida seguindo os padrões de Ratanabá do Norte, pois, ao compará-la ao padrão, vemos que todas as letras da placa estão nas mesmas posições que o marcador `L` do padrão e todos os números da placa estão nas mesmas posições que o marcador `N`.

Nesse desafio, você deve escrever o algoritmo que, ao receber os padrões de placa de Ratanabá `license_rules` e o array `vehicles`, que descreve os carros que estão no estacionamento no momento, retorna quais desses veículos possuem placas válidas no distrito de Ratanabá.

## Exemplo

A chamada do método com:

```ruby
    license_rules = 'LLLNLNN'
    vehicles = [Vehicle.new('ABC1D23'), Vehicle.new('1LQ4M76')]
```

deve retornar `['Válido', 'Inválido']`, pois a primeira placa segue o padrão `LLLNLNN` e a segunda não.

## Informações adicionais


- `license_rules` pode conter mais de um padrão. Nesse caso, uma placa é considerada válida se segue qualquer um dos padrões descritos em `license_rules`. Os padrões estarão separados pelo sinalizador `||`;

- Caracteres especiais em `license_rules` são representados por si. Por exemplo, a placa `ABC$123` é válida pelo padrão `LLL$NNN`, mas não é válida pelo padrão `LLL-NNN`.

