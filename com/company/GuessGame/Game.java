package com.company.GuessGame;

import static java.lang.System.out;

public class Game {
    //переменные экземпляра для трёх объектов Player.
    Player p1;
    Player p2;
    Player p3;

    //в методе startGame воздаются три объекта Player им присваиваем переменные экземпляра
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //объявляются три переменные для хранения вариантов от каждого игрока.
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        //объявляются три переменные для хранения правильности или неправильности ответов игроков
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //создаётся число, которое игроки должны угадать
        int targetNumber = (int) (Math.random() * 10);
        out.println("Я загадваю число от 0 до 9 ....");

        while (true) {
            out.println("Число, которок нужно угдадать. - " + targetNumber);
            //вызываем метод guess() из каждого объекта Player;
            p1.guess();
            p2.guess();
            p3.guess();

            // извлечение вариантов каждого игрока (результаты раоты их методов guess()), получая доступ к их переенным number
            guessp1 = p1.number;
            out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p2.number;
            out.println("Второй игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            out.println("Третий игрок думает, что это " + guessp3);

            //Проверка вариантов каждого из игроков на соответствие заданному числу

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }

            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                out.println("У нас есть победитель!");
                if (guessp1 == targetNumber) {
                    System.out.println("Первый игрок угадал! " + guessp1);
                }
                if (guessp2 == targetNumber) {
                    System.out.println("Второй игрок угадал! " + guessp2);
                }

                if (guessp3 == targetNumber) {
                    System.out.println("Третий игрок угадал! " + guessp3);
                }

                out.println("Конец игры."); //игра окончена, так что цикл приррывается.
                break;

            } else
                out.println("Никто не угадал. Попробуйте ещё раз."); //игра окончена, так что цикл преррывается.

        }
    }
}
