package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Viagem;

public class ViagemDao implements IViagemDao {

	GenericDao gDao = new GenericDao();
	
	public ViagemDao(GenericDao gDao) {
		this.gDao = gDao;
	}
	
	@Override
	public Viagem Consultar(Viagem viagem) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "SELECT * FROM v_descricao_viagem WHERE Codigo_Viagem = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, viagem.getCodigo_viagem());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			viagem.setCodigo_viagem(rs.getInt("Codigo_Viagem"));
			viagem.setPlaca_onibus(rs.getString("Placa"));			
			viagem.setHora_de_Saida(rs.getString("Hora_de_Saida"));		
			viagem.setHora_de_Chegada(rs.getString("Hora_de_Chegada"));		
			viagem.setPartida(rs.getString("Partida"));			
			viagem.setDestino(rs.getString("destino"));
			System.out.println(viagem.toString());
		}
		
		rs.close();
		ps.close();
		c.close();
		
		return viagem;
	}

}
