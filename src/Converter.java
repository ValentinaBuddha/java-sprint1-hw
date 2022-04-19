public class Converter {
    static double oneStepLenght = 0.00075;
    static double oneStepKilocalories = 0.05;

    static void convert(int totalSumSteps) {
        double distance = totalSumSteps * oneStepLenght;
        double kiloCalories = totalSumSteps * oneStepKilocalories;
        System.out.println("Пройденная дистанция: " + distance + " км.");
        System.out.println("Сгорело: " + kiloCalories + " килокалорий.");
    }
}
