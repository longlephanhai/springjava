0) git clone https://github.com/longlephanhai/springjava.git
1) Tạo database tên sinhvien bằng mysql
2) Vào src-> main->resources->appication.properties thay spring.datasource.url=jdbc:mysql://localhost:3306/sinhvien
spring.datasource.username=root
spring.datasource.password=(mật khẩu vào mysql nếu không có thì không điền)
3) truy cập http://localhost:8080/create (dể điền thông tin)
4) truy câp http://localhost:8080/find (dể tìm kiếm thông tin sinh viên theo số cmnd)
5) truy câp http://localhost:8080/find2 (dể tìm kiếm thông tin sinh viên theo số cmnd)
