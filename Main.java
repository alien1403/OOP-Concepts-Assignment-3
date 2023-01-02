import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Persoana persoana = new Persoana("Razvan", 20);

        HashMap<Persoana, List<Hobby>> persoane = new HashMap<>();
        persoane.put(persoana,
                Arrays.asList(
                        new Hobby("Video Editing", 1, Arrays.asList(new Adresa("Strada Rozetelor", "Romania"), new Adresa("Strada Florilor", "Franta"))),
                        new Hobby("Trading", 100, Arrays.asList(new Adresa("Strada Testelor", "Germania"))),
                        new Hobby("Boxing", 15, Arrays.asList(new Adresa("Strada Luptei", "Romania"), new Adresa("Ferentari", "Romania")))
                )
        );

        for(Persoana aux: persoane.keySet()){
            System.out.println(aux);
            System.out.println(persoane.get(aux));
        }
    }
}
