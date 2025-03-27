abstract class Beverage{
    private void pour(int qty){
        System.out.println("pour "+qty+" ml of drink");
    }
    protected abstract void addCondiment();
    protected void stir(int time){}
    private void serve(){
        System.out.println("serve through waiter");
    }
    public void give(int qty,int time){
        pour(qty);
        addCondiment();
        stir(time);
        serve();
    }

}