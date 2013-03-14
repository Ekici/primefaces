<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://primefaces.prime.com.tr/ui" prefix="p"%>
<%@ taglib uri="http://primefaces.prime.com.tr/facestrace" prefix="ft"%>
<%@ taglib uri="http://primefaces.prime.com.tr/optimus" prefix="opt"%>

<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
<f:view>
	<head>
	<title>Test @ PrimeFaces</title>
	<p:resources/>
	</head>
	<body>
	<h1>Testing ui components</h1>

	<h:form>
		<p:dataTable id="tbl" var="car" value="#{tableBean.cars}" 
								paginator="true" rows="10">
					<p:column>
						<f:facet name="header">
							<h:outputText value="Model" />
						</f:facet>
						<h:outputText value="#{car.model}" />
					</p:column>

					<p:column>
						<f:facet name="header">
							<h:outputText value="Year" />
						</f:facet>
						<h:outputText value="#{car.year}" />
					</p:column>

					<p:column>
						<f:facet name="header">
							<h:outputText value="Manufacturer" />
						</f:facet>
						<h:outputText value="#{car.manufacturer}" />
					</p:column>

					<p:column>
						<f:facet name="header">
							<h:outputText value="Color" />
						</f:facet>
						<h:outputText value="#{car.color}" />
					</p:column>
				</p:dataTable>

					<h:commandButton value="Export as Excel">
						<opt:exportActionListener type="xls" target="tbl" fileName="cars"/>
					</h:commandButton>
	
					<h:commandButton value="Export as PDF">
						<opt:exportActionListener type="pdf" target="tbl" fileName="cars"/>
					</h:commandButton>
					
					<h:commandButton value="Export as CSV">
						<opt:exportActionListener type="csv" target="tbl" fileName="cars"/>
					</h:commandButton>
					
					<h:commandButton value="Export as XML">
						<opt:exportActionListener type="xml" target="tbl" fileName="cars"/>
					</h:commandButton>
	</h:form>

	</body>

</f:view>
</html>