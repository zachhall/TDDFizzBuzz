package FizzBuzz;

public class FizzBuzz {
    public void execute() {

    }

    public String processNumber(int number) {
        if (number % 3 == 0) { // if number is divisble by 3, remainder will be 0
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}