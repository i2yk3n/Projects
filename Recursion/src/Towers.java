
public class Towers {
    private int numDiscs; // Number of discs
    // Constructor
    public Towers(int n) {
        this.numDiscs = n;
        // Move discs from peg 1 to peg 3
        // Using peg 2 as temporary storage
        moveDiscs(this.numDiscs, 1, 3, 2);
    }
    // Recursive method
    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num > 0) {
            // Move all but the largest disc
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
            System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);
            // Move the remaining discs
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}