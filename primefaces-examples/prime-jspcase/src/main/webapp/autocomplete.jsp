<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://primefaces.prime.com.tr/ui" prefix="p"%>
<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
<f:view>
<head>
	<p:resources/>
</head>

<body>
	
	<h:form>
		<p:autoComplete value="#{autoCompleteBean.text}" completeMethod="#{autoCompleteBean.complete}" maxResults="4"/>
	</h:form>

</body>
</f:view>
</html>