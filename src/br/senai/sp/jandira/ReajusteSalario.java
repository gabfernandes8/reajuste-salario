package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class ReajusteSalario {

	public static void main(String[] args) {
		
		String nomeDoFuncionario;
		String strSalario;
		int salarioNovo;
		int salarioAtual;
		int reajuste;
		
		nomeDoFuncionario = JOptionPane.showInputDialog("Digite o nome do funcionário.");
		strSalario = JOptionPane.showInputDialog("Olá, " + nomeDoFuncionario + "! Digite seu salário.");
		
		salarioAtual = Integer.parseInt(strSalario);
		
		if (salarioAtual < 1500) {
			salarioNovo = salarioAtual * 15 / 100;
			reajuste = salarioAtual + salarioNovo;
			JOptionPane.showMessageDialog(null, "Seu salário será no total de: " + reajuste +" ");
			
		} else { 
			if (salarioAtual >= 3000) {
				salarioNovo = salarioAtual * 5 / 100;
				reajuste = salarioAtual + salarioNovo;
				JOptionPane.showMessageDialog(null, "Seu salário será no total de: " + reajuste +" ");
		}
			else {
				salarioNovo = salarioAtual * 10 / 100;
				reajuste = salarioAtual + salarioNovo;
				JOptionPane.showMessageDialog(null, "Seu salário será no total de: " + reajuste +" ");
			}
		}
		
		
		
		
		

	}

}
