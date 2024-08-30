package ListaEncadeada;

public class Node {
    private int informacao;
    private Node proximo;

    public Node getProximo() {
        return proximo;
    }

    public int getInformacao(){
        return informacao;
    }

    public void setInfo(int info){
        this.informacao = info;
    }

    public void setProximo(Node proximo){
        this.proximo = proximo;
    }

    public Node(int valor){
        this.informacao = valor;
        proximo = null;
    }
}
