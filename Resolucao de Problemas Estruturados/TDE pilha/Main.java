// Main
import java.util.Scanner;
import java.beans.Expression;

public class Main {

    public static boolean validadorExpressao(String expressao){
        Pilha p = new Pilha(expressao.length()); 

        Character fecha_char = null;

        for (int i = 0; i < expressao.length(); i++) {
            Character char_atual = expressao.charAt(i);

            //se tiver o caractere e a pilha não estiver cheia, coloca na pilha
            if (char_atual == '(' || char_atual == '{' || char_atual == '[') {
                if (!p.cheia()) {
                    p.empilha(char_atual);
                }
            } else {
                //se for um caractere que fecha e a pilha estiver vazia, ele empilha
                if (char_atual == ')' || char_atual == '}' || char_atual == ']') {
                    if (p.vazia()) {
                        p.empilha(char_atual);
                    }else{
                        //se for um caractere que fecha e a pilha não estiver vazia, procura o correspondente e tira  
                        switch (char_atual) {
                            case ')':
                                fecha_char = '(';
                                break;
                            case ']':
                                fecha_char = '[';
                                break;
                            case '}':
                                fecha_char = '{';
                                break;
                            default:
                                break;
                        }
                        if (p.GetTopo() == fecha_char) {
                            p.desempilha();
                        }else{
                            p.empilha(fecha_char);
                        }
                    }
                }
            }
        }
        if(p.vazia()){
            System.out.println("A expressão está correta!");
            return true;
        }
        else {
            System.out.println("A expressão está errada!"); 
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a expressão para validar:");

        String expressao = teclado.nextLine(); 

        validadorExpressao(expressao);

    }
}
        