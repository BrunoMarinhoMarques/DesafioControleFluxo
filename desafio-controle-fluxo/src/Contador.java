import java.util.*;
public class Contador {
    public static void main(String[] args) {
    
       //criando o método scanner
       Scanner scan = new Scanner(System.in);

       System.out.println("Digite o primeiro número: ");
       int numeroUm = scan.nextInt();

       System.out.println("Digite o segundo número");
       int numeroDois = scan.nextInt();

       //tenta executar o que está dentro de try
       try{
            contar(numeroUm, numeroDois);
       }
       //senão retorna esta exceção caso try não execute
       catch(ParametrosInvalidosException exception){
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
       }
       

    }
    
    //criando o método para contar
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        //verifica se parametroUm é maior que parametroDois
        if(parametroUm>=parametroDois){
            throw new ParametrosInvalidosException();
        }
        //senao realiza a contagem dos numeros em ordem crescente
        else{


            int contagem  = parametroDois - parametroUm;
            for(int x=1; x<=contagem;x++){
            System.out.println(x);
            }

        }

        
        
        
    }
}
