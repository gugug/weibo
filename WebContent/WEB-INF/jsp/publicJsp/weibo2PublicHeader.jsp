<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html>
    <header>
        <ul>
            <li id="logo"><a href="./weiboMain.action">云山舆情</a></li>
            <li>
                <img src="../public/images/sina.png"/>
                <span>微博平台分析</span>
            </li>
        </ul>
        <div>
            <ul>
                <li><a href="./weiboMain.action">微博端</a></li>
                <li>
<%--                 <a href="http://${pageContext.request.localAddr }:8088">
 --%>              
 				  <a href="http://iiip.gdufs.edu.cn/WeiboNewsProject/xinwen/">
                新闻端</a></li>
            </ul>
            <span>
               	<form action="./weiboMain.action" method="post">
     				<input type="text" name="searchContent">
      				<img src="../public/images/searcht.png"/>
   				</form>
            </span>
        </div>
    </header>
</html>