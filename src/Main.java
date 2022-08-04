import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        System.out.println("Задача №1");
        System.out.println();

        double generalSumOfMonth = 0;

        for(int sum : arr) {
            generalSumOfMonth += sum;
        }
        System.out.println("Сумма затрат за месяц составила " + (int) generalSumOfMonth + " рублей");


        System.out.println("Задача №2");
        System.out.println();

        int minSumOfDay = arr[0];
        int maxSumOfDay = arr[arr.length - 1];

        System.out.println("Минимальная сумма трат за день составила " + minSumOfDay + " рублей" );
        System.out.println("Максимальная сумма трат за день составила " + maxSumOfDay + " рублей" );



        System.out.println("Задача №3");
        System.out.println();

        double computedAverageSumOfMonth = generalSumOfMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + (int) computedAverageSumOfMonth * 1 + " рублей");



        System.out.println("Задача №4");
        System.out.println();

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
