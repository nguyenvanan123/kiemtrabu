import java.util.Scanner;

public class Test { 



    public static void main(String[] args) {
        Apple apple = new Apple();
        Human adam = new Human("Adam", 100, "nam");
        Human eva = new Human("Eva", 200, "nu");
        eva.say("Ăn táo không anh zai ơi?");
        adam.say("Mút em ơi...");

        while (apple.getWeight() > 0){
            eva.eat(apple);
            adam.eat(apple);
        }
        System.out.println("Hết chuyện!");
    }
}

class Apple {
    public int getWeight() {
        return weight;
    }

    protected int weight = 10;
}
class Human {
    public Human(String name, double weight, String gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getGender()
    {
        return gender;
    }

    private String name;
    private double weight;
    private String gender;

    public void say(String word) {
        System.out.println(name + ": " + word);
    }

    public void eat(Apple apple) {
        if (apple.getWeight() > 0) {
            System.out.println(name + " đã ăn 1 miếng táo!");
            weight++;
            apple.weight--;
        } else {
            System.out.println("Còn cái nịt!");
        }
    }

}