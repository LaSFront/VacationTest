package ru.netology.service;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отпуска
        int money = 0; // остаток денег на начало следующего месяца с учетом прихода и расхода
        int monthExpenses = 0; // все траты за месяц
        for (int month = 0; month < 12; month++) {
            if (money < threshold) { // продолжает работать
                monthExpenses = expenses; // траты за месяц
                money = money + income - expenses; // отстаток денег в месяце без отпуска
            } else {
                monthExpenses = money - (money - expenses) / 3; //траты за месяц
                money = (money - expenses) / 3; // остаток денег после отпуска
                count++;
            }
        }
        return count;

    }
}
