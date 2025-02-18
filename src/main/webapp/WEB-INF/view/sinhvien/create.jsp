<%@page contentType="text/html" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <!DOCTYPE html>
      <html lang="en">

      <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
      </head>

      <body>
        hello
        <form:form action="/create" method="post" modelAttribute="sinhvien">
          <label for="">Nhập số CMND: </label>
          <form:input type="text" path="soCMND" />
          <br />
          <label for="">Nhập họ và tên: </label>
          <form:input type="text" path="hoten" />
          <br />
          <label for="">Nhập email: </label>
          <form:input type="email" path="email" />
          <br />
          <label for="">Nhập số điện thoại: </label>
          <form:input type="text" path="soDT" />
          <br />
          <label for="">Nhập địa chỉ: </label>
          <form:input type="text" path="diaChi" />
          <br />
          <label for="">Chọn hệ tốt nghiệp: </label>
          <form:select path="heTN" name="" id="">
            <form:option value="dai-hoc">Đại học</form:option>
            <form:option value="cao-dang">Cao đẳng</form:option>
            <form:option value="trung-cap">Trung cấp</form:option>
          </form:select>
          <br/>
          <label for="">Chọn ngày tốt nghiệp: </label>
          <form:input type="date" path="ngayTN" />
          <br />
          <label for="">Chọn loại tốt nghiệp: </label>
          <form:select path="loaiTN" name="" id="">
            <form:option value="gioi">Giỏi</form:option>
            <form:option value="kha">Khá</form:option>
            <form:option value="trung-binh">Trung bình</form:option>
          </form:select>
          <br />
          <label for="">Chọn trường: </label>
          <form:select path="maTruong">
            <c:forEach var="truong" items="${listTruong}">
              <form:option value="${truong.maTruong}">${truong.tenTruong}</form:option>
            </c:forEach>
          </form:select>
          <br />
          <label for="">Chọn ngành: </label>
          <form:select path="maNganh">
            <c:forEach var="nganh" items="${listNganh}">
              <form:option value="${nganh.maNganh}">${nganh.tenNganh}</form:option>
            </c:forEach>
          </form:select>
          <br />
          <input type="submit" value="Submit">
        </form:form>
      </body>

      </html>