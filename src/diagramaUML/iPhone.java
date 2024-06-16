package diagramaUML;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
    }

    @Override
    public void next() {
        System.out.println("Next track...");
    }

    @Override
    public void previous() {
        System.out.println("Previous track...");
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Receiving call from " + number + "...");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call...");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void browse(String url) {
        System.out.println("Browsing to " + url + "...");
    }

    @Override
    public void addBookmark(String url) {
        System.out.println("Adding bookmark: " + url);
    }
}
