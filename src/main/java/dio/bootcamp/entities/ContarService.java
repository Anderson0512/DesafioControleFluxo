package dio.bootcamp.entities;

import dio.bootcamp.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class ContarService {

  private ContarService() {}

  public static void contador() {

    Scanner terminal = new Scanner(System.in);

    try {

      System.out.println("Digite o primeiro parâmetro");
      int parameterOne = terminal.nextInt();
      terminal.nextLine();

      System.out.println("Digite o segundo parâmetro");
      int parameterTwo = terminal.nextInt();

      Contar.contar(parameterOne, parameterTwo);

      System.out.println("\nContinuar com a aplicação? 'S' para continuar ou qualquer tecla para finalizar!");
      String go = terminal.next();
      terminal.nextLine();

      if ("S".equalsIgnoreCase(go)) {
        contador();
      }
      terminal.close();
    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Jogo finalizado!!!!!!!!!!!!");
    }
  }
}
