  public class SmartTv {
    
   boolean ligada = false;
   int canal = 1;
   int volume = 10;
  
    
    public void aumentarVolume(){
      System.out.println("Aumentando o volume para: " +volume);
      //volume+1
       volume++;
    }
    public void diminuirVolume(){
      System.out.println("Diminuindo o volume para: " +volume);
      //volume-1
       volume--;
    }


    public void ligar(){
        ligada = true;
   }
    public void desligar(){
        ligada = false;
 }
   } 
