package cursojava.Exceptions;

/**
 *
 * @author Hidelgio Novela
 */
public class Main2 {

    public static void main(String[] args) {

//        try and catch block with finally block
//        Usamos o bloco finally quando temos instrucoes que queremos executar mesmo que ocorra um erro assim como nao. 
//         Ex1:(Tendo um erro)
        try {

            int a = 5 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Tens uma excepcao");
        } finally {
            System.out.println("Este e o bloco final");
        }
        
//        Ex2: (Sem um erro)
        
          try {

            int a = 4 / 2;

        } catch (ArithmeticException e) {
            System.out.println("Tens uma excepcao");
        } finally {
            System.out.println("Este e o bloco final");
        }

    }
}
