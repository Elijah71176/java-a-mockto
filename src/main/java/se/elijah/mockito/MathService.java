package se.elijah.mockito;

public class MathService {
   private Calculator calculator; //attribute variable

    public MathService(Calculator calculator) { //constructor
        this.calculator = calculator;
    }
        public int calculateSum(int a, int b){
            return calculator.add(a, b);
        }
        public int calculateDifference(int a, int b){
        return  calculator.subtract(a, b);
        }
    }

