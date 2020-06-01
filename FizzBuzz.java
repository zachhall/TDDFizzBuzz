package FizzBuzz;

public class FizzBuzz {
    public void execute() {

    }

    public String processNumber(int number) {
        if (isMultipleOf3(number) && isMultipleOf5(number)) {
            return "Fizz Buzz";
        } else if (isMultipleOf3(number)) { // if number is divisble by 3, remainder will be 0
            return "Fizz";
        } else if (isMultipleOf5(number)) { // if number if divisible by 5, remainder will be 0
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}