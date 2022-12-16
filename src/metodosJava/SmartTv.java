package metodosJava;
public class SmartTv {
   
   boolean ligada = false;
   int canal = 0;
   int volume = 25;

   public void ligar(){
      ligada = true;
   }

   public void desligar(){
      ligada = false;
   }

   public void passarCanal(){
      canal++;
   }

   public void voltarCanal(){
      canal--;
   }

   public void canalDigitado(int novoCanal){
      canal = novoCanal;
   }

   public void aumentarVolume(){
      volume++; 
   }

   public void abaixarVolume(){
      volume--; 
   }

}
