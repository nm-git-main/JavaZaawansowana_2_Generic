public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<Osoba> osobaBox = new Box<>();
        integerBox.setValue(5);
        System.out.println(integerBox.getValue());
        stringBox.setValue("Maria");
        System.out.println(stringBox.getValue());
        osobaBox.setValue(new Osoba("Jan", "Kowalski"));
        System.out.println(osobaBox.getValue().getImie());
        String imie2 = stringBox.getValue();
        ObjectBox objectBox = new ObjectBox();
        objectBox.setObject("Janusz");
        String imie = (String)objectBox.getObject();
    }
}
