<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row">
		<h1>Listagem de Produtos</h1>
		
					<table class="table">
  						<thead>
						    <tr>
						      <th scope="col">Código</th>
						      <th scope="col">Descrição</th>
						      <th scope="col">Quantidade</th>
						      <th scope="col">Valor</th>
						    </tr>
						  </thead>
						  <tbody>
					
						  </tbody>
						 <c:forEach items="${listaProdutos}" var="produto">
								<tr>
									<td>${produto.getCodigo()}</td>
									<td>${produto.getDescricao()}</td>
									<td>${produto.getQuantidade()}</td>
									<td>${produto.getValor()}</td>
								</tr>
							
						</c:forEach>
		  </tbody>
		 </table>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>