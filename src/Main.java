import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] moneySpendPerMonth = new int[]{1,2,3,4,5};
        for (int j : moneySpendPerMonth) {
            System.out.println("Сумма трат за месяц составила " + j);
        }
        int[] moneySpendPerWeek = new int[]{2,3,4,5,6};
        int biggestLoss = moneySpendPerWeek[1];
        int smallestLoss = moneySpendPerWeek[1];
        for (int j : moneySpendPerWeek) {
            if (biggestLoss < j) {
                biggestLoss = j;
            }
            if (smallestLoss > j){
                smallestLoss = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + biggestLoss + " рублей.\nМаксимальная сумма трат за неделю составила " + smallestLoss + " рублей");

        int[] weeklySpend = {1, 2, 3, 4, 5};
        int totalSpend = 0;
        for (int i : weeklySpend) {
            totalSpend += i;
        }
        double averageExpenses = (double) totalSpend / weeklySpend.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char freeChar = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = freeChar;
        }
        System.out.println(reverseFullName);
    }
}