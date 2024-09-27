public class Squirrel {
    public void collectNuts(){
        double totalWeight = 0;
        for (Nut nut : nuts) {
            System.out.println("ура, еще орех!");
            totalWeight += nut.weight;

        }
        System.out.println("Я собрала орехов на: " +totalWeight +" кг!");

        }

    }

