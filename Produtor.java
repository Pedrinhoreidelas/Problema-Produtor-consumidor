package principal;


public class Produtor implements Runnable {
    private Pneu pneu;
    private int tempo;

    public Produtor(Pneu pneu) {
        this.pneu = pneu;
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
                pneu.adicionar();
            } catch (InterruptedException ex) {
                System.out.println("erro");
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