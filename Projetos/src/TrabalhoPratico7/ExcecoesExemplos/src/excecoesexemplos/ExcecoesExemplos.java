/*
 * Exemplos de aplicacao de excecoes 
 */
package excecoesexemplos;

class IndexIsPair extends Exception {

    IndexIsPair() {
        super();
    }

    IndexIsPair( String s ) {
           super( s );
    }
}

public class ExcecoesExemplos {

    // metodo usado em SITUACAO 3, 4, 5 e 6
    //lança exceções quando i é par e diferente de zero -> IndexOutOfBoundsException
    //i é zero - ArithmeticException
    static void metodo( int []v, int i  ) throws IndexOutOfBoundsException,
                                                 ArithmeticException {
        try{
            if( i % 2 == 0 && i != 0 ){
                //indice para e difente de zero
                throw new IndexOutOfBoundsException( "Indice par" );
            }
            if( i == 0 ){
                //indice igual a zero
                throw new ArithmeticException( "Indice 0" );
            }
            
            //Se o indice for invalido, ocorre ArrayIndexOutOfBoundsException
            System.out.println( "(Metodo) v[" + i + "] = " + v[i] );    
            System.out.println( "(Metodo) não gerou excepção");
        }
        catch( IndexOutOfBoundsException e ){
            //apenas captura a exceção manual
            System.out.println( "Excepção tratada em metodo(): " + e.getMessage() );
        }
      }
    
    public static void main(String[] args) {
        
        int []vector = {1,2,3,4,5,6,7,8,9,10};
        
        // SITUACAO 1
        //ciclo começa em -5 a 9 
        //indice par - Usa IndexIsPair
        //indice fora dos limites - ArrayIndexOutOfBoundsException
        //indice impares validos - acesso normal ao vetor
        //finally é sempre executado
        System.out.println( "\n**** SITUACAO 1");
        
        for( int i=-5; i<10; i++ ){
            try{
                //se o indice for par, executa exceção personalizada
                if( i % 2 == 0 ){
                    throw new IndexIsPair( "" + i );
                }
                //Tenta aceder ao vetor; para indices negativos ou >9 gera ArrayIndexOutOfBoundsException
                System.out.println( "(Ciclo 1) vector[" + i + "] = " + vector[i] );
                System.out.println( "(Ciclo 1) Nao gerou excecao!");
            }
            catch( ArrayIndexOutOfBoundsException e ){
                //indice invalido do vetor
                System.out.println( "(Ciclo 1) ArrayIndexOutOfBounds: " + e.getMessage() );
            }
            catch( IndexIsPair e ){
                //indice par 
                System.out.println( "(Ciclo 1) IndexIsPair: " + e.getMessage() );
            }
            finally{
                //sempre executado
                System.out.println( "(Ciclo 1) Finally: i = " + i );
            }
        }
        
        // SITUAÇÂO 2
        //ciclo de 0 a 4
        //quando i = 3 executa ArrayIndexOutOfBoundsException
        //quando i == 0 executa ArithmeticException 
        //nos restantes não causa erros
        System.out.println( "\n**** SITUACAO 2");
        
        for( int i=0; i<5; i++ ){
            try{
                if( i == 3 ){
                    //execução se i == 3
                  throw new ArrayIndexOutOfBoundsException( "Nao gosto do 3");
                }
                //pode gerar ArithmeticException para i = 0
                System.out.println( "(Ciclo 2) i = " + i + ", Resultado = " + vector[i]/i );
                System.out.println( "(Ciclo 2) Nao gerou excecao!");
            }
            catch( ArrayIndexOutOfBoundsException e ){
                System.out.println( "(Ciclo 2) ArrayIndexOutOfBoundsException: " + e.getMessage() );
            }
            catch( ArithmeticException e ){
                System.out.println( "(Ciclo 2) ArithmeticException: " + e.getMessage() );
            }
        }
        
        // SITUAÇÂO 3, 4, 5, 6
        System.out.println( "\n**** SITUACAO 3");
        
        // 5 é impar, não faz os throws manuais 
        //gera ArrayIndexOutOfBoundsException
        //não é tratada dentro do método, propaga para o main
        try{
            metodo( vector, -5 ); 
        }
        catch( ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException gerada em metodo() e tratada em main(): " 
                               + e.getMessage() );
        }
        catch( ArithmeticException e ){
            System.out.println("ArithmeticException gerada em metodo() e tratada em main(): " 
                               + e.getMessage() );
        }
        
        System.out.println( "\n**** SITUACAO 4");
        //0 ativa throw new ArrayIndexOutOfBoundsException
        //não é tratada dento do método, é apanhado no main
        try{
            metodo( vector, 0 );
        }
        catch( ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException gerada em metodo() e tratada em main(): " 
                               + e.getMessage() );
        }
        catch( ArithmeticException e ){
            System.out.println("ArithmeticException gerada em metodo() e tratada em main(): " 
                               + e.getMessage() );
        }
        
        System.out.println( "\n**** SITUACAO 5");
        //3 é ímapr e válido - imprime o valor, sem exceções
        
        try{
            metodo( vector, 3 ); 
        }
        catch( ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException gerada em metodo() e tratada em main(): " 
                               + e.getMessage() );
        }
        catch( ArithmeticException e ){
            System.out.println("ArithmeticException gerada em metodo() e tratada em main(): " 
                               + e.getMessage() );
        }
        
        System.out.println( "\n**** SITUACAO 6");
        //4 é par e diferente de zero - gera IndexOutOfBoundsException
        //esta exceção é tratada dentro do próprio método
        
        try{
            metodo( vector, 4 );  
        }
        catch( ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException gerada em metodo() e tratada em main(): " 
                               + e.getMessage() );
        }
        catch( ArithmeticException e ){
            System.out.println("ArithmeticException gerada em metodo() e tratada em main(): " 
                               + e.getMessage() );
        }
        finally{
            //executado no final da situação 6
            System.out.println( "\nFinally:");
            for( int x : vector )
                System.out.println( x );
        }
    } 
}
