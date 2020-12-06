package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import view.Telas;

public class DeletarFuncionario {
	
	@FXML private TextField id;
	@FXML private TextField nome;
	@FXML private TextField cpf;
	@FXML private TextField cargo;
	@FXML private Pane painelConteudo;
	
	public void telaDeletarFuncionario(ActionEvent event) throws Exception {
		Telas.telaDeletaFuncionario(painelConteudo);
	}
}