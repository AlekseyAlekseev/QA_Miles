package ru.netology;

public class BonusMilesService {

    int mileCost = 20; // Рублей за одну бонусную милю

    public int calculate(int cost) {
        return cost / mileCost;
    }
}
