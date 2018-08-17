package estrutura;
public class DesenfileraException extends FilaException {

    public DesenfileraException (){
        //super ("A fila já está desenfileirada");
    }
    @Override
    public String toString(){
        return "A fila já está desenfileirada";
    }
}
