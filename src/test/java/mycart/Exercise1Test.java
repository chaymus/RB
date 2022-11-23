package mycart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise1Test {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void runExerciseOriginal_givenMatchingItems_returnsOrder2() {
        Exercise1 exercise1 = new Exercise1();
        exercise1.runExerciseOriginal();
        assertEquals("[OrderId: 2]", outputStreamCaptor.toString().trim());
    }

    @Test
    public void runExerciseFunctional_givenMatchingItems_returnsOrder2() {
        Exercise1 exercise1 = new Exercise1();
        exercise1.runExerciseFunctional();
        assertEquals("[OrderId: 2]", outputStreamCaptor.toString().trim());
    }
}