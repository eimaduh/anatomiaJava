public class MyClass {
   
   public static void main(String [] args) {

      String firstName = "Maria";
      String secondName = "Eduarda";

      String fullName = fullName(firstName, secondName);
      System.out.print(fullName);
   }   

   public static String fullName( String firstName, String secondName){
      return firstName.concat(" ").concat(secondName);
   }
} 