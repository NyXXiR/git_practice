import models.*;
import models.Character;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Person person = new Person();
        Person person2 = new Person("홍길동", 23);

        Hero hero = new Hero("superman");
        Hero hero2 = new Hero("batman");
        hero.attack(hero2);

        Character character = new Hero("superman2");
        Magician magician = new Magician();
        Character magician2 = new Magician();
        ICharacter magician3 = new Magician();

        if(magician2 instanceof Magician){
            System.out.println("true");

            ArrayList<Character> characterArrayList = new ArrayList<>();
            characterArrayList.add(magician);
            characterArrayList.add(magician2);
            characterArrayList.add(hero);

            System.out.println(characterArrayList.get(0));

    }
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + ":" + i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
    }).start();

    }
}

// test case number C


