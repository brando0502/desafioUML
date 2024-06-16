package diagramaUML;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Utilizando ReprodutorMusical
        meuIphone.play();
        meuIphone.next();
        meuIphone.pause();
        
        // Utilizando AparelhoTelefonico
        meuIphone.makeCall("123-456-7890");
        meuIphone.receiveCall("098-765-4321");
        meuIphone.endCall();
        
        // Utilizando NavegadorInternet
        meuIphone.browse("https://www.example.com");
        meuIphone.addBookmark("https://www.example.com");
    }
}
