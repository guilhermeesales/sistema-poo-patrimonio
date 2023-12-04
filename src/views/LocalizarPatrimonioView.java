package views;
import java.util.Scanner;
import controllers.AdminController;

public class LocalizarPatrimonioView {
    public static void exibirLocalizarPatrimoniosView(){
        try {
            Scanner scanner = new Scanner(System.in);

            //Parte de localizar o patrimônio
            //irá receber um inteiro e irá procurar na lista um Patrimonio com aquele número como código
            //Se encontrar retornará o objeto e irá printar, caso não, retornará null.

            System.out.println("--LOCALIZAR PATRIMÔNIO--");
            System.out.println("Digite o código do patrimônio a ser buscado: ");
            int cod = scanner.nextInt();

            AdminController adm = new AdminController();
            if (adm.localizarPatrimonio(cod) == null) {
                System.out.println("Patrimônio não encontrado!");
            }else{
                //E exibe o patrimônio encontrado.
                System.out.println("Patrimonio encontrado!");
                System.out.println(adm.localizarPatrimonio(cod));
            }
            
        } catch (Exception e) {
            System.out.println("Digite um código corretamente!");
        }
    }
}
