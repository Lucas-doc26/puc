package TDE_Fila;

public class Fila {
    private int primeiro;
    private int ultimo;
    public int dados[];

    public int getUltimo(){
        return ultimo;
    }

    public Fila(int n_max){
        this.primeiro = 0;
        this.ultimo = -1;
        this.dados = new int[n_max];
    }

    public boolean cheia(){
        if(ultimo == primeiro - 1 && primeiro != 0){
            return true;
        }else if(ultimo == dados.length - 1 && primeiro == 0){
            return  true;
        }else return false;
    }

    public boolean vazia(){
        return primeiro == 0 && ultimo == -1;
    }

    public void insere(int num){
        if(!cheia()){
            if(vazia()){
                primeiro = 0;
                ultimo = 0;
                dados[primeiro] = num;
            }else
                if(ultimo == dados.length -1 && primeiro <= 1){
                    ultimo = 0;
                    dados[ultimo] = num;
                } else {
                    dados[ultimo+1] = num; ultimo = ultimo + 1;
                }
        } else System.out.println("Fila esta cheia!");
    }

    public void remove(){
        if(!vazia()){
            if(primeiro == ultimo){
                primeiro = 0;
                ultimo = -1;
            }else if((dados.length - 1) == primeiro){
                primeiro = 0;
            }else{
                primeiro += 1;
            }

        }
    }

    public void imprime(){
        if(vazia()){
            System.out.println("Fila vazia");
        } else{
            int i = primeiro;
            while(i != ultimo){
                if (i == dados.length){
                    i = 0;
                }
                System.out.println(dados[i]);
                i++;
            }
            System.out.println(dados[ultimo]);
        }
        System.out.println("-----");
    }
}