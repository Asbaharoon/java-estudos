package POO;

public class rodarAplicacao {
  
  public static void main(String[] args) {
    Carro carro1 = new Carro();

    carro1.setCor("Branca");
    carro1.setModelo("Honda HRV");
    carro1.setCapacidadeTanque(45);

    System.out.println(carro1.getCor());
    System.out.println(carro1.getModelo());
    System.out.println(carro1.getCapacidadeTanque());
    System.out.println(carro1.calcularValorTanque(3.50));

    Carro carro2 = new Carro("Preto", "Mercedes-Benz Q", 10);

    System.out.println(carro2.getCor());
    System.out.println(carro2.getModelo());
    System.out.println(carro2.getCapacidadeTanque());
    System.out.println(carro2.calcularValorTanque(10));
  }


}
