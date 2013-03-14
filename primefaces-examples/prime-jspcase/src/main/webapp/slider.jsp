<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://primefaces.prime.com.tr/ui" prefix="p"%>
<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
<f:view>

<body>
		<h:inputText id="deneme" />
		<p:slider minValue="100" maxValue="200" for="deneme"></p:slider>

</body>
</f:view>
</html>