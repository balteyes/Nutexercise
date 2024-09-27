
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Tree {

    public static Nut[] growMassOfNuts(int massNut){
        Nut[] nuts = new Nut[massNut];
        for (int i = 0; i < massNut; i++)
            nuts[i] = new Nut();

        return nuts;
    }

}
