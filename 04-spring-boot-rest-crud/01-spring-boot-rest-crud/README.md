<h1 align="center"> Springboot rest crud example </h1> <br>

<p align="center">
  Springboot rest crud
</p>


## Table of Contents

- [Introduction](#introduction)



## Introduction
This example helps to understand to
- Create a rest api service,
- REST Path Variables,
- Exception handling,
  - Create a custom error response class
  - Create a custom exception class
  - Update REST service to throw exception if student not found
  - Add an exception handler using @ExceptionHandler
  - Test : localhost:8080/api/students/1 : Should work
  - Test : localhost:8080/api/students/9999 : Should get error response
- Global Exception Handling
  - Create new @ControllerAdvice
  - Refactor REST service .... remove exception handling code
  - Add exception handling code to @ControllerAdvice[README.md](..%2F..%2FREADME.md)