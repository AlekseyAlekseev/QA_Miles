package ru.netology;

public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10000; // Стоимость билета

        int miles = service.calculate(ticketPrice);



        System.out.println("\nCпасибо за покупку!\n\nНакоплено миль: " + miles);
    }
}
