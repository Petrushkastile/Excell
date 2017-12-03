import java.util.ArrayList;

public class Memento {
    private final ArrayList<String>tablica;

    public Memento(ArrayList<String> tablica) {
        this.tablica = tablica;
    }

    public ArrayList<String> getState() {
        return tablica;
    }
}
