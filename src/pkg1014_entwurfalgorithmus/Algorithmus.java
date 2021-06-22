package pkg1014_entwurfalgorithmus;

import java.util.Arrays;

/**
 *
 * @author Gergö Szijarto
 */
public class Algorithmus {

    public double getMedian(int[] numbers) {
        Arrays.sort(numbers); // sortiert den array, das vereinfacht das ermitteln des medians

        if (numbers.length % 2 == 0) { // gerade anzahl zahlen im array
            double firstNum = numbers[numbers.length / 2 - 1]; // firstnum ist die nummer an der stelle vor der mittleren zahl
            double secondNum = numbers[numbers.length / 2];
            return (firstNum + secondNum) / 2;
        } else {     // ungerade anzahl zahen im array
            return numbers[numbers.length / 2];
        }
    }
}
