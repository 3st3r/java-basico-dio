  public class SmartTv {
    
   boolean ligada = false;
   int canal = 1;
   int volume = 10;
  
    
    public void aumentarVolume(){
      //volume+1
       volume++;
    }
    public void diminuirVolume(){
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
