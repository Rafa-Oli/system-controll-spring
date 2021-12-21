# System Controll Academic (UEPB) - Spring Boot


### *CRUD basic(Teacher, Student and Class) + Route register student and teacher*

### *Routes CRUD student:*
```
GET /students
POST /students
GET /students/{id}
PUT /students/{id}
DELETE /students/{id}

```
### *Routes CRUD teacher:*
```
GET /teacher
POST /teacher
GET /teacher/{id}
PUT /teacher/{id}
DELETE /teacher/{id}

```
### *Routes CRUD class:*
```
GET /classes
POST /classes
GET /classes/{id}
PUT /classes/{id}
DELETE /classes/{id}

```
### *Route register student:*

- [x] PATCH /classes/idClass/register-student/idStudent

### *Route register teacher:*

- [x] PATCH /classes/idClass/register-teacher/idTeacher

### *Model example class:*
```
[
  {
    "idTeacher": 4,
    "idsStudents": [
      5,
      7,
      9
    ],
    "id": 1,
    "name": "eng",
    "classroom": "turma 3"
  },
]
```