public class Calculator {

    public static void main(String[] args) {

        int num = calcultor(500, 250, '+');
        System.out.println(num);
    }

    public static int calcultor(int x, int y, char operator){

        int result = 0;

        switch (operator){
            case '+':
                result = x + y;
                return result;

            case '-':
                result = x - y;
                return result;
            case '*':
                result =  x * y;
                return result;
            case '/':
                result = x / y;
                return result;
        }
        return result;
    }

}
