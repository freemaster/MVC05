<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="kr.smhrd.model.*"%>
<%@page import="java.util.*"%>
<c:set var="cpath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>회원정보 수정(${cpath} : Model2 - front controller + POJO + HandlerMapping-HashMap + MyBatis )</title>
<style type="text/css">
tr {
    height: 50px;
}

th {
    border: 1px solid #000;
    text-align: right;
    padding-right: 30px;
    background: #a5dca5
}

td {
    padding: 10px;
    border: 1px solid #000;
}

table {
    b .order: 1px solid #000;
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
    <h4>${vo.mname}님의상세보기(${cpath} : Model2 - front controller +
        POJO + HandlerMapping-HashMap + MyBatis )</h4>
    <form action='${cpath}/update.do' method='post'>
        <table border='1'>
            <colgroup>
                <col width="20%">
                <col width="*">
            </colgroup>
            <tr>
                <th>번호 <input type='hidden' name='num'
                    value='${vo.num}'>
                </th>
                <td>${vo.num}</td>
            </tr>
            <tr>
                <th>아이디</th>
                <td>${vo.id}</td>
            </tr>
            <tr>
                <th>비밀번호</th>
                <td>${vo.pass}</td>
            </tr>
            <tr>
                <th>이름</th>
                <td>${vo.mname}</td>
            </tr>
            <tr>
                <th>나이</th>
                <td><input type='text' name='mage'
                    value='${vo.mage}'></td>
            </tr>
            <tr>
                <th>이메일</th>
                <td><input type='text' name='memail'
                    value='${vo.memail}'></td>
            </tr>
            <tr>
                <th>전화번호</th>
                <td><input type='text' name='mtel'
                    value='${vo.mtel}'></td>
            </tr>
            <tr>
                <td colspan="2" class="btns"><input type='submit'
                    value='수정'> &nbsp;&nbsp; <input type='reset'
                    value='취소'> &nbsp;&nbsp; <input
                    type="button" onclick="memberList()" value="목록">
                </td>
            </tr>
        </table>
    </form>
</body>