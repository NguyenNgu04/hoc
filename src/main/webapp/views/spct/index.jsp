<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Sản Phẩm</th>
        <th scope="col">Mã</th>
        <th scope="col">ID Màu Sắc</th>
        <th scope="col">ID Kích thước</th>
        <th scope="col">Số lượng</th>
        <th scope="col">Đơn giá</th>
        <th scope="col">Trạng thái</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${data.content}" var="spct">
        <tr>
            <th scope="row">${spct.id}</th>
            <td>${spct.tenSP}</td>
            <td>${spct.maSPCT}</td>
            <td>${spct.idMS}</td>
            <td>${spct.idKT}</td>
            <td>${spct.soLuong}</td>
            <td>${spct.donGia}</td>
            <td>${spct.trangThai}</td>
        </tr>
    </c:forEach>


    </tbody>
</table>
</body>
</html>