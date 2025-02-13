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
        <form:form action="/find2" method="post" modelAttribute="sinhVien">
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
              <th>Mã ngành (tốt nghiệp)</th>
              <th>Mã trường (tốt nghiệp)</th>
              <th>Mã ngành (công ty)</th>
              <th>Tên công ty</th>
              <th>Thời gian làm việc</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>${sinhvien.soCMND}</td>
              <td>${sinhvien.hoten}</td>
              <td>
                <c:forEach var="totNghiep" items="${totNghieps}">
                  ${totNghiep.nganh.maNganh} - ${totNghiep.nganh.tenNganh}
                  <br>
                </c:forEach>
              </td>
              <td>
                <c:forEach var="totNghiep" items="${totNghieps}">
                  ${totNghiep.truong.maTruong} - ${totNghiep.truong.tenTruong}
                  <br>
                </c:forEach>
              </td>
              <td>
                <c:forEach var="congTy" items="${listMaNganhCTY}">
                  ${congTy.nganh.maNganh} - ${congTy.nganh.tenNganh}
                  <br>
                </c:forEach>
              </td>
              <td>
                <c:forEach var="congTy" items="${listMaNganhCTY}">
                  ${congTy.tenCongTy}
                  <br>
                </c:forEach>
              </td>
              <td>
                <c:forEach var="congTy" items="${listMaNganhCTY}">
                  ${congTy.thoiGianlamViec}
                  <br>
                </c:forEach>
              </td>


            </tr>
          </tbody>
          <tbody>

          </tbody>
        </table>
      </body>

      </html>