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
        <form:form action="/find" method="post" modelAttribute="sinhVien">
          <label for="">Nhập số CMND: </label>
          <form:input type="text" path="soCMND" />
          <br />
          <input type="submit" value="Tìm kiếm" />
        </form:form>
        <table>
          <thead>
            <tr>
              <th>SoCMND</th>
              <th>HoTen</th>
              <th>Email</th>
              <th>SoDT</th>
              <th>DiaChi</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>${sinhvien.soCMND}</td>
              <td>${sinhvien.hoten}</td>
              <td>${sinhvien.email}</td>
              <td>${sinhvien.soDT}</td>
              <td>${sinhvien.diaChi}</td>
            </tr>
          </tbody>
          <tbody>

          </tbody>
        </table>
      </body>

      </html>