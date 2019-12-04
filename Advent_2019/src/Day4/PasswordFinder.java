package Day4;

import java.util.List;

public class PasswordFinder {

    private static final int RANGE_FROM = 235741;
    private static final int RANGE_TO = 706948;
    private static final String PATTERN_PART1 = "(.)\\1+";


    public static void main(String[] args) {

        PasswordGenerator passwordGenerator = new PasswordGenerator(RANGE_FROM, RANGE_TO, PATTERN_PART1);

        // Part 1
        List<Integer> basicPasswords = passwordGenerator.generateBasicPasswords();
        System.out.println(basicPasswords.size());

        // Part 2
        List<Integer> advancedPasswords = passwordGenerator.generateAdvancedPasswords();
        System.out.println(advancedPasswords.size());

    }
}
