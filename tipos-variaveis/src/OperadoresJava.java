public class OperadoresJava {

    public static void main(String[] args) {
        //&& e ||
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");

        }


        

        //operadores relacionais
        String nomeUm = "JOTAPE";
        String nomeDois = new String("JOTAPE");

        System.out.println(nomeUm.equals(nomeDois));

        
        //operadores ternários
        int a,b;
        
        a = 5;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado);

        
        



    }  
    
}
