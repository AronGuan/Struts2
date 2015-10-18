<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Login</title>
	</head>

	<body>
	<ol>
		<li>property:<s:property value="username"/> </li>
		<li>property字符串:<s:property value="'username'"/> </li>
		<li>property默认值:<s:property value="admin" default="管理员"/> </li>
		<li>property设定HTML:<s:property value="<hr/>" escape="false"/></li>
		<hr/>
		<li>set设定adiminName值(默认为request和ActionContext):<s:set var="adminName" value="username"></s:set> </li>
		<li>set 从request:<s:property value="#request.adminName"/> </li>debug看不到因为在向request放值得时候  debug数据就已经生成了。
		<li>set 从ActionContext:<s:property value="#adminName"/> </li>
		<li>set设定范围:<s:set var="adminPassword" value="password" scope="session"></s:set> </li>
		<li>set范围内取值:<s:property value="#session.adminPassword"/></li>
		<hr/>
		<li>bean:查看debug情况
			<s:bean var="myDog" name="pers.aron.Dog">
				<s:param name="name" value="'candy'"></s:param>
			</s:bean>
		</li>
		<hr/>
		<s:if test="#parameters.age[0] < 0">wrong</s:if>
		<s:elseif test="#parameters.age[0] < 20">too yong</s:elseif>
		<s:else>yeah!</s:else>
		
		<hr/>
		<li>自定义变量:<br/>
		<s:iterator value="{'aaa','bbb','ccc'}" var="x">
			<s:property value="#x.toUpperCase()"/>
		</s:iterator>
		</li>
		<li>
		<s:iterator value="{'aaa','bbb','ccc'}" status="status">
			<s:property/>
			遍历过的元素总数:<s:property value="#status.count"/>
			遍历过的元素索引:<s:property value="#status.index"/>
			当前是偶数:<s:property value="#status.even"/>
			当前是奇数:<s:property value="#status.odd"/>
			是第一个元素吗？<s:property value="#status.first"/>
			是最后一个元素吗？<s:property value="#status.last"/>
			<br/>
		</s:iterator>
		</li>
		
		<li>
		<s:iterator value="#{1:'a',2:'b',3:'c'}" var="x">
			<s:property value="#x.key"/>|<s:property value="#x,value"/><br/>
		</s:iterator>
		</li>
		
	</ol>
		<s:debug/>
	</body>
	
</html>
