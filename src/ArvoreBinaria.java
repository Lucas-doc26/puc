import java.sql.SQLOutput;
import java.util.EventListener;

public class ArvoreBinaria {
    private Node raiz;

    public ArvoreBinaria(Node raiz) {
        this.raiz = raiz;
    }

    void inserir(Node raiz, int info) {
        Node novo = new Node(info);
        Node atual = raiz;

        if (raiz.getDireita() == null && raiz.getInfo() < info) {
            raiz.setDireita(novo);
        } else if (raiz.getEsquerda() == null && raiz.getInfo() > info) {
            raiz.setEsquerda(novo);
        } else if (raiz.getInfo() < info){
            atual = raiz.getDireita();
            inserir(atual, info);
        }else{
            atual = raiz.getEsquerda();
            inserir(atual, info);
        }
    }
    //utilizar o maior elemento da subárvore esquerda para
    //“substituir” o elemento a ser retirado;

    //utilizar o menor elemento da subárvore direita para
    //“substituir” o elemento a ser retirado.
    public void remove(int info){
        Node atual = this.raiz;
        Node pai = atual;
        while(atual != null){
            if(info > atual.getInfo()){
                atual = atual.getDireita();
            }else if(info < atual.getInfo()){
                atual = atual.getEsquerda();
            }else if(info == atual.getInfo()){
                if(atual.getDireita() != null){
                    Node substitutivo = atual.getDireita();
                    while(substitutivo.getEsquerda() != null){
                        substitutivo = substitutivo.getEsquerda();
                    }

                    Node antigo = atual;
                    atual = substitutivo;
                    atual.setDireita(antigo.getDireita());
                    atual.setEsquerda(antigo.getEsquerda());

                    Node esquerda = atual.getEsquerda();
                    esquerda.setDireita(null);

                    if(info < this.raiz.getInfo()){
                        pai.setEsquerda(atual);
                    }else{
                        pai.setDireita(atual);
                    }

                    break;
                }
                else{
                    Node substitutivo = atual.getEsquerda();
                    while(substitutivo.getDireita() != null){
                        substitutivo = substitutivo.getDireita();
                    }

                    Node antigo = atual;
                    atual = substitutivo;
                    atual.setDireita(antigo.getDireita());
                    atual.setEsquerda(antigo.getEsquerda());

                    Node direita = atual.getDireita();
                    direita.setDireita(null);

                    if(info < this.raiz.getInfo()){
                        pai.setEsquerda(atual);
                    }else{
                        pai.setDireita(atual);
                    }

                    break;
                }
            }
        }
    }

    public Node busca(int info){
        Node atual = this.raiz;

        while(atual != null && atual.getInfo() != info){
            if(atual.getInfo() > info){
                atual = atual.getEsquerda();
            }
            else atual = atual.getDireita();
        }
        if(atual != null){
            System.out.println(atual.getInfo());
        }
        return atual;
    }

    void printPosOrdem(Node raiz){
        if (raiz == null){
            return;
        }

        printPosOrdem(raiz.getEsquerda());
        printPosOrdem(raiz.getDireita());
        System.out.println(raiz.getInfo());
    }

    void printPreOrdem(Node raiz){
        if (raiz == null) {
            return;
        }

        System.out.println(raiz.getInfo());

        printPreOrdem(raiz.getEsquerda());

        printPreOrdem(raiz.getDireita());
    }

    void printInOrdem(Node raiz){
        if (raiz == null){
            return;
        }

        printInOrdem(raiz.getEsquerda());
        System.out.println(raiz.getInfo());
        printInOrdem(raiz.getDireita());

    }
}