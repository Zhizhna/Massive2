public class Main {
    public static void main(String[] args) {
        int[] moneySpendPerMonth = new int[] {1,2,3,4,5};
        for (int moneyLoss : moneySpendPerMonth) {
            System.out.println("Сумма трат за месяц составила " + moneyLoss);
        }
        int[] moneySpendPerWeek = new int[] {2,3,4,5,6};
        int biggestLoss = moneySpendPerWeek[1];
        int smallestLoss = moneySpendPerWeek[1];
        for (int moneyLoss : moneySpendPerWeek) {
            if (biggestLoss < moneyLoss) {
                biggestLoss = moneyLoss;
            }
            if (smallestLoss > moneyLoss){
                smallestLoss = moneyLoss;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + smallestLoss + " рублей.\nМаксимальная сумма трат за неделю составила " + biggestLoss + " рублей");

        int[] weeklySpend = {1, 2, 3, 4, 5};
        int totalSpend = 0;
        for (int moneyLoss : weeklySpend) {
            totalSpend += moneyLoss;
        }
        double averageExpenses = (double) totalSpend / weeklySpend.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int letter = reverseFullName.length - 1; letter >= 0; letter--) {
            System.out.print(reverseFullName[letter]);
        }
        //for (int i = 0; i < reverseFullName.length/2; i++) {
           // char freeChar = reverseFullName[i];
           // reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
          //  reverseFullName[reverseFullName.length - i - 1] = freeChar;
       // }
        //System.out.println(reverseFullName);
    }
}