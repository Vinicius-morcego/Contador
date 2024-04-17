import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parametro");
            int parametro1 = terminal.nextInt();
            System.out.println("Digite o segundo parametro");
            int parametro2 = terminal.nextInt();
            contar(parametro1, parametro2);
            terminal.close();
        } catch (ParametrosInvalidosException e) {            
           e.printStackTrace();
        }
    }
    

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2) 
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro.");

        int result = (parametro2 - parametro1);
        for(int i = 0; i < result; i++){
            System.out.println("O número é: "+(i+1));
        }
    }
}