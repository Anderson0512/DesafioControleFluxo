package dio.bootcamp.entities;

import dio.bootcamp.exceptions.ParametrosInvalidosException;

import java.util.ArrayList;
import java.util.List;

public class Contar {

  public static void contar(int numberOne, int numberTwo) throws ParametrosInvalidosException {

    if (numberOne > numberTwo) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }
    int count = numberTwo - numberOne;

    for (int i = 1; i <= count; i++) {
      System.out.println("Imprimindo o número " + i);
    }

    List<Integer> numbers = new ArrayList<>();

    for (int j = numberOne; j <= numberTwo; j++) {
      numbers.add(j);
    }
      System.out.println("\nImprimindo os números da subtração como Array ==> " + numbers);
  }
}
