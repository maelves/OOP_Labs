public class Animate implements Runnable{
    BlockBreaker blockBreaker;

    public Animate(BlockBreaker blockBreakerView) {
        this.blockBreaker = blockBreakerView;
    }

    /**
     * This method is used for running the game: it uses the update method
     * from the BlockBreaker class to keep track of the events.
     */
    @Override
    public void run() {
        while(true)
        {
            blockBreaker.update();
            //System.out.println("I am running!");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
