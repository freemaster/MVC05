<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="cpath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입( ${cpath} : Model2 - front controller + POJO + HandlerMapping-HashMap + MyBatis )</title>
<style type="text/css">
tr {
    height: 50px;
}

th {
    width: 20%;
    border: 1px solid #000;
    text-align: right;
    padding-right: 30px;
    background: #a5dca5
}

td {
    width: 80%;
    padding: 10px;
    border: 1px solid #000;
}

table {
    border: 1px solid #000;
    width: 80%;
    font-size: 12px;
}

input {
    height: 30px;
    line-height: 30px;
}

.btns {
    text-align: center;
}
</style>
<script type="text/javascript">
    function memberList() {
        location.href = "${cpath}/list.do";
    }
</script>
</head>
<body>
    <h4>회원가입( ${cpath} : Model2 - front controller + POJO + HandlerMapping-HashMap + MyBatis )</h4>
    <form action="${cpath}/insert.do" method="post">
        <table>
            <tr>
                <th>아이디</th>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <th>비밀번호</th>
                <td><input type="password" name="pass"></td>
            </tr>
            <tr>
                <th>이름</th>
                <td><input type="text" name="mname"></td>
            </tr>
            <tr>
                <th>나이</th>
                <td><input type="text" name="mage"></td>
            </tr>
            <tr>
                <th>이메일</th>
                <td><input type="text" name="memail"></td>
            </tr>
            <tr>
                <th>전화번호</th>
                <td><input type="text" name="mtel"></td>
            </tr>
            <tr>
                <td colspan="2" class="btns">
                    <input type="submit" value="회원가입"> &nbsp;&nbsp; 
                    <input type="reset" value="취소"> &nbsp;&nbsp; 
                    <input type="button" onclick="memberList()" value="목록">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>