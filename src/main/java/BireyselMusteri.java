public class BireyselMusteri extends Musteri{
    private String adress;


    public BireyselMusteri(String identityNumber, String name, double balance, String adress) {
        super(identityNumber, name, balance);
        this.adress = adress;
    }

    @Override
    public String toString() {
        return getName() + " " + getIdentityNumber() + " " + getAdress() +  " " + getBalance() ;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
