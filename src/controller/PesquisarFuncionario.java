package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import view.Telas;

public class PesquisarFuncionario {
	
@FXML private Pane painelConteudo;
	
	public void telaPesquisarFuncionario(ActionEvent event) throws Exception {
		Telas.telaPesquisaFuncionario(painelConteudo);
	}
}
