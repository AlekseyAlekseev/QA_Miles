package ru.netology;

public class Main {
    public static void main(String[] args) {

        int ticketPrice = 250; // Стоимость билета

        int mileCost = 20; // Рублей за одну бонусную милю

        int calculationByMile = ticketPrice / mileCost; // Расчет миль за покупку билета

        System.out.println("\nCпасибо за покупку!\n\nНакоплено миль: " + calculationByMile);
    }
}
