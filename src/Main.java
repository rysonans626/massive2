public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println(sum + " - сумма всех зарплат");
        System.out.println(sum / 30 + " - средняя зп за месяц");
        int maxWeight = arr[0];
        int minWeight = arr[0];
        for (final int a : arr) {
            if (a > maxWeight) {
                maxWeight = a;
            }
        }
        System.out.println(minWeight + " минимальная зп");
        System.out.println(maxWeight + " максимальная зп");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}