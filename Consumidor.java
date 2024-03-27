package principal;

public class Consumidor implements Runnable {
    private Pneu pneu;
    private int tempo;

    public Consumidor(Pneu Pneu) {
        this.pneu = Pneu;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * getTempo()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                pneu.consumir();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}