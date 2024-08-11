public class Pilha {
    private int topo;
    private int max;
    public Character[] dados;

    public Pilha(int max){
        this.topo = -1;
        this.max = max;
        this.dados = new Character[max];
    }

    Character GetTopo(){
        if(!vazia()){
            return dados[topo];
        }
        else return null;
    }
    boolean cheia(){
        return this.topo == max - 1;
    }
    boolean vazia(){
       return this.topo == -1;
    }

    void empilha(Character elemento){
        if(!cheia()) {
            topo += 1;
            dados[topo] = elemento;
        }
        else{
            System.out.println("A pilha está cheia");
        }
    }

    Character desempilha(){
        if(!vazia()){
            char dado = dados[topo];
            topo -= 1;
            return dado;
        }
        else{
            System.out.println("A pilha está vazia!");
            return null;
        }
    }
}