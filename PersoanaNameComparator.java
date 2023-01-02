import java.util.Comparator;

public class PersoanaNameComparator implements Comparator<Persoana> {
    @Override
    public int compare(Persoana p1, Persoana p2){
        return p1.name.compareTo(p2.name);
    }
}
