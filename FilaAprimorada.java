package estrutura;
public class FilaAprimorada extends FilaSimples {
    
    int tamanhoMax;
    public FilaAprimorada(int tamanhoMax){
        super (tamanhoMax);
        this.tamanhoMax = tamanhoMax;
   }

    	
    @Override 
    public void enfileira(Object novoItem){
        if(getFim()+1==this.tamanhoMax )
            throw new EnfileirarException(novoItem, getTamanhoMax());
        
        super.enfileira(novoItem);
             
    }


    @Override
    public Object desenfileira() {
        if (getInicio() == getFim())
            throw new DesenfileraException();

        return super.desenfileira();
    }


}
