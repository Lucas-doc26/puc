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

        int i = 0;
        int j = 0;
        while(i<filaA.dados.length){
            int menor = filaA.dados[i];
            while(j<filaB.dados.length){
                if(menor>filaB.dados[j]){
                    menor = filaB.dados[j];
                    filaR.insere(menor);
                    j++;
                    break;
                } else{break;}
            }
            if(!(menor != filaA.dados[i])){
                filaR.insere(menor);
                if(filaB.dados.length > filaA.dados.length && i == filaA.dados.length - 1){
                    break;
                }
                i++;
            }


        }

        filaR.imprime();
    }

}
