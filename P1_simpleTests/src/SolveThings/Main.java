package SolveThings;

public class Main {

    public static void main(String[] args) {
        Solvable[] solvers = new Solvable[2];
        solvers[0] = new Puzzle();
        solvers[1] = new Computation();
        for (Solvable s : solvers) {
            s.solve();
        }
    }
}
