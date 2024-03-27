package principal;

public class Principal {
    public static void main(String[] args) {
        Pneu pneu = new Pneu();

        Consumidor c1 = new Consumidor(pneu);
        Consumidor c2 = new Consumidor(pneu);

        Produtor p1 = new Produtor(pneu);
        Produtor p2 = new Produtor(pneu);

        c1.setTempo(1000);
        c2.setTempo(1000);

        p1.setTempo(1000);
        p2.setTempo(1000);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(p1);
        Thread t4 = new Thread(p2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}