// Main
public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);

        String expressao = "[{})]";

        Character fecha_char = null;

        for (int i = 0; i < expressao.length(); i++) {
            Character char_atual = expressao.charAt(i);

            if (char_atual == '(' || char_atual == '{' || char_atual == '[') {
                if (!p.cheia()) {
                    p.empilha(char_atual);
                }
            } else {
                if (char_atual == ')' || char_atual == '}' || char_atual == ']') {
                    if (p.vazia()) {
                        p.empilha(char_atual);
                    }else{
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
                        }
                    }
                }
            }
        }
        if(p.vazia()){
            System.out.println("A expressão está correta!");
        }
        else System.out.println("A expressão está errada!");
    }
    }
