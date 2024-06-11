import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o parametro um");
    int parametroUm = terminal.nextInt();
    
    System.out.println("Digite o parâmetro dois");
    int parametroDois = terminal.nextInt();
    
    terminal.close();
    
    try {
      contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException exception) {
      System.out.println(exception.getMessage());
    }

  }
  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    int contagem = parametroDois - parametroUm;
    
    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    } else {
      System.out.println("Iniciando a contagem...");
      System.out.println("A contagem foi igual ao valor " + contagem);
      for(int i=1; i < contagem; i++) {
        System.out.println("Imprimindo o número " + i);
      }
    }
  }
}


