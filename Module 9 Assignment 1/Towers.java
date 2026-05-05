public class Towers {
    private int numDiscs;   // Number of discs
    public Towers(int n) {
        this.numDiscs = n;

        // Move the number of discs from peg 1 to peg 3
        this.moveDiscs(this.numDiscs, 1, 3, 2);
    }

    //Displays a disc move
    private void moveDiscs(int num, int fromPeg,
                           int toPeg, int tempPeg) {
        if (num > 0) {
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
            System.out.println("Move a disc from peg " +
                    fromPeg + " to peg " + toPeg);

            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}