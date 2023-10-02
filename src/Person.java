class Person {
    //
//Skapa en klass, Person. Vi ska hålla reda på personens
//Födelsedatum
//Namn
//GatuAdress
//PostNummer
//Postort

    private int födelsedatum;
    private String namn;
    private String gatuAdress;
    private int postNummer;
    private String postOrt;

     //Skapa en constructor! En person har alltid ett födelsedatum eller hur!
    //Allt det andra behöver den inte ha...kan sättas senare "i livet

    public Person(int födelsedatum){
        this.födelsedatum= födelsedatum;
    }
    //Gör properties - get??

    public String getNamn(){
        return namn;
    }
    public void setNamn(String namn){ //- Namnge
        
        this.namn = namn;

    }
    public void adressen(String gatuAdress, int postNummer, String postOrt){
        this.gatuAdress = gatuAdress;
        this.postNummer = postNummer;
        this.postOrt = postOrt;

    }
     // BytAdress

    public void moveIn(Person person1, Person person2) {

        System.out.println(person1.getNamn() + " flyttade in hos " + person2.getNamn() + " på adress " + person2.getAdress() +" " + person2.getPostNummer()+" "+ person2.getPostOrt());
    }

    public String getAdress() {
        return this.gatuAdress;
    }

    public int getPostNummer() {
        return this.postNummer;
    }
    public String getPostOrt(){
        return this.postOrt;
    }
    
}
