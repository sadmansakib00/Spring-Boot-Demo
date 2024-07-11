### Create Student
POST http://localhost:8081/student/create
Content-Type: application/json

{
  "firstName": "Jason",
  "lastName": "Statham",
  "address": "California, USA",
  "dob": "1970-01-01",
  "username": "json"
}

### Create Instructor
POST http://localhost:8081/instructor/create
Content-Type: application/json

{
  "instructorName": "Walter White",
  "instructorOffice": "R602",
  "rank": "DEAN"
}

### Find all instructor
GET http://localhost:8081/instructor/all



### Create Course
POST http://localhost:8081/course/create
Content-Type: application/json

{
  "title": "Introduction to Physics",
  "creditHour": 3.5,
  "instructorId": 2
}
