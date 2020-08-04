import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal human = new Human();
        Animal bird = new Bird();
        Animal fish = new Fish();
        ArrayList<Animal> list = new ArrayList<>();
        list.add(bird);
        list.add(human);
        list.add(fish);
        for (Animal element : list)
            element.walk();
    }
}
