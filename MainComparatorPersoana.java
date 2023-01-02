import java.util.TreeSet;

public class MainComparatorPersoana {
    public static void main(String[] args){
        TreeSet<Persoana> persoaneAge = new TreeSet<Persoana>(new PersoanaAgeComparator());
        persoaneAge.add(new Persoana("Razvan", 15));
        persoaneAge.add(new Persoana("Gigi", 14));
        persoaneAge.add(new Persoana("Ana", 16));

        for(Persoana aux: persoaneAge)
        {
            System.out.println(aux);
        }
        System.out.println();
        TreeSet<Persoana> persoaneName = new TreeSet<Persoana>(new PersoanaNameComparator());
        persoaneName.add(new Persoana("Razvan", 15));
        persoaneName.add(new Persoana("Gigi", 14));
        persoaneName.add(new Persoana("Ana", 16));

        for(Persoana aux: persoaneName){
            System.out.println(aux);
        }
    }

}
