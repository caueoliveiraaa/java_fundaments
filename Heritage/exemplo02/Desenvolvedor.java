package Heritage.exemplo02;

import javax.swing.JOptionPane;

public class Desenvolvedor extends Colaborador {
    public Desenvolvedor(){

        JOptionPane.showMessageDialog(null, "The value of the Income tax will be R$ " + it());
        JOptionPane.showMessageDialog(null, "Your absence prize will be R$ " + prizeAbsence());

        double netWage = (wage + prizeAbsence()) - it();

        JOptionPane.showMessageDialog(null, "The net wage will be R$ " + netWage);

    }
        // Income tax
        private double it(){
        
            double value = 0;
            
            if(wage <= 200000){
                value = wage * 0.05;
            }else if(wage <= 500000){
                value = wage * 0.10;
            }else{
                value = wage * 0.12;
            }
    
            return value;
        }
    
        // Prize absence
        private double prizeAbsence(){
            return absence == 0 ? 200 : 0;
        }
}
