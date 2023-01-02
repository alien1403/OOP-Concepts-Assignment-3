import java.util.Comparator;

public class PersoanaAgeComparator implements Comparator<Persoana> {
    @Override
    public int compare(Persoana p1, Persoana p2){
        if(p1.age > p2.age)
            return 1;
        else if(p1.age == p2.age)
            return 0;
        return -1;
    }
}
