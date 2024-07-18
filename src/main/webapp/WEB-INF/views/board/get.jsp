<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<style>
<sryle type="text/css">
.input_wrap{
 padding: 5px 20px;
}
label{
 display: block;
 margin: 10px 0;
 fron-size:20 px;
}
input{
padding: 5px;
front-size:17px;
}
textarea{
 width: 800px;
 height:200px;
 font-size: 15px;
 padding: 10px;
}
.btn{
 display: inline-block;
 font-size: 22px;
 padding: 6px 12px;
 background-color: #fff;
 border: 1px solid #ddd;
 font-weight: 600;
 width:140px;
 height: 41px;
 line-height: 39px;
 text-align: center;
 margin-left: 30px;
 cursor: pointer;
 }
 .btn_wrap{
  padding-left :80px;
  margin-top: 50px;
 }
</style>
</head>

<body>
<h1>조회 페이지</h1>
<div class="input_wrap">
  <label>게시판 번호</label>
  <input name="bno" readonly="readonly" value='<c:out value="${pageInfo.bno}"/>'>
</div>
<div class="input_wrap">
  <label>게시판 제목</label>
  <input name="title" readonly="readonly" value='<c:out value="${pageInfo.title}"/>'>
</div>
<div class="input_wrap">
  <label>게시판 내용</label>
  <textarea row="3" name="content" readonly="readonly" ><c:out value="${pageInfo.content}"/></textarea>
</div>
<div class="input_wrap">
  <label>게시판 작성자</label>
  <input name="writer" readonly="readonly" value='<c:out value="${pageInfo.writer}"/>'>
</div>
<div class="input_wrap">
  <label>게시판 등록일</label>
  <input name="regDate" readonly="readonly" value='<fmt:formatDate pattern="yyyy/MM/dd" value="${pageInfo.regDate}"/>'>
</div>
<div class="input_wrap">
  <label>게시판 수정일</label>
  <input name="updateDate" readonly="readonly" value='<fmt:formatDate pattern="yyyy/MM/dd" value="${pageInfo.updateDate}"/>'>
</div>
<div class="btn_wrap">
<a class="btn" id="list_btn">목록 페이지</a>
<a class="btn" id="modify_btn">수정하기</a>
</div>
<form id="infoForm" action="/board/modify" method="get">
   <input type="hidden" id="bno" name="bno" value='<c:out value="${pageInfo.bno}"/>'> 
</form>
<script>    
              //#은 id , 
 let form = $("#infoForm");
 
 $("#list_btn").on("click" , function(e){
	form.find("#bno").remove();
	form.attr("action", "/board/list");
	form.submit(); 
 });
 
 $("#modify_btn").on("click" , function(e){
		form.attr("action", "/board/modify");
		form.submit(); 
	 });
</script>

</body>
</html>