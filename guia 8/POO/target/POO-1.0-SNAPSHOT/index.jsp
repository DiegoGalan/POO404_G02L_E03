<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 16/10/2024
  Time: 11:16 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Suma de dos numeros</title>
</head>
<body>
<form name="sumaForm" action="FormSumaServlet" method="POST">
  <table>
    <tr>
      <td>Primer numero :</td>
      <td><input type="text" name="num_1"/></td>
    </tr>
    <tr>
      <td>Segundo numero :</td>
      <td><input type="text" name="num_2"/></td>
    </tr>
    <th><input type="submit" value="calcular" name="calculate"/></th>
    <th><input type="reset" value="reiniciar" name="reset"/></th>
  </table>
  <h2>${respuesta}</h2>
</form>
</body>
</html>