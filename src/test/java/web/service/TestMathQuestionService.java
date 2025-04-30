package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

    @Test
    public void testAdditionCorrect() {
        Assert.assertEquals(3.0, MathQuestionService.q1Addition("1", "2"), 0);
    }

    @Test
    public void testAdditionWithEmptyInput() {
        try {
            MathQuestionService.q1Addition("", "2"); 
            Assert.fail("Expected NumberFormatException for empty input");
        } catch (NumberFormatException e) {
            // expected
        }
    }

    @Test
    public void testSubtractionCorrect() {
        Assert.assertEquals(2.0, MathQuestionService.q2Subtraction("5", "3"), 0);
    }

    @Test
    public void testMultiplicationCorrect() {
        Assert.assertEquals(15.0, MathQuestionService.q3Multiplication("3", "5"), 0);
    }

    @Test
    public void testMultiplicationWithEmptyInput() {
        try {
            MathQuestionService.q3Multiplication("", "5");
            Assert.fail("Expected NumberFormatException for empty input");
        } catch (NumberFormatException e) {
            // expected
        }
    }
}
