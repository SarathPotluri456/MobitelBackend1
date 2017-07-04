<%@ page language="java" contentType="text/html"%>

<%@include file="Header.jsp" %>

	<form action="LoginController" method="post">
		<table align="right">
			<thead bgcolor="pink">
				<th colspan="2">Login</th>
			</thead>
			<tr bgcolor="gray">
				<td>User Name</td>
				<td><input type="text" name="uname" required /></td>
			</tr>
			<tr bgcolor="gray">
				<td>Password</td>
				<td><input type="password" name="passwd" required /></td>
			</tr>
			</tr>
			<tr bgcolor="pink">
				<td colspan="2"><center>
						<input type="submit" value="SUBMIT" />
					</center></td>
			</tr>
		</table>
	</form>


</body>
</html>