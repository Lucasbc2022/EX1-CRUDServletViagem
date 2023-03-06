package controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Viagem;
import persistence.GenericDao;
import persistence.IViagemDao;
import persistence.ViagemDao;


@WebServlet("/viagem")
public class ViagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ViagemServlet() {
        super();
       
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cv = request.getParameter("cv");
		String placa = request.getParameter("placa");
		String hora_sai = request.getParameter("hora_sai");
		String hora_cheg = request.getParameter("hora_cheg");
		String partida = request.getParameter("partida");
		String destino = request.getParameter("destino");
		
		String botao = request.getParameter("botao");
		
		Viagem viagem = new Viagem();
		

		GenericDao gDao = new GenericDao();
		IViagemDao vDao = new ViagemDao(gDao);
		String erro = "";
		String saida = "";
		List<Viagem> viagens = new ArrayList<Viagem>();
		try {
			
			if(botao.equals("Buscar")) {
					
				viagem = valido(cv, placa, hora_sai, hora_cheg, partida, destino, botao);
				viagem = vDao.Consultar(viagem);

				
			}
			
		} catch(SQLException | ClassNotFoundException| IOException e) {
			erro = e.getMessage();
		} finally {

			request.setAttribute("viagem", viagem);
			request.setAttribute("viagens", viagens);
			request.setAttribute("erro", erro);
			request.setAttribute("saida", saida);
			RequestDispatcher rd = request.getRequestDispatcher("viagem.jsp");
            rd.forward(request, response);
			
			
		}
		
	}
	
	private Viagem valido(String cv, String placa, String hora_sai, String hora_cheg, String partida, String destino, String botao) throws IOException {
		
		Viagem viagem = new Viagem();
		
		if(botao.equals("Buscar")) {
			if(cv.equals("")) {
				throw new IOException("Preencher Codigo de Viagem");
			} else {
				viagem.setCodigo_viagem(Integer.parseInt(cv));
			}
			
		}
		return viagem;
	}

}
