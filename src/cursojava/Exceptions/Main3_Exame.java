
package cursojava.Exceptions;

/**
 *
 * @author Hidelgio Novela
 */
public class Main3_Exame {
    
    public static void main(String[] args) {
        try {
              ExameController.NomeExame("null");
        } catch (Exception e) {
            System.out.println("Nome nao pode ser nullo");
        }
      
        
        try {
              ExameController.NotaExame(-15);
        } catch (Exception e) {
            System.out.println("Nota invalida");
        }
    }
    
}
