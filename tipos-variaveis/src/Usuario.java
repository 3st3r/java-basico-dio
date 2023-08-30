public class Usuario {
    public static void main(String[] args) {
       
        SmartTv smartTv  = new SmartTv();

        System.out.println( " TV ligada? "  + smartTv.ligada);
        System.out.println( " canal: "  + smartTv.canal);
        System.out.println( " volume : "  + smartTv.volume);

    smartTv.ligar ();
    System.out.println( " novo status : Tv ligada? "  + smartTv.ligada);
    }
}
