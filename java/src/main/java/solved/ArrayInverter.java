package solved;

// the class should implement only one functionality which is inverting of integer arrays
// example: if (A == [1, 2, 3, 4]) then ( of(A) = [4, 3, 2, 1] )
// an IllegalArgumentException should be thrown if null is provided
public class ArrayInverter {

    public static int[] revert(int[] numbers) {
        if (numbers == null)
            throw  new IllegalArgumentException();
        for (int i = 0; i < numbers.length / 2; i++)
            swap(i, numbers.length - 1 - i, numbers);
        return numbers;
    }

    private static void swap(int a, int b, int[] numbers) {
        int temp;
        temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}

