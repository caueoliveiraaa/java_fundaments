package Heritage.example02;

import javax.swing.JOptionPane;

public class Atendente extends Colaborador {
    public Atendente() {
        
        JOptionPane.showMessageDialog(null, "The value of the Income tax will be R$ " + it());
        JOptionPane.showMessageDialog(null, "Your absence prize will be R$ " + prizeAbsence());

        double netWage = (wage + prizeAbsence()) - it();

        JOptionPane.showMessageDialog(null, "The net wage will be R$ " + netWage);
    }
        // Income tax
        private double it(){
        
            double value = 0;
            
            if(wage <= 100000){
                value = wage * 0.03;
            }else if(wage <= 250000){
                value = wage * 0.05;
            }else{
                value = wage * 0.7;
            }
    
            return value;
        }
    
        // Prize absence
        private double prizeAbsence(){
            return absence == 0 ? 50 : 0;
        }









}
