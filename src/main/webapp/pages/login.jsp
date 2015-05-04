<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 20.04.15
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>TASK TRACKER >> LOGIN</title>
  <link href="../resources/css/main.css" rel="stylesheet" type="text/css" >
</head>
<body class="body" background="../resources/images/1.jpg">

<br><br><br><br>
<div class="div_top" ><b>TASK TRACKER >> LOGIN</b></div>
<div class="div_center">
  <form action="/login" method="post"> <%--//потом поменять на пост--%>
    <table align="center">

      <tr>
        <td class="td1_form">
          <div class="label_form"><label><span class="required">*</span>User name:</label></div>
        </td>
        <td>
        </td>
        <td class="td3_form">
          <div class="input_form"><input name="username" type="text" size="18" maxlength="15"
                                         value="" <%--required="required"--%>
                                         placeholder="User name">
          </div>
        </td>
      </tr>
      <tr>
        <td class="td1_form">
          <div class="label_form"><label><span class="required">*</span>Password:</label></div>
        </td>
        <td>
        </td>
        <td class="td3_form">
          <div class="input_form"><input name="password" type="password" size="18" maxlength="15"
                                         value="" <%--required="required"--%>
                                         placeholder="Password">
          </div>
        </td>
      </tr>
      <tr>
        <td class="td1_form">
          <div class="input_form"><input type="submit" name="login" style="font-size:18px;"
                                         value="Login"></div>
        </td>
        <td>
        </td>
        <td class="td3_form">
          <div class="input_form"><input type="submit" name="registration" style="font-size:18px;"
                                         value="Registration"></div>
        </td>
        <td>
        </td>
      </tr>
    </table>
  </form>
</div>

<c:if test="${param.error == 'invalidLoginPassword'}">
<div class="div_top" style="border-color: crimson; font-size: 24px">Invalid login or password. Please check and try again.</div>
</c:if>
<c:if test="${param.error == 'loginRequired'}">
<div class="div_top" style="border-color: crimson; font-size: 24px">You are currently logged off. Please log in.</div>
</c:if>
<div class="div_top" style="border-color: crimson; font-size: 24px"><a href="/messagehome.as">Переход на страницу /messagehome.as</a></div>

</body>
</html>
