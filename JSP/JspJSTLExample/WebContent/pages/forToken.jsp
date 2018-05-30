<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body bgcolor="orange">
	<c:forTokens var="x" items="A;B;C;D;E;F" delims=";">
		${x}
	</c:forTokens>
	<br><br>
	
	<c:forTokens var="x" items="A,B,C,D,E,F" delims=",">
		${x}
	</c:forTokens>
	<br><br>
	
	<c:forTokens var="x" items="A-B-C-D-E-F-G-H-I-J" begin="2" step="2" delims="-">
		${x}
	</c:forTokens>
	<br><br>
	
	<c:forTokens var="x" items="A-B-C-D-E-F-G-H-I-J" end="5" step="2" delims="-">
		${x}
	</c:forTokens>
	</body>
</html>

