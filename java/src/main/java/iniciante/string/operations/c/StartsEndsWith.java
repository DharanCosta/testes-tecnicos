package iniciante.string.operations.c;

public class StartsEndsWith {
    // inicia com vogal?
    public Boolean startsWith(String text) {
        if(text.startsWith("a")){
            return true;
        }else if (text.startsWith("e")) {
            return true;
        }else if (text.startsWith("i")) {
            return true;
        }else if (text.startsWith("o")) {
            return true;
        }else if (text.startsWith("u")) {
            return true;
        }
        return false;
    }

    // terminal com vogal?
    public Boolean endsWith(String text) {
        if(text.endsWith("a")){
            return true;
        }else if (text.endsWith("e")) {
            return true;
        }else if (text.endsWith("i")) {
            return true;
        }else if (text.endsWith("o")) {
            return true;
        }else if (text.endsWith("u")) {
            return true;
        }
        return false;
    }
}

/*
# Problema

Dado uma String A, verifique, no primeiro método,
se ele inicia com uma vogal.

No segundo método, se termina com vogal.

Retorne true ou false.

# Dicas

Utilize os métodos "startsWith()" e "endsWith".

# Exemplos

"uva".startsWith("u") retorna true.
 */