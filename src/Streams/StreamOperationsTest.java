package Streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StreamOperationsTest {

    @Test
    public void testGetEvenNumbers(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = StreamOperations.getEvenNumbersIn(numbers);
        assertNotNull(evenNumbers);
        assertEquals(5, evenNumbers.size());
    }

}