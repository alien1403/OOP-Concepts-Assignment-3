public class Tara {
    public String tara;
    Tara(){
        tara = "";
    }

    Tara(String tara){
        this.tara = tara;
    }

    @Override
    public String toString(){
        return "Tara: " + tara;
    }
}
