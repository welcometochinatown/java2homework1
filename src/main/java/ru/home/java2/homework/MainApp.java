package ru.home.java2.homework;

public class MainApp {
    public static void main(String[] args) {
        /*
        1. Создайте три класса Человек, Кот, Робот,
        которые не наследуются от одного класса. Эти
        классы должны уметь бегать и прыгать
        (методы просто выводят информацию о действии в
        консоль).
        2. Создайте два класса: беговая дорожка и стена,
        при прохождении через которые, участники
        должны выполнять соответствующие действия (бежать или прыгать),
        результат выполнения
        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        3. Создайте два массива: с участниками и препятствиями,
        и заставьте всех участников пройти
        этот набор препятствий.
        4. * У препятствий есть длина (для дорожки) или высота (для стены),
        а участников ограничения
        на бег и прыжки. Если участник не смог пройти одно из препятствий,
        то дальше по списку он препятствий не идет
        */

        Competitor[] competitors = {
                new Human("Bob", 5, 5),
                new Cat("Kitten", 10, 15),
                new Robot("BipBop", 15, 10)
        };

        Barrier[] barriers = {
                new Wall(5),
                new Wall(0),
                new Wall(10),
                new Wall(15),
                new Track(5),
                new Track(15),
                new Track(5)
        };

        overcomeBarriers(competitors, barriers);

    }

    public static void overcomeBarriers(Competitor[] competitors, Barrier[] barriers) {
        for (Competitor competitor : competitors) {
            for (Barrier barrier : barriers) {
                if (!barrier.make(competitor)) {
                    break;
                }
            }
        }
    }
}
