package se.elijah.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
    public class CalculatorTest{

    @Mock
    private Calculator calculator;

    @Test
    public void testCalculatorMethods(){
        Mockito.when(calculator.add(5,5)).thenReturn(10);
        int sum = calculator.add(5,5);
        assertEquals(10, sum);

    }
    @Test
    public void testCalculatorSubtract(){
        Mockito.when(calculator.subtract(20,5)).thenReturn(15);
        int sum = calculator.subtract(20,5);
        assertEquals(15,sum);

    }
}