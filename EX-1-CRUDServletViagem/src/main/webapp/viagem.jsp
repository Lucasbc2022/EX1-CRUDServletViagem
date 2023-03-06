<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/styles.css">
<link rel="stylesheet" href="./css/styles.css">
<title>Viagem</title>
</head>
<body>
    <div>
		<jsp:include page="menu.jsp"/>
	</div>
    <br />
        <div align="center" class="container">
           <form action="viagem" method="post">
              <p class="title">
                  <b>Viagens</b>
              </p>
              <table>
                  <tr>
                      <td colspan="3">
                          <input class="id_input_data" type="number" min="0"
                          step="1" id="cv" name="cv" placeholder="Codigo da viagem"
                          value='<c:out value="${viagem.codigo_viagem }"></c:out>'>
                      </td>
                      <td>
                          <input type="submit" id="botao" name="botao" value="Buscar">
                      </td>    
                  </tr>
                  <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" id="placa" name="placa"
                          placeholder="Placa de Onibus"
                          value='<c:out value="${viagem.placa_onibus }"></c:out>'>
                      </td>    
                  </tr>
                  
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" 
                           id="hora_sai" name="hora_sai" placeholder="Hora de Saida"
                          value='<c:out value="${viagem.hora_de_Saida }"></c:out>'>
                      </td>    
                  </tr>
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" 
                           id="hora_cheg" name="hora_cheg" placeholder="Hora de Chegada"
                          value='<c:out value="${viagem.hora_de_Chegada }"></c:out>'>
                      </td>    
                  </tr>
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" id="partida" name="partida"
                          placeholder="Partida" 
                          value='<c:out value="${viagem.partida }"></c:out>'>
                      </td>    
                  </tr>
                  
                                    <tr>
                      <td colspan="4">
                          <input class="input_data" type="text" id="destino" name="destino"
                          placeholder="Destino"
                          value='<c:out value="${viagem.destino }"></c:out>'>
                      </td>    
                  </tr>
                  
              </table>
              
           </form>
        </div>
     
</body>
</html>