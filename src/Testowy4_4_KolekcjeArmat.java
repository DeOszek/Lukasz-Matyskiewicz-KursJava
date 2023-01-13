import java.util.*;

class Cannon {

    boolean loaded = false;

    public void fire() {

        if (loaded == false) {

            System.out.println("There is no cannonball in the canon!");
            System.out.println("Cannon is loaded");
            loaded = true;
            System.out.println("Cannon is ready to fire!!!");

        } else {

            System.out.println("AIM...... FIRE!!!!!");
            loaded = false;

        }
    }
}

public class Testowy4_4_KolekcjeArmat {
    public static void main(String[] args) throws java.lang.Exception {

        List<Cannon> cannon = new LinkedList<>();

        for (int i = 0; i < 5; i++) {

            cannon.add(new Cannon());

        }

        System.out.println("Number of cannons you own: " + cannon.size());
        for (int n = 0; n < cannon.size(); n++) {
            System.out.println("Cannon nr: " + (n + 1));
            cannon.get(n).fire();

        }

    }

}
