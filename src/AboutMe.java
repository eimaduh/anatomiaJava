//usando argumentos passamos as informações por parametro no terminal
// java AboutMe Maria Eduarda 19 1.65

public class AboutMe {
      public static void main(String[] args){
         String nome = args[0];
         String sobrenome = args[1];
         int idade = Integer.valueOf(args[2]);
         double altura = Double.valueOf(args[3]);
   
         System.out.print("Olá me chamo: " + nome + " " + sobrenome + "\n");
         System.out.print("Tenho: " + idade + " anos" + "\n");
         System.out.print("Minha altura é: " + altura + " cm"  + "\n");
      }
}
