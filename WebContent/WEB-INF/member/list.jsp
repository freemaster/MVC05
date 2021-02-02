<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="java.util.*"%>
<%@page import="kr.smhrd.model.*"%>
<c:set var="cpath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>회원리스트 출력( ${cpath} : Model2 - front controller + POJO + HandlerMapping-HashMap + MyBatis)</title>
<style>
/* DivTable.com */
.divTable {
    display: table;
    width: 100%;
    font-size: 12px;
    box-sizing: border-box;
}

.divTableRow {
    display: table-row;
    box-sizing: border-box;
}

.divTableHeading {
    background-color: #EEE;
    display: table-header-group;
    box-sizing: border-box;
}

.divTableCell, .divTableHead {
    border: 1px solid #999999;
    display: table-cell;
    padding: 3px 10px;
    box-sizing: border-box;
}

.divTableHeading {
    background-color: #EEE;
    display: table-header-group;
    box-sizing: border-box;
}

.divTableFoot {
    background-color: #EEE;
    display: table-footer-group;
    font-weight: bold;
    box-sizing: border-box;
}

.divTableBody {
    display: table-row-group;
    box-sizing: border-box;
}

.divTable2 {
    width: 90%;
    font-weight: bold;
    box-sizing: border-box;
}

.divTableRow2 {
    padding: 10px;
    text-align: right;
    box-sizing: border-box;
}

.green {
    background: #a5dca5;
    font-weight: bold;
}

.divTableCell:nth-child(1) {
    width: 6%;
}

.divTableCell:nth-child(4) {
    width: 10%
}

.divTableCell:nth-child(2), .divTableCell:nth-child(3), .divTableCell:nth-child(5),
    .divTableCell:nth-child(6) {
    width: 15%
}

.divTableCell:nth-child(7) {
    width: 14%
}
</style>
<script type="text/javascript">
function insertForm() {
    //location.href="<%//=cpath%>/insertForm.do";
	location.href="${cpath}/insertForm.do";
}
function deleteFn(num) {
	location.href="${cpath}/delete.do?num="+num;
}
function updateFn(num) {
	location.href="${cpath}/content.do?num="+num;
}
</script>
</head>
<body>
    <h4>회원목록( ${cpath} : Model2 - front controller + POJO + HandlerMapping-HashMap + MyBatis )</h4>
    <div class="divTable" style="width: 90%; border: 1px solid #000;">
        <div class="divTableBody">
            <div class="divTableRow">
                <div class="divTableCell green">번호</div>
                <div class="divTableCell green">아이디</div>
                <div class="divTableCell green">이름</div>
                <div class="divTableCell green">나이</div>
                <div class="divTableCell green">이메일</div>
                <div class="divTableCell green">전화번호</div>
                <div class="divTableCell green">관리</div>
            </div>
            <c:forEach var="vo" items="${list}">
                <div class="divTableRow">
                    <div class="divTableCell">${vo.num}</div>
                    <div class="divTableCell">${vo.id}</div>
                    <div class="divTableCell">${vo.mname}</div>
                    <div class="divTableCell">${vo.mage}</div>
                    <div class="divTableCell">${vo.memail}</div>
                    <div class="divTableCell">${vo.mtel}</div>
                    <div class="divTableCell">
                        <button onclick="updateFn(${vo.num})"
                            class="btn btn-primary">수정</button>
                        &nbsp;&nbsp;
                        <button onclick="deleteFn(${vo.num})"
                            class="btn btn-primary">삭제</button>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
    <div class="divTable2">
        <div class="divTableRow2">
            <button onclick="insertForm()" value="회원가입"
                class="btn btn-primary">회원가입</button>
        </div>
    </div>
</body>
</html>