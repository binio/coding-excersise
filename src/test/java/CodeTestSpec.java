import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.function.Function;

/*
 *   Please code the tests in the format of reverseArray_returnsExpectedResult. This is an example of how we write our tests at Cardano.
 *
 *   Test 1-4 tests are easy as the function returns a result that can be asserted. Tests 5-7 are more difficult to assert as they are
 *   void, use your knowledge to write a meaningful test.
 *
 *   Feel free to use the internet to help you with you answers but make sure you understand the answer as we will ask you questions.
 */

public class CodeTestSpec {
    @Test
    public void reverseArray_returnsExpectedResult() {
        // arrange
        final String[] EXPECTED = {"x", "y", "z"};

        // act
        final String[] actual = CodeTest.reverseArray(new String[] {"z", "y", "x"});

        // assert
        assertArrayEquals(EXPECTED, actual);
    }

    @Test
    public void reverseArrayV2_returnsExpectedResult() {
        // arrange
        final String[] EXPECTED = {"x", "y", "z"};

        // act
        final String[] actual = CodeTest.reverseArrayV2(new String[] {"z", "y", "x"});

        // assert
        assertArrayEquals(EXPECTED, actual);
    }

    @Test
    public void uppercaseArray_returnsExpectedResult() {
        // arrange
        final String[] EXPECTED = {"XXX","YYY", "ZZZ"};

        // act
        final String[] actual = CodeTest.uppercaseArray(new String[] {"xXx", "yyY", "zzZ"});

        // assert
        assertArrayEquals(EXPECTED, actual);
    }

    @Test
    public void findWordCount_returnsExpectedResult() {
        // arrange
        String sentence1 = "the cat jumped over the mat";
        String sentence2 = "my mum is taller than your mum and his mum";
        String sentence3 = "the cat jumped over the mat";

        // assert
        assertEquals(2, CodeTest.findWordCount(sentence1, "the"));
        assertEquals(3, CodeTest.findWordCount(sentence2, "mum"));
        assertEquals(0, CodeTest.findWordCount(sentence3, "sun"));
    }

    @Test
    public void composeU_returnsExpectedResult() {

        Function<Integer, Integer> f1 = x -> x + 1;
        Function<Integer, Integer> f2 = x -> x * 10;

        Integer result = CodeTest.composeU(f1,f2).apply(1);
        assertEquals(new Integer(20), result);

    }

    @Test
    public void writeContentsToConsole_returnsExpectedResult() {

    }

    @Test
    public void handleInvalidArgument_returnsExpectedResult() {

    }

    @Test
    public void puzzle_returnsExpectedResult() {

    }
}
