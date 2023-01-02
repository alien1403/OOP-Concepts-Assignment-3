public class Angajat extends Persoana{
    Angajat(String name, int age){
        super(name, age);
    }

    @Override
    public String toString(){
        return "Angajat: " + super.toString();
    }
}
