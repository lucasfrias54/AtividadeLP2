
public class App {
    public static void main(String[] args) throws Exception {
        String palavra;
        String palavrai;
        String palavraf;
        int quer = 0;
        
        System.out.println("Digite uma palavra: ");
        palavra = System.console().readLine();

        palavrai = palavra.substring(0, 1);
        palavraf = palavra.substring(palavra.length() - 1, palavra.length());

        do{
            
        System.out.println("Qual das opções a seguir você deseja exibir? \n 1 - Primeira letra da palavra \n 2 - Última letra da palavra \n 3 - Primeira e última letra da palavra");

        try{
            quer = Integer.parseInt(System.console().readLine());
        }
        catch(Exception e){
            System.out.println("Digite um valor válido! ");
        }

        switch(quer){
            case 1:
            {
                System.out.println("A primeira letra da palavra é: " + palavrai);
                break;
            }
            case 2:
            {
                System.out.println("A última letra da palavra é: " + palavraf);
                break;
            }
            case 3:
            {
                System.out.println("A primeira letra da palavra é: " + palavrai + "\nA última letra da palavra é: " + palavraf);
                break;
            }
            default:{            }
        }
        }while(quer < 1 || quer > 3);
    }
}
