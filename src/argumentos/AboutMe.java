package argumentos;
import java.util.Locale;
import java.util.Scanner;

//usando argumentos passamos as informações por parametro no terminal
// java AboutMe Maria Eduarda 19 1.65
//    String nome = args[0];
//    String sobrenome = args[1];
//    int idade = Integer.valueOf(args[2]);
//    double altura = Double.valueOf(args[3]);

public class AboutMe {
      public static void main(String[] args){

      //Criando objeto scanner
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      System.out.print(scanner);

      System.out.print("Digite seu nome: ");
      String nome = scanner.next();

      System.out.print("Digite seu sobrenome: ");
      String sobrenome = scanner.next();

      System.out.print("Digite sua idade: ");
      int idade = scanner.nextInt();

      System.out.print("Digite sua altura: ");
      double altura = scanner.nextDouble();

      System.out.print("Olá me chamo: " + nome + " " + sobrenome + "\n");
      System.out.print("Tenho: " + idade + " anos" + "\n");
      System.out.print("Minha altura é: " + altura + " cm"  + "\n");
   }
}

   
