package lab17;
/*
    Задача:
    Написать библиотеку, подсчитыввающая определенный интеграл


 */
public class Main {
    public static void main(String[] args) {
        CalculateIntegralLeft calculateIntegralLeft =
                new CalculateIntegralLeft(0, Math.PI / 2, new Sinus());
        System.out.println("Подсчет слева - " + calculateIntegralLeft.get());

        CalculateIntegralRight calculateIntegralRight =
                new CalculateIntegralRight(0, Math.PI / 2, new Sinus());
        System.out.println("Подсчет справа - " + calculateIntegralRight.get());

        CalculateIntegralMiddle calculateIntegralMiddle =
                new CalculateIntegralMiddle(0, Math.PI / 2, new Sinus());
        System.out.println("Подсчет по центру - " + calculateIntegralMiddle.get());

        CalculateIntegralTrapezia calculateIntegralTrapezia =
                new CalculateIntegralTrapezia(0, Math.PI / 2, new Sinus());
        System.out.println("Подсчет трапеции - " + calculateIntegralTrapezia.get());

    }
}