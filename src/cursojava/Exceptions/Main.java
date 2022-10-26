
package cursojava.Exceptions;

/**
 *
 * @author Hidelgio Novela
 */
public class Main {

    public static void main(String[] args) {
        // Exemplo de tratamento de execption

//        int s[] = {1,2,3};
//        System.out.println(s[3]);
//Se eu executar o codigo acima terei um erro desse tipo
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3at cursojava.Exceptions.Main.main(Main.java:16)
//E tudo que estiver a baixo da linha 16 nao sera lido ou seja nao sera executado por isso ee importante fazer sempre o tratamento de erros
//Assim:
        try {
            int s[] = {1, 2, 3};
            System.out.println(s[3]);
        } catch (Exception e) {
            System.out.println("Tem algum erro 1");
        }

// O try and catch block funciona como se fosse um if e else
// se tivermos um erro sempre executa o bloco catch e caso contrario executa o bloco try
// E para saber o tipo de erro nos podemos usar o metodo printStackTrace(); da classe Eception
//Ex2:
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println("Teu um erro 2");
//            e.printStackTrace();
        }

        //  No bloco Catch entre parentese podemos escrever a subclasse especifica do exception
//    ex3:
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Teu um erro 3");
//            e.printStackTrace();
        }

// Mas quando colocamos a subClasse errada teremos um bug
//Por EX: em vez de ArithmeticException colocar IndexOutOfBoundsException
// Podemos ter tambem multiplos catch's  
//Ex4:
        try {
            int a = 5 / 0; // ArithmeticException
            String b = null;
            b.toUpperCase(); // NullPointerException
            int c[] = {1,2,3};
            System.out.println(c[3]); // IndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Teu um erro Aritimetico");
//            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Teu um erro do tipo Null");
//            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Teu um erro do tipo indexout");
//            e.printStackTrace();
        }
        
        System.out.println("Resto do codigo abaixo de try, catch");
        
//        Como o bloco try and catch funciona como um if else quando detecta um erro nao executa os restantes blocos catch
//          A ordem dos erros deve estar em sintonia com os blocos catch
//      Por isso para simplificar ee melhor usar um unico bloco catch e camar a super classe Exception para tratar qualquer tipo de Execcao
//      Mas executa o resto do codigo que teremos em baixo do bloco try catch

    }

}
