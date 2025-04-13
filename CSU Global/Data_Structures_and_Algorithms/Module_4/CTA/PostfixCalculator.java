// Dylan Nelson
// April 12, 2025
// PostfixCalculator.java

/* This java script will evaluate expressions that are in postfix notation.
 * The script is also capable of evaluating the postfix expressions that are
 * within a filepath separated by newlines. 
 * 
 * The script is intelligent enough to notify the user when they entered an 
 * invalid postfix expression and when they have an expression that attempts
 * to divide by zero.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostfixCalculator {
    public String evaluatePostfix(String postfixExpression) {
        
        // Split the input into tokens separated by spaces.
        String[] tokens = postfixExpression.split(" ");
        Stack<Integer> operandStack = new Stack<Integer>();

        // Create variables.
        int number, a, b;
        double result;

        // Parse through the tokens.
        for (String token : tokens) {
            // try to convert the tokens to an integer
            try {
                number = Integer.parseInt(token);
                operandStack.add(number);
                // Add to the stack
            } catch (NumberFormatException e) {
                // This specific failure indicates that it was not a number.

                if (operandStack.size() < 2) {
                    return "Invalid postfix expression.";
                }

                // Pop two of the operands off of the stack, these will be used to
                //  perform the operations.
                a = operandStack.pop();
                b = operandStack.pop();
                
                // Using the switch case we can go through the order of operations
                //  with PEMDAS.
                switch (token) {

                    // There are no parenthesis in postfix notation so we start with 
                    //  exponents.
                    case "^" : 
                    result = Math.pow(b, a);
                    operandStack.push((int) result);
                    break;

                    // Multiplication next.
                    case "*" : 
                    result = b * a;
                    operandStack.push((int) result);
                    break;

                    // Division.
                    case "/" : 
                    if (a != 0) {
                        result =  b / a;
                        operandStack.push((int) result);
                    } else {
                        // Check for trying to divide by zero.
                        return "Cannot divide by zero.";
                    }
                    break;

                    // Modulus.
                    case "%" : 
                    if (a != 0) {
                        result =  b % a;
                        operandStack.push((int) result);
                    } else {
                        // Check for trying to divide by zero.
                        return "Cannot divide by zero.";
                    }
                    break;

                    // Addition.
                    case "+" : 
                    result = b + a;
                    operandStack.push((int) result);
                    break;

                    // Subtraction
                    case "-" : 
                    result = b - a;
                    operandStack.push((int) result);
                    break;

                    // The default condition is one where it does not recognize
                    //  the condition.
                    default :
                    return "Invalid postfix expression.";
                } 
            }
        }

        // Checks if the size of the stack has been reduced to 1 element
        //  if it has then pop it and return the string version of the popped
        //  element. If not then the expression is invalid.
        if (operandStack.size() == 1) {
            return String.valueOf(operandStack.pop());
        } else {
            return "Invalid postfix expression.";
        }
    }

    public void readExpressionFile(PostfixCalculator calculator) throws FileNotFoundException, IOException {
        
        // Provide the filepath.
        String path = "expressions_to_evaluate.txt";
        // Create a list for holding the expressions.
        List<String> fileContents = new ArrayList<>();
        // Create a reader object.
        BufferedReader bfro = new BufferedReader(
                            new FileReader(path));
        // Declare a String for reading in the expressions.
        String st, expression;
        // Create an integer for the length of the stack.
        int length;

        // While the end of the file has not been reached, read each line.
        while ((st = bfro.readLine()) != null) {
            fileContents.add(st);
        }

        // Assign length to be the size of the stack.
        length = fileContents.size();

        // Iterate through each element in the list.
        for (int i = 0; i < length; i++ ) {
            expression = fileContents.get(i);
            System.out.println("File Result " + (i+1) + ": " + calculator.evaluatePostfix(expression));
        }

    }
    public static void main(String[] args) throws Exception {
        PostfixCalculator calculator = new PostfixCalculator();

        // Example 1: Valid Expression
        String expression1 = "4 2 * 3 +";
        System.out.println("Result 1: " + calculator.evaluatePostfix(expression1));

        // Example 2: Valid Expression
        String expression2 = "5 3 + 7 *";
        System.out.println("Result 2: " + calculator.evaluatePostfix(expression2));

        // Example 3: Invalid Expression
        String expression3 = "4 2 * +"; // Missing operand
        System.out.println("Result 3: " + calculator.evaluatePostfix(expression3));

        // Example 3: Invalid Expression
        String expression4 = "4 4 + 0 /"; // Missing operand
        System.out.println("Result 4: " + calculator.evaluatePostfix(expression4));

        // Call the function to read the file.
        calculator.readExpressionFile(calculator);
    }
}
