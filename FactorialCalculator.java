import java.util.Scanner; 

public class FactorialCalculator{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 200 to exit");

        while(true){
        double num = getNum();
        double factorialNum = calcFactorial(num);

        System.out.println("Factorial: " + num + "  =  " + factorialNum);
        }        
    }

    public static double getNum(){
        Scanner scanner = new Scanner(System.in);

        double num = 0;

        System.out.print("Enter the whole number to factorialize: ");
        num = scanner.nextDouble();
        if(num == 100.0){
            System.exit(0);
        }

        return num;
    }

    public static double calcFactorial(double num){
        double factorialNum = num;

        for(double i = (num - 1.0); i >= 2.0; i--){
            factorialNum = factorialNum * i;
        }

        return factorialNum;
    }  
    
}
