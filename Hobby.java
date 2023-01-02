import java.util.List;

public class Hobby{
    public String name;
    public int frequency;
    public List<Adresa> adrese;

    Hobby(String name, int frequency, List<Adresa> adrese){
        this.name = name;
        this.frequency = frequency;
        this.adrese = adrese;
    }

    @Override
    public String toString(){
        return "Nume: " + name + " , Frecventa: " + frequency + " " + adrese.toString();
    }
}
