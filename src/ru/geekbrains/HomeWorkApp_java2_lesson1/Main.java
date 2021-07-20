package ru.geekbrains.HomeWorkApp_java2_lesson1;

//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

//2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
// участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

//3. Создайте два массива: с участниками и препятствиями,
// и заставьте всех участников пройти этот набор препятствий.

//4. * У препятствий есть длина (для дорожки) или высота (для стены),
// а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий,
// то дальше по списку он препятствий не идет.

//5. ** Задание с enum, в материалах к уроку
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
