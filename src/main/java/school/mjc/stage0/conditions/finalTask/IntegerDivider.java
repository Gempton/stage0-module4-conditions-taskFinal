package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int division;
        if (divider == 0) {
            System.out.println("division by zero");
        } else {
            division = dividend / divider;
            if (division * divider == dividend) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        }


    }
}
