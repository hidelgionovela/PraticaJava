/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava.Exceptions;

/**
 *
 * @author Latitude 5500
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
            System.out.println("Tem algum erro do tipo ");
        }

// O try and catch block funciona como se fosse um if e else
// se tivermos um erro sempre executa o bloco catch e caso contrario executa o bloco try
// E para saber o tipo de erro nos podemos usar o metodo printStackTrace(); da classe Eception
//Ex2:
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println("Teu um erro");
            e.printStackTrace();
        }
    }

}
