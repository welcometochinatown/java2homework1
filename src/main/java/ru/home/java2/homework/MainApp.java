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

        CanRunAndJump[] canRunAndJump = {
                new Human("Bob"),
                new Cat("Barsik"),
                new Robot("BipBop")
        };

        for (CanRunAndJump c : canRunAndJump) {
            c.run();
            c.jump();
        }
    }
}