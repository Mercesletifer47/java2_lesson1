package ru.geekbrains.HomeWorkApp_java2_lesson1;
public class Main {
    public static void main(String[] args) {
        Being[] beings = {new Cat("Barsik", 10, 1),
                new Cat("Mursik", 20, 2),
                new Human("Jack", 200, 3),
                new Human("John", 150, 4),
                new Robot("HAVAL H9", 5000, 20),
                new Robot("RoboCop", 4000, 25)};
        Let[] lets = {new Treadmill(10), new Wall(1),
                new Treadmill(100), new Wall(3),
                new Treadmill(1000), new Wall(10)};
        boolean isHappened;
        for (Being being : beings) {
            isHappened = true;
            for (Let let : lets) {
                if (let instanceof Treadmill && !being.run((Treadmill) let)) {
                    isHappened = false;
                    break;
                } else if (let instanceof Wall && !being.jump((Wall) let)) {
                    isHappened = false;
                    break;
                }
            }
            if (!isHappened) continue;
        }
    }
}
