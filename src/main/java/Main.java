import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("welcome to the calculator");
    System.out.println("Enter a command:");
    while (true) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String input = reader.readLine();
      String[] inputs = input.split(" ");
      String func = inputs[0];
      Calculator c = new Calculator();
      String result = "";
      switch (func) {
        case "add":
          result = Integer.toString(c.add(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
          break;
        case "subtract":
          result = Integer.toString(c.subtract(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
          break;
        case "multiply":
          result = Integer.toString(c.multiply(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
          break;
        case "divide":
          result = Integer.toString(c.divide(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
          break;
        case "fibonacci":
          result = Integer.toString(c.fibonacciNumberFinder(Integer.parseInt(inputs[1])));
          break;
        case "binary":
          result = c.intToBinaryNumber(Integer.parseInt(inputs[1]));
          break;
        default:
          break;
      }
      System.out.println(result);
    }
  }
}
