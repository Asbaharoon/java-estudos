package POO;

public class Carro {
  int capacidadeDoTanque;
  String cor;
  String modelo;

  // Construtor

  Carro() {

  };

  Carro(String cor, String modelo, int capacidadeDoTanque) {
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeDoTanque = capacidadeDoTanque;
  };

  // this é uma forma de diferenciar o que pertence ao objeto e o que não pertence, o this indica que é desse objeto em questão, remove a ambiguidade. Uma coisa é o parâmetro e outra é o objeto que estou tratando com seu atributo.

  // Gets e Sets

  void setCor(String cor) {
    this.cor = cor;
  }

  String getCor() {
    return cor;
  }

  void setModelo(String modelo) {
    this.modelo = modelo;
  }

  String getModelo() {
    return modelo;
  }

  void setCapacidadeTanque(int capacidadeDoTanque) {
    this.capacidadeDoTanque = capacidadeDoTanque;
  }

  int getCapacidadeTanque() {
    return this.capacidadeDoTanque;
  }


  // Métodos

  double calcularValorTanque(double valorCombustivel) {
    return capacidadeDoTanque * valorCombustivel;
  }

}
