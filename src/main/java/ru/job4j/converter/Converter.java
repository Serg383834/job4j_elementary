package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */

    }

    public static void main(String[] args)  {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        float inEuro = 140;
        float inDollar = 180;
        float expectedEuro = 2;
        float expectedoDollar = 3;

        float outEuro = Converter.rubleToEuro(inEuro);
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedoDollar == outDollar;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        System.out.println("120 rubles are 2 dollar. Test result : " + passedDollar);
    }
}
