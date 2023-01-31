package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EquilibriumIndexTest {

    @Test
    public void equilibriumIndexCostlyTest() {
        int[] A = {10,5,15,3,4,21,2};
        Assertions.assertEquals(EquilibriumIndex.equilibriumIndexCostly(A), 2 );
    }

    @Test
    public void equilibriumIndexTest() {
        int[] A = {10,5,15,3,4,21,2};
        Assertions.assertEquals(EquilibriumIndex.equilibriumIndex(A), 2 );
    }
}
