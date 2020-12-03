package model.BO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.DAO.DiscosDAO;
import model.DAO.LivrosDAO;
import model.VO.DiscosVO;
import model.VO.LivrosVO;
import model.VO.ProdutosVO;

public class ProdutosBO<VO> implements ProdutosInterBO<VO>{

	@Override
	public void cadastrarProduto(VO vo) {
		
		//Se for do tipo LivrosVO
		if(vo.getClass().getSimpleName().equals(LivrosVO.class.getSimpleName())) {
			LivrosDAO dao = new LivrosDAO();
			dao.cadastrar((LivrosVO)vo);
		}
		
		//Se for do tipo DiscosVO
		if(vo.getClass().getSimpleName().equals(DiscosVO.class.getSimpleName())) {
			System.out.println("Tipo disco, entrou!");
		}
		
		/*Se o VO for do tipo DiscosVO
		Ai chama o DiscosDAO.cadastrar*/
		
		/*Se o VO for do tipo LivrosVO
		Ai chama o LivrosDAO.cadastrar*/
		
	}

	@Override
	public void deletarProduto(ProdutosVO produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarProduto(ProdutosVO produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisarProduto(VO vo) {
		//Pesquisa por livro
		if(vo.getClass().getSimpleName().equals(LivrosVO.class.getSimpleName())) {
			LivrosDAO dao = new LivrosDAO();
			ResultSet rs = dao.pesquisar((LivrosVO)vo);
			
			Calendar dataCalendar = Calendar.getInstance();
			
			List<LivrosVO> livros = new ArrayList<LivrosVO>();
			try {
				while(rs.next()) {
					LivrosVO livro = new LivrosVO();
					//adicionando o resultado ao objeto livro
					livro.setId(rs.getInt("id_livro"));
					livro.setTitulo(rs.getString("titulo"));
					livro.setGenero(rs.getString("genero"));
					dataCalendar.set(Calendar.YEAR, rs.getInt("ano_lancamento"));
					livro.setAnoLancamento(dataCalendar);
					livro.setQtdPaginas(rs.getInt("qtd_paginas"));
					livro.setQtdExemplares(rs.getInt("qtd_exemplares"));
					livro.setValorAluguel(rs.getDouble("valor_aluguel"));
					
					livros.add(livro);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			for(int c = 0; c < livros.size(); c++) {
				LivrosVO livro = (LivrosVO) livros.get(c);
				System.out.println(livro.getTitulo());
			}
		} //Fim Pesquisa por livro
		
		
		//Pesquisar disco
		if(vo.getClass().getSimpleName().equals(DiscosVO.class.getSimpleName())) {
			DiscosDAO dao = new DiscosDAO();
			ResultSet rs = dao.pesquisar((DiscosVO)vo);
			
			List<DiscosVO> discos = new ArrayList<DiscosVO>();
			try {
				while(rs.next()) {
					DiscosVO disco = new DiscosVO();
					//adicionando o resultado ao objeto
					disco.setId(rs.getInt("id_disco"));
					disco.setTitulo(rs.getString("titulo"));
					disco.setEstilo(rs.getString("estilo"));
					disco.setNomeBanda(rs.getString("nome_banda"));
					disco.setQtdExemplares(rs.getInt("qtd_exemplares"));
					disco.setValorAluguel(rs.getDouble("valor_aluguel"));
					
					discos.add(disco);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int c = 0; c < discos.size(); c++) {
				DiscosVO livro = (DiscosVO) discos.get(c);
				System.out.println(livro.getTitulo());
			}
		}//Fim pesquisar disco
		
	}//Fim pesquisar produto
	
	public void listarProduto(VO vo) {
		//Listar todos os livros
		if(vo.getClass().getSimpleName().equals(LivrosVO.class.getSimpleName())) {
			LivrosDAO dao = new LivrosDAO();
			ResultSet rs = dao.listar();
			
			Calendar dataCalendar = Calendar.getInstance();
			
			List<LivrosVO> livros = new ArrayList<LivrosVO>();
			try {
				while(rs.next()) {
					LivrosVO livro = new LivrosVO();
					//adicionando o resultado ao objeto livro
					livro.setId(rs.getInt("id_livro"));
					livro.setTitulo(rs.getString("titulo"));
					livro.setGenero(rs.getString("genero"));
					dataCalendar.set(Calendar.YEAR, rs.getInt("ano_lancamento"));
					livro.setAnoLancamento(dataCalendar);
					livro.setQtdPaginas(rs.getInt("qtd_paginas"));
					livro.setQtdExemplares(rs.getInt("qtd_exemplares"));
					livro.setValorAluguel(rs.getDouble("valor_aluguel"));
					
					livros.add(livro);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			for(int c = 0; c < livros.size(); c++) {
				LivrosVO livro = (LivrosVO) livros.get(c);
				System.out.println(livro.getTitulo());
			}
			
			
		}//Fim listar livros
		
		//Listar todos os discos
		if(vo.getClass().getSimpleName().equals(DiscosVO.class.getSimpleName())) {
			DiscosDAO dao = new DiscosDAO();
			ResultSet rs = dao.listar();
			
			List<DiscosVO> discos = new ArrayList<DiscosVO>();
			try {
				while(rs.next()) {
					DiscosVO disco = new DiscosVO();
					//adicionando o resultado ao objeto
					disco.setId(rs.getInt("id_disco"));
					disco.setTitulo(rs.getString("titulo"));
					disco.setEstilo(rs.getString("estilo"));
					disco.setNomeBanda(rs.getString("nome_banda"));
					disco.setQtdExemplares(rs.getInt("qtd_exemplares"));
					disco.setValorAluguel(rs.getDouble("valor_aluguel"));
					
					discos.add(disco);
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int c = 0; c < discos.size(); c++) {
				DiscosVO livro = (DiscosVO) discos.get(c);
				System.out.println(livro.getTitulo());
			}
		}//Fim listar discos
		
	}//Fim listar produto	
}


