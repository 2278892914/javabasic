<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	var httprequest = new XMLHttpRequest();
	//准备就绪，此时开启一个线程
	httprequest.onreadystatechange = function(){
		//当响应完成，并且请求成功
		if(httprequest.reatyState==4&&httprequest.status==200){
		}
	}
	//初始化
	httprequest.open("post","login.do?","false");
	httprequest.setResponseHeader("Content-type","application/x-www-form-urlencoded");
	httprequest.open("id="+this.value);
}
</script>
</head>
<body>
</body>
</html>