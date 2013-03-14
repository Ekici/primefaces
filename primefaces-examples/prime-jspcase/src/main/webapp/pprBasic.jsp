<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://primefaces.prime.com.tr/ui" prefix="p"%>
<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
<f:view>
	<head>
	<title>PPR @ PrimeFaces</title>
	<p:resources />
	</head>
	<body>
	<h1>Testing ui components</h1>

	<p:ajaxStatus>
		<f:facet name="start">
			<h:outputText value="Loading..." />
		</f:facet>

		<f:facet name="complete">
			<h:outputText value="Ajax Request Completed" />
		</f:facet>
	</p:ajaxStatus>

	<h:form id="form">

		<h:panelGrid columns="2" style="margin-bottom:10px">
			<h:outputLabel for="firstname" value="Firstname:" />
			<h:inputText id="firstname" value="#{pprBean.firstname}" />

			<h:outputLabel for="surname" value="Surname" />
			<h:inputText id="surname" value="#{pprBean.surname}" />

			<p:commandButton value="Reset" type="reset" />
			<p:commandButton value="Ajax Submit" update="form"
				async="true" />
		</h:panelGrid>

		<h:panelGrid id="display" columns="2">
			<h:outputText value="Firstname:" />
			<h:outputText value="#{pprBean.firstname}" />

			<h:outputText value="Surname:" />
			<h:outputText value="#{pprBean.surname}" />
		</h:panelGrid>

	</h:form>

	</body>
</f:view>
</html>