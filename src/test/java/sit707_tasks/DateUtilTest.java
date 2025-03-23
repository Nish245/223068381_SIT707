package sit707_tasks;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223068381";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Nishant Khamkar";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	// ===== Test cases for Expected Next Date (1B–13B) =====

	@Test public void testCase1B() {
        DateUtil date = new DateUtil(1, 6, 1994);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test public void testCase2B() {
        DateUtil date = new DateUtil(2, 6, 1994);
        date.increment();
        Assert.assertEquals(3, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test public void testCase3B() {
        DateUtil date = new DateUtil(15, 6, 1994);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test public void testCase4B() {
        DateUtil date = new DateUtil(30, 6, 1994);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test public void testCase5B() {
        DateUtil date = new DateUtil(15, 1, 1994);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test public void testCase6B() {
        DateUtil date = new DateUtil(15, 2, 1994);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test public void testCase7B() {
        DateUtil date = new DateUtil(28, 2, 1994);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test public void testCase8B() {
        DateUtil date = new DateUtil(29, 2, 1996); // leap year
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1996, date.getYear());
    }

    @Test public void testCase9B() {
        DateUtil date = new DateUtil(15, 11, 1994);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test public void testCase10B() {
        DateUtil date = new DateUtil(15, 12, 1994);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test public void testCase11B() {
        DateUtil date = new DateUtil(31, 12, 1994);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1995, date.getYear());
    }

    @Test public void testCase12B() {
        DateUtil date = new DateUtil(15, 6, 2023);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test public void testCase13B() {
        DateUtil date = new DateUtil(15, 6, 2024);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
}
