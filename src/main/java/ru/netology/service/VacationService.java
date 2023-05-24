package ru.netology.service;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отпуска
        int money = 0; // остаток денег на начало следующего месяца с учетом прихода и расхода
        for (int month = 0; month < 12; month++) {
            if (money < threshold) { // продолжает работать
                money = money + income - expenses; // отстаток денег в месяце без отпуска
            } else {
                money = (money - expenses) / 3; // остаток денег после отпуска
                count++;
            }
        }
        return count;

    }
}
