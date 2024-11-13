# **Tugas Final Project**

------------------------------------------------
## **Informasi Dasar**
Aplikasi Final testing ini adalah salah tugas final project dari `Test Aplikasi Kamu (TAK)` dengan topik `Goes To QA Katalon Mobile Automation`, aplikasi ini berisi testing untuk API, Mobile, dan juga Web.

## Panduan Aplikasi
### Requirement yang harus disiapkan:
* Menggunakan Bahasa Groovy based Katalon Studio v9
* Testing API dilakukan pada End-Point API `https://restful-booker.herokuapp.com/apidoc`
* Testing Mobile menggunakan aplikasi `Todo_2.0_APKPure.apk`
* Testing Web menggunakan web `https://juice-shop.herokuapp.com/`

## Ringkasan Hasil Testing
Pada pelaksanaan testing dilakukan testing pada `total 17 Test Case` dengan hasil:

```
17 Passed
0 Failed
0 Not Executed
```
Sehingga hasil pengujain adalah `100% Passed`

Pada pengujian, dibuat juga `total 6 Test Suite` agar dapat menjalankan beberapa test case secara bersamaan yaitu

API
```
TS_Get ID
TS_E2E
```
Mobile
```
TS_Create Task
TS_Delete Task
TS_Edit Task
```
Web
```
TS_Buying Product
```

dan dibuat juga `3 total Test Suites Collection` agar dapat menjalankan beberapa `Test Suite` secara bersamaan yaitu
API
```
TSC All
```
Mobile
```
TSC All
```
Web
```
TSC_Buying Product
```

# End Point API
End Point yang diuji pada project ini adalah:

### POST Token
Untuk mendapatkan kode token yang akan digunakan untuk semua testing, akan menghasilkan response code `200 OK` dan akan memberikan code token untuk digunakan.
```
https://restful-booker.herokuapp.com/auth
```

### GET Booking by ID
Untuk mendapatkan data booking berdasarkan ID
```
https://restful-booker.herokuapp.com/booking/1
https://restful-booker.herokuapp.com/booking/2
https://restful-booker.herokuapp.com/booking/3
https://restful-booker.herokuapp.com/booking/4
```
### POST Create Booking
Untuk menambahkan data booking, dengan memasukan pada `HTTP BODY` dengan atribute `TEXT` atau `JSON` akan menghasilkan response code `200 OK` dan menambahkan data
```
{
    "firstname":"Mamang",
    "lastname":"Racing",
    "totalprice":2500,
    "depositpaid":true,
    "bookingdates":{
      "checkin":"2024-11-09",
      "checkout":"2024-11-14"
    },
    "additionalneeds":"Race"
  }
}
```
### PUT Update Booking
untuk mengubah data booking berdasarkan id 
```
https://restful-booker.herokuapp.com/booking/1
```
Lalu memasukan data pada `HTTP BODY` dengan atribute `TEXT` atau `JSON` akan menghasilkan response code `200 OK` dan hasil perubahan data
```
{
  "firstname":"Ayyy",
  "lastname":"Yeee",
  "totalprice":2600,
  "depositpaid":true,
  "bookingdates":{
    "checkin":"2024-07-25",
    "checkout":"2024-01-26"
  },
  "additionalneeds":"Tea"
}
```
### DELETE Booking
untuk menghapus data bookingt berdasarkan id 
```
https://restful-booker.herokuapp.com/booking/1
```
Akan menghasilkan response code ```201 Created``` dan data terhapus.


### Dibuat Oleh
AqshalB
