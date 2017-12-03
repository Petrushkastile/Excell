import java.util.ArrayList;

public class Originator {
    private ArrayList<String>tablica;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setState(ArrayList<String> tablica) {
        this.tablica = tablica;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getState() {
        return tablica;
    }


    public MementoName saveName() {
        return new MementoName(name);
    }
    public Memento saveState() {
        return new Memento(tablica);
    }

    public void restoreName(MementoName mementoName) {
        this.name = mementoName.getName();
    }

    public void restoreState(Memento memento) {
        this.tablica = memento.getState();
    }
}
