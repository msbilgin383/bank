public class ParaTransferi {
    public void ParaYatir(Musteri musteri, double miktar){
        double bakiye = musteri.getBalance();
        bakiye += miktar;
        musteri.setBalance(bakiye);
        System.out.println("Para yatırma işlemi tamamlandı.");
    }

    public void ParaCekme(Musteri musteri, double miktar){
        if(ifPossible(musteri, miktar)){
            double bakiye = musteri.getBalance();
            bakiye -= miktar;
            musteri.setBalance(bakiye);
            System.out.println("Para çekme işlemi tamamlandı.");
        }
        else
            System.out.println("Yetersiz bakiye.");

    }

    public boolean ifPossible(Musteri musteri, double miktar){
        if(musteri.getBalance()>=miktar)
            return true;
        return false;
    }
}
