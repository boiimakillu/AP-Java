import Unit9Lab2.*;

public class Unit9Lab2 {
    public static void main(String[] args) {
        Cow c = new Cow("cow", "moo");
        System.out.println(c.getType() + " goes " + c.getSound());
        Farm farm = new Farm();
        farm.animalSounds();
    }

}
