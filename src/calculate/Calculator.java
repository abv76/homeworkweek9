package calculate;
/*
1. Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
 */

public class Calculator {


    // 1. Instance method
    int result;

    public void addition(int a, int b) {
        result = a + b;

        System.out.println(result);

    }
    //2. Instance method

    public void subtraction(int a, int b) {
        result = a - b;

        System.out.println(result);
    }

    public void division(int a, int b) {
        result = a / b;

        System.out.println(result);

    }

    public void multiplication(int a, int b) {
        result = a * b;
        System.out.println(result);
    }


    public void calculateResult(int a, int b, char symbol) {

        switch (symbol) {
            case '+':
                result = a + b;
                System.out.println("\nAddition of " + a + " and " + b + " is " + (a + b));
                //System.out.println(result);
                break;
            case '-':
                result = a - b;
                //System.out.println(result);
                System.out.println("\nSubtraction of " + a + " and " + b + "  is  " + (a - b));
                break;
            case '/':
                result = a / b;
                System.out.println("\ndivision of " + a + " and " + b + "  is  " + (a / b));
                // System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println("\nMultiplication of " + a + " and " + b + "  is  " + (a * b));

                // System.out.println(result);
                break;
            default:
                System.out.println("Invalid Symbol");
                break;


        }


    }

}




