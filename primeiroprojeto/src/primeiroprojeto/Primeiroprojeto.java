package primeiroprojeto;
import javax.swing.JOptionPane;

public class Primeiroprojeto
{
    public static void main( String[] args)
    {
        String n1 =
                JOptionPane.showInputDialog( "Digite o Primeiro Número de Sua Preferência:");
        String n2 =
                JOptionPane.showInputDialog( "Digite o Segundo Número de Sua Preferência:");
        int nm1 = Integer.parseInt ( n1 );
        int nm2 = Integer.parseInt ( n2 );
        
        int soma = nm1 + nm2;
        
        JOptionPane.showMessageDialog ( null, "A soma é:" + soma, "A soma dos dois números é:", JOptionPane.PLAIN_MESSAGE);
    }
}