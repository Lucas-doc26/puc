package TDE_Fila;

public class Merge {

    Fila filaA;

    Fila filaB;

    int tamanho;

    public Merge(Fila filaA, Fila filaB){
        this.filaA = filaA;
        this.filaB = filaB;
        tamanho = filaA.dados.length + filaB.dados.length;
    }


    public void ordena(){
        Fila filaR = new Fila(tamanho);

        int menor;
        while(!filaR.cheia()){
            if(!filaA.vazia()){
                menor = filaA.dados[filaA.primeiro];
            }else{
                menor = filaB.dados[filaB.primeiro];
            }
            if(!filaB.vazia()){
                if(menor>=filaB.dados[filaB.primeiro]){
                    menor = filaB.dados[filaB.primeiro];
                    filaR.insere(menor);
                    filaB.remove();
                }else{
                    filaR.insere(menor);
                    filaA.remove();
                }
            }else{
                filaR.insere(menor);
                filaA.remove();
            }

        }

        filaR.imprime();
    }

}

