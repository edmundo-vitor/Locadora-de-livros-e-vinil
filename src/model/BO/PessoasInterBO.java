package model.BO;

import java.util.List;

import exception.AutenticationException;
import model.VO.FuncionariosVO;
import model.VO.PessoasVO;

public interface PessoasInterBO<VO> {
	
	public void cadastrarPessoa(VO vo);
	public void deletarPessoa(VO vo);
	public void editarPessoa(VO vo);
	public void pesquisarPessoa(VO vo);
	public void ListarPessoa(VO vo);
	public FuncionariosVO autenticar(FuncionariosVO usuario) throws AutenticationException;
}
