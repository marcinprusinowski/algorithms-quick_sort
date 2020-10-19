import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class QuickSortTest {

    @Test
    public void shouldReturnSortedArray(){
        List<Integer> numbers = new ArrayList<>(List.of(1,65,3,4124,51,531,3,1));
        List<Integer> expected = new ArrayList<>(List.of(1,1,3,3,51,65,531,4124));
        QuickSort quickSort = new QuickSort(numbers);

        numbers = quickSort.sort();

        Assertions.assertIterableEquals(expected , numbers);
    }

}