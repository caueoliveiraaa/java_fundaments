package Heritage.example02;

import javax.swing.JOptionPane;

public class Gerente extends Colaborador {
    
    // Constructor
    public Gerente() {

        JOptionPane.showMessageDialog(null, "The value of the Income tax will be R$ " + it());
        JOptionPane.showMessageDialog(null, "Your absence prize will be R$ " + prizeAbsence());

        double netWage = (wage + prizeAbsence()) - it();

        JOptionPane.showMessageDialog(null, "The net wage will be R$ " + netWage);

    }

    // Income tax
    private double it(){
        
        double value = 0;
        
        if(wage <= 3000){
            value = wage * 0.05;
        }else if(wage <= 5000){
            value = wage * 0.07;
        }else{
            // Here if we put 0 after one (0.10), Java removes it automatically.
            value = wage * 0.10;
        }

        return value;
    }

    // Prize absence
    private double prizeAbsence(){
        return absence == 0 ? 100 : 0;
    }

}
