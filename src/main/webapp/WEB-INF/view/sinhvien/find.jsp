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
        <title>Thông tin sinh viên</title>
      </head>

      <body>
        <div class="container py-5">
          <div class="card shadow-sm">
            <div class="card-header bg-primary text-white text-center">
              <h4>Tìm Kiếm Thông Tin Sinh Viên</h4>
            </div>
            <div class="card-body">
              <form:form action="/find" method="post" modelAttribute="sinhVien" class="row g-3">
                <div class="col-12">
                  <label for="" class="form-label">Nhập số CMND: </label>
                  <form:input type="text" path="soCMND" class="form-control" />
                </div>
                <div class="col-12">
                  <button type="submit" class="btn btn-primary">Tìm kiếm</button>
                </div>
              </form:form>
            </div>
          </div>

          <div class="mt-4">
            <div class="card shadow-sm">
              <div class="card-header bg-primary text-white text-center">
                <h4>Kết Quả Tìm Kiếm</h4>
              </div>
              <div class="card-body">
                <table class="table table-bordered table-striped">
                  <thead class="table">
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
              </div>
            </div>
          </div>



        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
          crossorigin="anonymous"></script>
      </body>

      </html>