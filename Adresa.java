public class Adresa extends Tara {
    public String adresa;
    Adresa(){
        super();
        adresa = "";
    }
    Adresa(String adresa, String tara){
        super(tara);
        this.adresa = adresa;
    }

    @Override
    public String toString(){
        return "Adresa: " + adresa + " " + super.toString();
    }
}
