public class Student extends Persoana{
    Student(String name, int age){
        super(name, age);
    }

    @Override
    public String toString() {
        return "Somer: " + super.toString();
    }
}
