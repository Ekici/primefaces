<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://primefaces.prime.com.tr/ui" prefix="p"%>
<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
<f:view>
<head>
	<style type="text/css">
		.line {
			width:600px;
			height:400px;
		}
	</style>
	
	<script type="text/javascript">
		var chartStyle = {
			padding:20,
			legend: {
				display:"right",
				spacing:10
			}
		};
	</script>
	<p:resources/>
</head>

<body>
	
<div id="cols">
    <div class="main box">
    
        <div id="content">
     
            <div id="content-in" class="box">
        
                <h2 style="color:#7DAC09;">Charts - Line Chart</h2>

				<p:lineChart value="#{chartBean.births}" var="birth" xfield="#{birth.year}" 
							styleClass="line" style="chartStyle">
					<p:chartSeries label="Boys" value="#{birth.boys}" />
					<p:chartSeries label="Girls" value="#{birth.girls}" />
				</p:lineChart>
				
				<h3>Source</h3>
		<pre name="code" class="xml">
&lt;p:lineChart value=" # {chartBean.births}" var="birth" xfield=" # {birth.year}" 
				styleClass="line" style="chartStyle"&gt;
	&lt;p:chartSeries label="Boys" value=" # {birth.boys}" /&gt;
	&lt;p:chartSeries label="Girls" value=" # {birth.girls}" /&gt;
&lt;/p:lineChart/&gt;
		</pre>
            </div>
                    
        </div>
		
        <hr class="noscreen" />

        <div id="aside">
            
            <ui:include src="../templates/components.xhtml" />
            
        </div>
    
    </div>
</div>

</body>
</f:view>
</html>