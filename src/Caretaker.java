public class Caretaker {
    private Memento memento;
    private MementoName mementoName;
    private MementoName mementoSurname;
    private MementoName mementoAge;
    private MementoName mementoStart;

    public MementoName getMementoStart() {
        return mementoStart;
    }

    public void setMementoStart(MementoName mementoStart) {
        this.mementoStart = mementoStart;
    }

    public MementoName getMementoName() {
        return mementoName;
    }
    public void setMementoName(MementoName mementoName) {
        this.mementoName = mementoName;
    }

    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public MementoName getMementoSurname() {
        return mementoSurname;
    }

    public void setMementoSurname(MementoName mementoSurname) {
        this.mementoSurname = mementoSurname;
    }
    public MementoName getMementoAge() {
        return mementoAge;
    }
    public void setMementoAge(MementoName mementoAge) {
        this.mementoAge = mementoAge;
    }
}
