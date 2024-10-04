import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
    private GradeBook gb1;
    private GradeBook gb2;

    @Before
    public void setUp() throws Exception {
        gb1 = new GradeBook(5);
        gb2 = new GradeBook(5);

        gb1.addScore(81.0);
        gb1.addScore(92.0);

        gb2.addScore(59.0);
        gb2.addScore(74.0);
        gb2.addScore(95.0);
    }

    @After
    public void tearDown() throws Exception {
        gb1 = null;
        gb2 = null;
    }

    @Test
        public void testAddScore() 
        {
        assertEquals("81.0 92.0 ", gb1.toString());
        assertEquals(2, gb1.getScoreSize());

        assertEquals("59.0 74.0 95.0 ", gb2.toString());
        assertEquals(3, gb2.getScoreSize());
    }

    @Test
    public void testSum() 
    {
        assertEquals(173.0, gb1.sum(), 0.001);
        assertEquals(228.0, gb2.sum(), 0.001);
    }

    @Test
    public void testMinimum() 
    {
        assertEquals(81.0, gb1.minimum(), 0.001);
        assertEquals(59.0, gb2.minimum(), 0.001);
    }

    @Test
    public void testFinalScore() 
    {
        assertEquals(92.0, gb1.finalScore(), 0.001); // 173 - 81
        assertEquals(169.0, gb2.finalScore(), 0.001); // 228 - 59
    }
}
