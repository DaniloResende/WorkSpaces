class Vehicle
  attr_reader :plate #Se você precisa acessar o valor de @plate fora da classe Vehicle, então você precisa manter o attr_reader.
  def initialize(plate)
    @plate = plate 
  end
end
