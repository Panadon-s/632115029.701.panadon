public class PrimeMinister extends Person {
    String Country;
    public PrimeMinister(String Name,int BornYear,String Country) {
        super(Name,BornYear);
        this.Country = Country;
    }
    public void introduce() {
        super.introduce();
        System.out.println("I’m a prime minister and work in: " + Country);
    }
}
