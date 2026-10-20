import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private List<PedidoObserver> observers = new ArrayList<>();

    public void adicionarObserver(PedidoObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(PedidoObserver observer) {
        observers.remove(observer);
    }

    private void notificarObservers() {
        for (PedidoObserver observer : observers) {
            observer.atualizar();
        }
    }

    public void confirmarPedido() {
        System.out.println("Pedido confirmado.");
        notificarObservers();
    }
}