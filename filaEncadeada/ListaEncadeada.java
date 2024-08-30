package filaEncadeada;

public class ListaEncadeada {
    public Node primeiro;

    public ListaEncadeada(){
        this.primeiro = null;
    }

    public boolean vazia(){
        return primeiro == null;
    }

    public void inserirPrimeiro(int valor){
        Node novo = new Node(valor);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
    }
    public void insereDepois(Node anterior, int info){
        Node novo = new Node(info);

        Node atual = this.primeiro;

        if(atual == null){
            this.primeiro = novo;
        }else{
            while(atual != anterior){
                atual = atual.getProximo();
            }
            novo.setProximo(atual.getProximo());
            atual.setProximo(novo);
        }
    }

    public void insereUltimo(int info){
        if (vazia()){
            inserirPrimeiro(info);
        }
        else{
            Node novo = new Node(info);
            Node atual = this.primeiro;

            while(atual != null){
                if(atual.getProximo() == null){
                    atual.setProximo(novo);
                    break;
                }
                atual = atual.getProximo();
            }
        }
    }
    public void insereOrdenado(int info){
        Node novo = new Node(info);
        Node atual = this.primeiro;
        Node anterior = atual;

        while(atual != null){
            if(atual.getProximo() == null && atual.getInformacao() < info){
                insereUltimo(info);
                break;
            }else{
                if(atual.getInformacao() < info ){
                    anterior = atual;
                }else if(atual.getInformacao() > info){
                    novo.setProximo(atual);
                    if(atual != this.primeiro){
                        anterior.setProximo(novo);
                    }else{
                        this.primeiro = novo;
                        break;
                    }
                }
            }
            atual = atual.getProximo();
        }
    }
    public Node getNode(int info){
        Node atual = this.primeiro;

        while(atual != null){
            if(atual.getInformacao() == info){
                return atual;
            }
            atual = atual.getProximo();
        }
        return atual;
    }
    public void removePrimeiro(){
        if(!vazia()){
            Node atual = this.primeiro;
            Node proximo = atual.getProximo();

            this.primeiro = proximo;
        }else System.out.println("A lista já está vazia!");
    }

    public void removeUltimo(){
        if(!vazia()){
            Node atual = this.primeiro;
            Node anterior = null;

            while(atual != null){
                if(atual.getProximo() == null){
                    if(anterior == null){
                        primeiro = null;
                    }else{
                        anterior.setProximo(null);
                    }
                }else {anterior = atual;}
                atual = atual.getProximo();
            }
        }else System.out.println("A lista já está vazia!");
    }

    public void remove(Node no){
        Node atual = this.primeiro;
        Node anterior = atual;

        while (atual != null){
            if(atual == no){
                if(anterior == atual){
                    this.primeiro = atual.getProximo();
                    break;
                }else{
                    anterior.setProximo(atual.getProximo());
                }
            }else{
                anterior = atual;
            }
            atual = atual.getProximo();
        }
    }
    public void imprimir(){
        Node atual = this.primeiro;
        if(vazia()){
            System.out.println("Fila vazia!");
        }else{
            while(atual != null){
                System.out.println(atual.getInformacao());
                atual = atual.getProximo();
            }
        }
    }
}
