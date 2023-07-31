package HW6;

public class Cat {

    int id;
    String name;
    String furColor;
    String character;

    @Override
    public String toString() {
        return String.format("Name: %s\nID: %d\nColor: %s\nCharacter: %s", name, id, furColor, character);
    }

    public boolean equals(Object o) {
        Cat c = (Cat) o;
        return id == c.id && name == c.name;
    }

}
