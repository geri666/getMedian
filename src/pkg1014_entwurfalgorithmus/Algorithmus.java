package pkg1014_entwurfalgorithmus;

import java.util.Arrays;

/**
 *
 * @author Gergö Szijarto
 */
public class Algorithmus {

    public double getMedian(int[] numbers) {
        Arrays.sort(numbers);

        if (numbers.length % 2 == 0) { // gerade anzahl
            double firstNum = numbers[numbers.length / 2 - 1];
            double secondNum = numbers[numbers.length / 2];
            return (firstNum + secondNum) / 2;
        } else {     // ungerade anzahl
            return numbers[numbers.length / 2];
        }
    }
}
