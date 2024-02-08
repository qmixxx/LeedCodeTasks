
import org.junit.jupiter.api.Test;
import org.leetcode.easy.MajorityElement;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MajorityElementTest {

    @Test
    public void majorityElementTest() {

        MajorityElement major = new MajorityElement();

        assertEquals(
                0,
                major.majorityElement(new int[] {1, 2, 3, 0, 0, 0}),
                "Error"
        );

        assertEquals(
                2,
                major.majorityElement(new int[] {3, 2, 2}),
                "Error"
        );

        assertEquals(
                3,
                major.majorityElement(new int[] {2,4, 4, 3, 3, 3, 2}),
                "Error"
        );

        assertEquals(
                2,
                major.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}),
                "Error"
        );

        assertEquals(
                1,
                major.majorityElement(new int[] {2, 1, 3, 4, 1, 1, 4, 1}),
                "Error"
        );





    }

}
