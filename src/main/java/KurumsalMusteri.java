public class KurumsalMusteri extends Musteri {
    private String companyName;

    public KurumsalMusteri(String identityNumber, String name, double balance, String companyName) {
        super(identityNumber, name, balance);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return getCompanyName() + " " + getIdentityNumber()+ " "  + getName() + " " + getBalance() ;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
