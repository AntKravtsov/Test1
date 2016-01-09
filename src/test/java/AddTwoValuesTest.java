import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTest {

    @Before
    public void consolePrint() {
        System.out.println("START!!! ");

    }
    @BeforeClass
    public static void consolePrint1() {
        System.out.println("START!!! ");

    }

    @Test
    public void testAddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));

    }
    @Test
    public void test1AddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 25, calc.add(15, 10));
    }

    @Test
    public void test2AddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 40, calc.add(20, 20));
    }
    @Test
    public void test3AddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 50, calc.add(21, 29));
    }
    @Test
    public void test4AddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 70, calc.add(40, 30));
    }
    @Test
    public void test5AddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 95, calc.add(90, 5));
    }

    @Test
    public void testMultiplyTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("4*4 must be 16", 16, calc.multiply(4, 4));
    }

    @Test
    public void testDivisionTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10/2 must be 5", 5, calc.division(10, 2));
    }

    @Test
    public void testSubstractionTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10-2 must be 8", 8, calc.subtraction(10, 2));
    }

    @Test
    public void testSqrtTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals( 10, calc.sqrt(100));
    }
    //TODO
    //add new 5 tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("END!!! ");

    }
}



