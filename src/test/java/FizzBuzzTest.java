import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. if(start <= end)
    //return array;

    @Test
    public void testStartLessThanEnd_HappyPath() {
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" };

        // FizzBuzz fizzBuzz = new FizzBuzz();

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);


        Assert.assertEquals(actualResult, expectedResult);
    }

    // start == end
    @Test
    public void testStartEqualsEnd_HappyPath() {
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1" };


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);


        Assert.assertEquals(actualResult, expectedResult);
    }

    @Ignore
    @Test
    public void testStartLessThanEnd_StartEndAreNegativeHappyPath() {
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz"};


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);


        Assert.assertEquals(actualResult, expectedResult);
    }



// if (start > end}
    @Test
    public void testStartGreaterThanEnd_Narative() {
        int start = 20;
        int end = 1;
        String[] expectedResult = {};


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);


        Assert.assertEquals(actualResult, expectedResult);
    }
}
