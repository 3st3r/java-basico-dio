public class Usuario {
    public static void main(String[] args) {
       
        SmartTv smartTv  = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println( " Volume atual: " +smartTv.volume);

        System.out.println( " TV ligada? "  + smartTv.ligada);
        System.out.println( " canal: "  + smartTv.canal);
        System.out.println( " volume : "  + smartTv.volume);

    smartTv.ligar ();
    System.out.println( " Novo status : Tv ligada? "  + smartTv.ligada);
    }
}
