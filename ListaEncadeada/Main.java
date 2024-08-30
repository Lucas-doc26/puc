package ListaEncadeada;
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserirPrimeiro(10);
        lista.inserirPrimeiro(8);
        lista.inserirPrimeiro(6);

        Node obj = lista.getNode(6);
        lista.insereDepois(obj,7);
        lista.insereOrdenado(5);
        lista.imprimir();

        System.out.println("----------");
    }
}
