package se.elijah.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MathServiceTest {

    @Mock
    private  Calculator calculator;

    @InjectMocks
    private MathService mathService;

    @Test
    public void testCalculateSum(){
        Mockito.when(calculator.add(10,10)).thenReturn(20);
        int sum = mathService.calculateSum(10,10);
        assertEquals(20, sum);
    }

    @Test
    public void testcalculateDifference(){
        Mockito.when(calculator.subtract(20,5)).thenReturn(15);
        int sum = mathService.calculateDifference(20,5);
        assertEquals(15, sum);
    }
}