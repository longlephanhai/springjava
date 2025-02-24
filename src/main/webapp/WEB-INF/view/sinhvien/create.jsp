<%@page contentType="text/html" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <!DOCTYPE html>
      <html lang="en">

      <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Tạo mới thông tin</title>
      </head>

      <body>
        <div class="container mt-4">
          <div class="row justify-content-center">
            <form:form action="/create" method="post" modelAttribute="sinhvien">
              <c:set var="errorCMND">
                <form:errors path="soCMND" cssClass="invalid-feedback" />
              </c:set>
              <c:set var="errorEmail">
                <form:errors path="email" cssClass="invalid-feedback" />
              </c:set>
              <c:set var="errormaTruong">
                <form:errors path="maTruong" cssClass="invalid-feedback" />
              </c:set>
              <c:set var="errormaNganh">
                <form:errors path="maNganh" cssClass="invalid-feedback" />
              </c:set>
              <c:set var="errorngayTN">
                <form:errors path="ngayTN" cssClass="invalid-feedback" />
              </c:set>
              <div class="mb-3">
                <label for="" class="form-label">Nhập số CMND: </label>
                <form:input type="text" path="soCMND"
                  class="form-control ${not empty errorCMND ? 'is-invalid' : '' }" />
                ${errorCMND}
              </div>

              <div class="mb-3">
                <label for="" class="form-label">Nhập họ và tên: </label>
                <form:input type="text" path="hoten" class="form-control" />
              </div>

              <div class="mb-3">
                <label for="" class="form-label">Nhập email: </label>
                <form:input type="email" path="email"
                  class="form-control ${not empty errorEmail ? 'is-invalid' : '' }" />
                <c:if test="${not empty errorEmail}">
                  ${errorEmail}
                </c:if>
              </div>

              <div class="mb-3">
                <label for="" class="form-label">Nhập số điện thoại: </label>
                <form:input type="text" path="soDT" class="form-control" />
              </div>

              <div class="mb-3">
                <label for="" class="form-label">Nhập địa chỉ: </label>
                <form:input type="text" path="diaChi" class="form-control" />
              </div>

              <div class="mb-3">
                <label for="" class="form-label">Chọn hệ tốt nghiệp: </label>
                <form:select path="heTN" name="" id="" class="form-select">
                  <form:option value="dai-hoc">Đại học</form:option>
                  <form:option value="cao-dang">Cao đẳng</form:option>
                  <form:option value="trung-cap">Trung cấp</form:option>
                </form:select>
              </div>

              <div class="mb-3">
                <label for="" class="form-label">Chọn ngày tốt nghiệp: </label>
                <form:input type="date" path="ngayTN"
                  class="form-control ${not empty errorngayTN ? 'is-invalid' : '' }" />
                ${errorngayTN}
              </div>

              <div class="mb-3">
                <label for="" class="form-label">Chọn loại tốt nghiệp: </label>
                <form:select path="loaiTN" name="" id="" class="form-select">
                  <form:option value="gioi">Giỏi</form:option>
                  <form:option value="kha">Khá</form:option>
                  <form:option value="trung-binh">Trung bình</form:option>
                </form:select>
              </div>
              <div class="mb-3">
                <label for="" class="form-label">Chọn trường: </label>
                <form:select path="maTruong" class="form-select ${not empty errormaTruong ? 'is-invalid' : '' }">
                  <form:option value="">Chọn trường tốt nghiệp</form:option>
                  <c:forEach var="truong" items="${listTruong}">
                    <form:option value="${truong.maTruong}">${truong.tenTruong}</form:option>
                  </c:forEach>
                </form:select>
                ${errormaTruong}
              </div>

              <div class="mb-3">
                <label for="" class="form-label">Chọn ngành: </label>
                <form:select path="maNganh" class="form-select ${not empty errormaNganh ? 'is-invalid' : '' }">
                  <form:option value="">Chọn ngành tốt nghiệp</form:option>
                  <c:forEach var="nganh" items="${listNganh}">
                    <form:option value="${nganh.maNganh}">${nganh.tenNganh}</form:option>
                  </c:forEach>
                </form:select>
                ${errormaNganh}
              </div>

              <div class="d-grid">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </form:form>
          </div>

        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
          crossorigin="anonymous"></script>
      </body>

      </html>