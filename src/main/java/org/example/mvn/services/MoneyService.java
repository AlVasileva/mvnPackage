package org.example.mvn.services;

public class MoneyService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month < 12; month++) {
            ;
            if (money >= threshold) { //можем ли отдыхать
                count++;//увеличиваем счетчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }

}


