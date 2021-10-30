package ru.netology;

public class BonusMilesService {

    int mileCost = 20; // Рублей за одну бонусную милю
    int calculationByMile; // Миль за покупку билета

    public int calculate(int cost) {
        calculationByMile = cost / mileCost;
        return calculationByMile;
    }
}
