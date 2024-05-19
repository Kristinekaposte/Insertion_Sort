
public class Main {
    public static void main(String[] args) {
        int[] sizesSmall = {20, 50, 150};
        int[] sizesLarge = {10000, 20000, 50000};

        for (int size : sizesSmall) {
            System.out.println("Results for size " + size + ":");
            long[] times = new long[10]; // stores the time taken for each of the 10 runs.
            long totalTime = 0;
            for (int i = 0; i < 10; i++) {
                int[] array = InsertionSortImpl.generateRandomArray(size);
                long startTime = System.nanoTime(); // more precise available system timer, in nanoseconds than using .currentTimeMillis().
                InsertionSortImpl.insertionSort(array);
                long endTime = System.nanoTime();
                times[i] = endTime - startTime; // stores the time taken for each run.
                totalTime += times[i];
                System.out.println("Run " + (i + 1) + ": " + times[i] / 1_000_000.0 + " ms"); // prints the time for each run in milliseconds.
            }
            System.out.println("Average time for size " + size + ": " + totalTime / 10_000_000.0 + " ms\n"); // prints the average time for the 10 runs.
        }

        for (int size : sizesLarge) {
            System.out.println("Results for size " + size + ":");
            long[] times = new long[10]; // stores the time taken for each of the 10 runs.
            long totalTime = 0;
            for (int i = 0; i < 10; i++) {
                int[] array = InsertionSortImpl.generateRandomArray(size);
                long startTime = System.nanoTime(); // more precise available system timer, in nanoseconds than using .currentTimeMillis().
                InsertionSortImpl.insertionSort(array);
                long endTime = System.nanoTime();
                times[i] = endTime - startTime; // stores the time taken for each run.
                totalTime += times[i];
                System.out.println("Run " + (i + 1) + ": " + times[i] / 1_000_000.0 + " ms"); // prints the time for each run in milliseconds.
            }
            System.out.println("Average time for size " + size + ": " + totalTime / 10_000_000.0 + " ms\n"); // prints the average time for the 10 runs.
        }
    }
}