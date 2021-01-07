import com.ozlop.TwoSum;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    private final int targetExample1 = 9;

    private final int targetExample2 = 6;

    private final int targetExample3 = 6;

    private final int[] numsExample1 = { 2, 7, 11, 15 };

    private final int[] numsExample2 = { 3, 2, 4 };

    private final int[] numsExample3 = { 3, 3 };

    private final int[] expectedExample1 = { 0, 1 };

    private final int[] expectedExample2 = { 1, 2 };

    private final int[] expectedExample3 = { 0, 1 };


    @Test
    public void twoSumBruteForce_Example1_IsCorrect() {
        int[] actual = twoSum.twoSumBruteForce(numsExample1, targetExample1);

        assertEquals(expectedExample1[0], actual[0]);
        assertEquals(expectedExample1[1], actual[1]);
        assertEquals(targetExample1, Arrays.stream(actual).reduce(0, (total, element) -> total + numsExample1[element]));
    }

    @Test
    public void twoSumBruteForce_Example2_IsCorrect() {
        int[] actual = twoSum.twoSumBruteForce(numsExample2, targetExample2);

        assertEquals(expectedExample2[0], actual[0]);
        assertEquals(expectedExample2[1], actual[1]);
        assertEquals(targetExample2, Arrays.stream(actual).reduce(0, (total, element) -> total + numsExample2[element]));
    }

    @Test
    public void twoSumBruteForce_Example3_IsCorrect() {
        int[] actual = twoSum.twoSumBruteForce(numsExample3, targetExample3);

        assertEquals(expectedExample3[0], actual[0]);
        assertEquals(expectedExample3[1], actual[1]);
        assertEquals(targetExample3, Arrays.stream(actual).reduce(0, (total, element) -> total + numsExample3[element]));
    }

    @Test
    public void twoSumHashMap_Example1_IsCorrect() {
        int[] actual = twoSum.twoSumHashMap(numsExample1, targetExample1);

        assertEquals(expectedExample1[0], actual[0]);
        assertEquals(expectedExample1[1], actual[1]);
        assertEquals(targetExample1, Arrays.stream(actual).reduce(0, (total, element) -> total + numsExample1[element]));
    }

    @Test
    public void twoSumHashMap_Example2_IsCorrect() {
        int[] actual = twoSum.twoSumHashMap(numsExample2, targetExample2);

        assertEquals(expectedExample2[0], actual[0]);
        assertEquals(expectedExample2[1], actual[1]);
        assertEquals(targetExample2, Arrays.stream(actual).reduce(0, (total, element) -> total + numsExample2[element]));
    }

    @Test
    public void twoSumHashMap_Example3_IsCorrect() {
        int[] actual = twoSum.twoSumHashMap(numsExample3, targetExample3);

        assertEquals(expectedExample3[0], actual[0]);
        assertEquals(expectedExample3[1], actual[1]);
        assertEquals(targetExample3, numsExample3[0] + numsExample3[1]);
        assertEquals(targetExample3, Arrays.stream(actual).reduce(0, (total, element) -> total + numsExample3[element]));
    }

}
