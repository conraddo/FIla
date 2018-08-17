public class PrincipalFila{

    public static void main (String [] args ){
        System.out.println("===Teste Empilha===");
        try{
            FilaSimples fila1 = new FilaAprimorada(3);
        
            fila1.enfileira(10);
            fila1.enfileira(20);
            fila1.enfileira(30);
            //fila1.enfileira(40);
            System.out.println(fila1.desenfileira());
            System.out.println(fila1.desenfileira());
            System.out.println(fila1.desenfileira());
            

            System.out.println();
            }catch (DesenfileraException e){
                System.out.println (e);
            }
            catch (EnfileirarException e){
                System.out.println (e);
                //System.out.println("Limite eh " + e.getLimite());
            //System.out.println("Item eh " + e.getItem());
            }
        

        
        System.out.println("===Teste Desempilha===");
        try{
            FilaSimples fila2 = new FilaAprimorada(2);

            fila2.enfileira(100);        
            fila2.enfileira(200);
            System.out.println(fila2.desenfileira());
            System.out.println(fila2.desenfileira());
            System.out.println(fila2.desenfileira());

            System.out.println();
        }catch (DesenfileraException e){
                System.out.println (e);
        }catch (EnfileirarException e){
                System.out.println (e);
                //System.out.println("Limite eh " + e.getLimite());
                //System.out.println("Item eh " + e.getItem());
            }
        }
            
   }


 class FilaSimples {

    private int inicio, fim;
    private Object[] itens;
    
    public FilaSimples(int tamanhoMax) {
        this.itens = new Object[tamanhoMax];
        this.inicio = 0;
        this.fim = 0;
    }
    
    public void enfileira(Object novoItem) {
        itens[fim] = novoItem;
        fim = (fim + 1) % getTamanhoMax();
    }
    
    public Object desenfileira() {
        Object item = itens[inicio];
        itens[inicio] = null;
        inicio = (inicio + 1) % getTamanhoMax();
        return item;
    }
    
    int getInicio() {
        return this.inicio;
    }
    
    int getFim() {
        return this.fim;
    }
    
    int getTamanhoMax() {
        if (itens != null)
            return this.itens.length;
        else
            return -1;
    }

  }

 abstract class FilaException extends RuntimeException{}
 
 class FilaAprimorada extends FilaSimples {
    
    int num_elementos;
    int tamanhoMax;
    
    public FilaAprimorada(int tamanhoMax){
        super (tamanhoMax);
        this.tamanhoMax = tamanhoMax;
   }

        
    @Override 
    public void enfileira(Object novoItem){
        num_elementos += 1;
        if(num_elementos> getTamanhoMax()  )
            throw new EnfileirarException(novoItem, getTamanhoMax());
        
        super.enfileira(novoItem);
             
    }


    @Override
    public Object desenfileira() {
        if (num_elementos == 0)
            throw new DesenfileraException();
        num_elementos -= 1;
        return super.desenfileira();
    }
 }
class EnfileirarException extends FilaException{

    Object item;
    int tamanho;

    public EnfileirarException(Object item, int tamanho){
        //super ("A fila jÃ¡ estÃ¡ cheia!");
        this.item = item;
        this.tamanho = tamanho;
    }
    @Override 
    public String toString(){
        String texto;
        texto = "A fila jÃ¡ estÃ¡ cheia! n/";
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

class DesenfileraException extends FilaException {

    public DesenfileraException (){
        //super ("A fila jÃ¡ estÃ¡ desenfileirada");
    }
    @Override
    public String toString(){
        return "A fila ja esta desenfileirada";
    }
}

