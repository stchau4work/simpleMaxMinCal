import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.junit.Assert.assertEquals;


public class SimpleCalServiceTest {

    private ArrayList<Integer> sortedNumbers;
    private SimpleCalService simpleCalService;
    private final static int SIZE = 5;
    private final static int MAX = 100;

    @Before
    public void setUp() throws Exception {
        int[] simpleArray = new int[SIZE];
        this.sortedNumbers = new ArrayList<Integer>();
        Random generator = new Random();
        this.simpleCalService = new SimpleCalService(simpleArray);

        for (int i = 0; i < SIZE; i++){
            simpleArray[i] = generator.nextInt(MAX);
        }
        
        for( int i=0; i< SIZE; i++){
            sortedNumbers.add(simpleArray[i]);
        }
        Collections.sort(sortedNumbers);
    }

    @Test
    public void testGetMax() throws Exception {
        int max = sortedNumbers.get(SIZE-1);
        assertEquals(max, simpleCalService.findMax());
    }

    @Test
    public void testGetMin() throws Exception {
        int min = sortedNumbers.get(0);
        assertEquals(min, simpleCalService.findMin());
    }

    @Test
    public void testGetMaxDelta() throws Exception {
        int max = sortedNumbers.get(SIZE-1);
        int min = sortedNumbers.get(0);
        assertEquals(max-min, simpleCalService.calculateMaxDelta());
    }


    @Test
    public void testPerformanceForGetMaxDelta() throws Exception {
        long startTime = System.nanoTime();

        simpleCalService.calculateMaxDelta();

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.printf("Used time is: %d milli-second \n",  elapsedTime );
    }



}
