import java.util.Arrays;


//Задание 1

public class Main {
    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int element : arr) {

        }


        //Задание 2
        public static void task2(){
            int[] arr=generateRandomArray();
            System.out.println(Arrays.toString(arr));

            int min = arr[0];
            for (int i = 1; i < arr.length - 1; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

            int max = arr[0];
            for (int i = 1; i < arr.length - 1; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей\n");
        }
        //Задание 3
        public static void task3 () {
            int[] arr = generateRandomArray();
            System.out.println(Arrays.toString(arr));

            int sum = 0;
            for (int element : arr) {
                sum += element;
            }
            float average = sum / (float) arr.length;
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей\n");
        }


        //Задание 4

        public static void task4 () {

            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }

        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }
}
