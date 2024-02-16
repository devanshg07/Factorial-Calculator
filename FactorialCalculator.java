import java.util.Scanner; 

public class FactorialCalculator{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int num = getNum();
        int factorialNum = calcFactorial(num);

        System.out.println("Factorial: " + num + "  =  " + factorialNum);

        
    }

    public static int getNum(){
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter the whole number to factorialize: ");
        num = scanner.nextInt();

        return num;
    }

    public static int calcFactorial(int num){
        int factorialNum = num;

        for(int i = (num - 1); i >= 2; i--){
            factorialNum = factorialNum * i;
        }

        return factorialNum;
    }  
    
}
