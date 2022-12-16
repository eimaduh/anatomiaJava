package metodosJava;
public class Usuario {
   
   public static void main(String[] args){
      SmartTv smartTv = new SmartTv();

      System.out.print("A TV está ligada? " + smartTv.ligada + "\n");
      System.out.print("Canal inicial: " + smartTv.canal + "\n" );
      System.out.print("Volume inicial: " + smartTv.volume + "\n");

      smartTv.ligar();
      System.out.print("Novo status => A TV está ligada? " + smartTv.ligada + "\n");

      smartTv.desligar();
      System.out.print("Novo status => A TV está ligada? " + smartTv.ligada + "\n");

      smartTv.passarCanal();
      System.out.print("Canal atual: " + smartTv.canal + "\n" );

      smartTv.voltarCanal();
      System.out.print("Canal atual: " + smartTv.canal + "\n" );

      smartTv.canalDigitado(3);
      System.out.print("Canal atual: " + smartTv.canal + "\n" );

      smartTv.abaixarVolume();
      System.out.print("Volume atual: " + smartTv.volume + "\n");

      smartTv.abaixarVolume();
      System.out.print("Volume: atual " + smartTv.volume + "\n");

   }
}
