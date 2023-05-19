import br.com.challange.model.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Bicicleta bicicleta;
        Aro aro;
        Material material;
        Pneus pneus;
        Quadro quadro;
        Marcha marcha;
        Suspensao suspensao;
        Guidao guidao;
        int encerrar = 0;


        do {
            var nomeBicicleta = JOptionPane.showInputDialog("Bicicleta");
            bicicleta = new Bicicleta(nomeBicicleta);

            var tipoMaterial = JOptionPane.showInputDialog("material");

            var tipoPneus = JOptionPane.showInputDialog("Pneus");

            var tipoAro = JOptionPane.showInputDialog("Aro");

            var tipoQuadro = JOptionPane.showInputDialog("Quadro");

            var tipoMarcha = JOptionPane.showInputDialog("Marcha");

            var tipoSuspensao = JOptionPane.showInputDialog("Suspensão");

            var tipoGuidao = JOptionPane.showInputDialog("Guidão");

            bicicleta = new Bicicleta(tipoMaterial, tipoGuidao, tipoAro, tipoPneus, tipoQuadro, tipoMarcha,tipoSuspensao);

            var pergunta = """
                    
                    Deseja Cadastar mais uma bicicleta?
                    
                    [ 1 ] SIM
                    
                    [ 0 ] NÃO

                    """;
            encerrar = Integer.parseInt(JOptionPane.showInputDialog(pergunta));


        }while (encerrar >0);

    }
}