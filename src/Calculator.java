public class Calculator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in); 
        System.out.println("gbgbgyby");
        
        System.out.println("tarik");

        
        int num = scan.nextInt(); 

        int num = calcultor(500, 250, '+');
        System.out.println(num);
        System.out.println("some m");
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
