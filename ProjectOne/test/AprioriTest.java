import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AprioriTest {

    @Test
    public void algorithm() {
        // Arrange
        int[][] input = new int[][]{
                {1,3,4},
                {2,3,5},
                {1,2,3,5},
                {2,5}
        };
        Apriori test = new Apriori();
        int[] answer = {2,3,5};

        // Act
        int[] results = test.algorithm();

        // Assert
        Assert.assertArrayEquals(answer, results);
    }

    @Test
    public void candidateGeneration() {
    }
}