public class Descendre extends Thread{
    private Position pos;
    public Descendre(Position pos ){
        this.pos = pos;
    }

    @Override
    public void run() {
        while (true){
            pos.move();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
