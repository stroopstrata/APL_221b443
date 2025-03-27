class Whisky extends Beverage{
    protected void addCondiment(){
        System.out.println("add soda");
    }
    protected void stir(int time){
        System.out.println("stir for "+time+" min");
    }
}