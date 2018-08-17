import estrutura.*;

public class PrincipalFila{

    public static void main (String [] args ){
        System.out.println("===Teste Empilha===");
        try{
            FilaSimples fila1 = new FilaAprimorada(3);
        
            fila1.enfileira(10);
            fila1.enfileira(20);
            fila1.enfileira(30);
            fila1.enfileira(40);
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
