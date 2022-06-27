package iniciante.loops.c;

import java.util.Iterator;

public class WhileLoop {
    public int countItems(Iterator<Integer> items) {
        int count = 0;
        while(items.hasNext()){
            count++;
            items.next();
        }
        return count;
    }
}

/*
# Problema:

Retorne a quantidade de items na lista.

# Dicas:

Será preciso utilizar a notação 'while (items.hasNext) { ... }'
Iterator é uma interface, que possui os méteodos
'hasNext()', que retorna true ou false, se tiver ou não mais elementos na lista
'next()' que retorna o próximo elemento da lista

# Exemplos
[0, 5, 10, 15, 20] retorna 5
 */