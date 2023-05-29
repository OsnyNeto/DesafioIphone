public class Iphone {

    public static void main(String[] args) {
        
        AparelhoTelefonico at = new AparelhoTelefonico();
        at.ligar();

        NavegarInternet ni = new NavegarInternet();
        ni.adicionarNovaAba();

        PlayerMusical pm = new PlayerMusical();
        pm.tocar();
    }

}