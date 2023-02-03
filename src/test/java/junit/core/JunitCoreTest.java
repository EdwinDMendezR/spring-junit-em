package junit.core;


import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import static org.junit.Assert.assertEquals;

public class JunitCoreTest {

    @Test
    public void methodTest() {

        // Arrange
        Result result = JUnitCore.runClasses(JunitCoreTest.class);
        assertEquals(0, result.getFailureCount());

        // Act

        // Assert

    }

}
