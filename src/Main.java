//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int startingBalance = 5000;
        final double INTEREST_RATE = .17;
        double oneMonthInterest = startingBalance * INTEREST_RATE;
        double oneMonthBalance = startingBalance + oneMonthInterest;
        double twoMonthInterest = oneMonthBalance * INTEREST_RATE;
        System.out.println("Your interest due after one month is: " + oneMonthInterest);
        System.out.println("Your interest due after two months is: " + twoMonthInterest);
    }
}