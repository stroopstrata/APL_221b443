class Rum extends Beverage{
    protected void addCondiment(){
        System.out.println("add ice");
    }
    protected void stir(int time){
        System.out.println("stir for "+time+" min");
    }
}