package net.absoft.mortalwombat;

public class AgeChecker {
    private final int MIN_AGE = 21;

    public boolean canPlayGmae (int age) {
        return age >= MIN_AGE;
    }
}
