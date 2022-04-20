package memento;

public class Client {
    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("game at 9:00PM");
        caretaker.add(originator.saveStateMemento());

        originator.setState("game at 10:00PM");
        caretaker.add(originator.saveStateMemento());

        System.out.println("current game time: " + originator.getState());

        System.out.println("set current game to first saved version");
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("current game time: " + originator.getState());
    }
}
