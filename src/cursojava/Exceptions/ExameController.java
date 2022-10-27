
package cursojava.Exceptions;

/**
 *
 * @author Hidelgio Novela
 */

// Exemplo para contrrolar as notas de exame
// Usando o " Throw " key word
public class ExameController {
    
    public static  void  NotaExame(int resultado) {
//        As notas do exame so podem estar no intervalo de 0--20 Fora desse intervalo lancamos a Exception do tipo Arithmetic 
        if (resultado >20 || resultado<0)
            throw new ArithmeticException();  
    } 

       public static  void  NomeExame(String nome) {
//        As notas do exame so podem estar no intervalo de 0--20 Fora desse intervalo lancamos a Exception do tipo Arithmetic 
        if (nome == null)
            throw new NullPointerException();  
    } 
    
}
