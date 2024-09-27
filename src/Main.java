public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Nut[] nuts = tree.growMassOfNuts (15);

        Squirrel bestSquirrel = new Squirrel();

        bestSquirrel.collectNuts(nuts);



    }
}