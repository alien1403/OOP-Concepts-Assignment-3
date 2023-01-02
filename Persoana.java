import java.util.Comparator;

public class Persoana {
    public String name;
    public int age;
    Persoana(){
        name = "";
        age = 0;
    }
    Persoana(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "" + name + " " + age;
    }

}
