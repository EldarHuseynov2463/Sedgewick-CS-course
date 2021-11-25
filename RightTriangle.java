public class RightTriangle{
        public static void main(String[] args){
                int number1 = Integer.parseInt(args[0]);
                int number2 = Integer.parseInt(args[1]);
                int number3 = Integer.parseInt(args[2]);
                int max = Math.max(number1, number2);
                max = Math.max(max, number3);
                long mult1 = number1*number1;
                long mult2 = number2*number2;
                long mult3 = number3*number3;
                long maxmult = max*max;
                long triangleChecker = maxmult*2 - mult1 - mult2 - mult3;
                boolean arePositive = (number1 > 0) && (number2 > 0) && (number3 > 0);
                boolean isTriangle = ((triangleChecker == 0) && arePositive);
                System.out.println(isTriangle);
        }
}
