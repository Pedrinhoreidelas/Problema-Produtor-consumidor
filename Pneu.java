package principal;


public class Pneu {
    private int quantidade;
    private boolean consumidorNotificou;

    public Pneu() {
        quantidade = 0;
        consumidorNotificou = false;
    }

    public synchronized void adicionar() throws InterruptedException {
        while (quantidade > 0 && !consumidorNotificou) {
            wait(); 
        }
        quantidade++;
        System.out.println("Produtor adicionou uma Pneu. Total: " + quantidade);
        consumidorNotificou = false; 
        notify(); 
    }

    public synchronized void consumir() throws InterruptedException {
        while (quantidade == 0) {
            wait(); 
        }
        quantidade--;
        System.out.println("Consumidor consumiu uma Pneu. Total: " + quantidade);
        consumidorNotificou = true; 
        notify(); 
}
