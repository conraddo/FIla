package estrutura;
public class EnfileirarException extends FilaException{

    Object item;
    int tamanho;

    public EnfileirarException(Object item, int tamanho){
        //super ("A fila já está cheia!");
        this.item = item;
        this.tamanho = tamanho;
    }
    @Override 
    public String toString(){
        String texto;
        texto = "A fila já está cheia! n/";
        texto +=  "Limite eh " + this.tamanho;
        texto += "Item eh " + this.item;
        return texto;
    }

    public Object getItem(){
        return item;
    }

    public Object getTamanho(){
        return this.tamanho;
    }


}


