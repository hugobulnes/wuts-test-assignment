import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Assignment1Test {

    private final Assignment1 assignment = new Assignment1();
    private int[] testVolumes = {3,4,8,-1,2,4}; 

    @Test
    void twototheLeft() {

        assignment.rorateKnobLeft(testVolumes, 2);

        System.out.println(testVolumes.toString());

        assertEquals(8, testVolumes[0]);
    }

    @Test
    void twototheRight() {

        assignment.rorateKnobRight(testVolumes, 2);

        assertEquals(300, testVolumes[0]);
    }

}