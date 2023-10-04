require 'spec_helper'

describe 'ParkingLot' do
  it '1. Processa placas de veículos de acordo com regra contendo letras e números' do
    license_rules = 'LLLNLNN'
    vehicles = [Vehicle.new('ABC1D23'), Vehicle.new('PLQ4M76'), Vehicle.new('IJM3K87'), Vehicle.new('LUL4I13')]
    parking_lot = ParkingLot.new(license_rules, vehicles).license_plates_verification

    expect(parking_lot).to eq(['Válido', 'Válido', 'Válido', 'Válido'])
  end

  it '2. Processa placas de veículos de acordo com regra contendo letras e números' do
    license_rules = 'LLLLLNNN'
    vehicles = [Vehicle.new('ABC1D23'), Vehicle.new('CAMPU569'), Vehicle.new('GARG1O87'), Vehicle.new('VANNY691')]
    parking_lot = ParkingLot.new(license_rules, vehicles).license_plates_verification

    expect(parking_lot).to eq(['Inválido', 'Válido', 'Inválido', 'Válido'])
  end

  it '3. Processa placas de veículos de acordo com regra contendo letras, números e separador' do
    license_rules = 'NNL-LLNN'
    vehicles = [Vehicle.new('98LNJ11'), Vehicle.new('98L-NJ11'), Vehicle.new('17JHOK90'), Vehicle.new('RS1-89RS')]
    parking_lot = ParkingLot.new(license_rules, vehicles).license_plates_verification

    expect(parking_lot).to eq(['Inválido', 'Válido', 'Inválido', 'Inválido'])
  end

  it '4. Processa placas de veículos de acordo com regra contendo letras, números, caractere especial e separador' do
    license_rules = 'LNL$LL-N'
    vehicles = [Vehicle.new('P7Y-WB$8'), Vehicle.new('N1I$YF$7'), Vehicle.new('K5O$QK-3'), Vehicle.new('N6T$DX-2'), Vehicle.new('7JY$LE-0')]
    parking_lot = ParkingLot.new(license_rules, vehicles).license_plates_verification

    expect(parking_lot).to eq(['Inválido', 'Inválido', 'Válido', 'Válido', 'Inválido'])
  end

  it '5. Processa placas de veículos de acordo com regras contendo letras, números e separadores' do
    license_rules = 'LNNN-LLL||LNLN-NNN'
    vehicles = [Vehicle.new('P480-CGZ'), Vehicle.new('L3U7-013'), Vehicle.new('L9087-QW'), 
                Vehicle.new('P1N4-812'), Vehicle.new('ASDFGQWE'), Vehicle.new('123456789')]
    parking_lot = ParkingLot.new(license_rules, vehicles).license_plates_verification

    expect(parking_lot).to eq(['Válido', 'Válido', 'Inválido', 'Válido', 'Inválido', 'Inválido'])
  end

  it '6. Processa placas de veículos de acordo com regras contendo letras, números, caracteres especiais e separadores' do
    license_rules = 'L!NN-L$L||NNNN-LLL||LLLL%NNN'
    vehicles = [Vehicle.new('TGIF%123'), Vehicle.new('L$NN-L!L'), Vehicle.new('OVER-712'), 
                Vehicle.new('8888-TYU'), Vehicle.new('X!09-W$Z'), Vehicle.new('KIDS-666')]
    parking_lot = ParkingLot.new(license_rules, vehicles).license_plates_verification

    expect(parking_lot).to eq(['Válido', 'Inválido', 'Inválido', 'Válido', 'Válido', 'Inválido'])
  end
end
