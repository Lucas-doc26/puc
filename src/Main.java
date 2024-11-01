//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Node raiz = new Node(10);

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria(raiz);

        arvoreBinaria.inserir(raiz, 6);
        arvoreBinaria.inserir(raiz, 5);
        arvoreBinaria.inserir(raiz, 8);
        arvoreBinaria.inserir(raiz, 7);
        arvoreBinaria.inserir(raiz, 20);
        arvoreBinaria.inserir(raiz, 22);
        arvoreBinaria.inserir(raiz, 21);
        arvoreBinaria.inserir(raiz, 23);

        arvoreBinaria.remove(6);

        arvoreBinaria.busca(6);

        arvoreBinaria.printInOrdem(raiz);
        //arvoreBinaria.printPreOrdem(raiz);
        //arvoreBinaria.printPosOrdem(raiz);

    }
}