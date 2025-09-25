# kyo-spring-boot-integration764

This repository contains two related applications: kyo-spring-boot-starter (hereafter — *Starter*) and kyo-spring-boot-test (hereafter — *Test*).  
Thanks to its reference to *Starter*, the *Test* application can use functional language features within the Java Spring Boot environment.  

---

## 1. 📦 *Starter*

### 1.1 Purpose
- As outlined in [kyo#764](https://github.com/getkyo/kyo/issues/764), the *Starter* project is intended to integrate Kyo with Spring Boot.  
- The *Starter* was created as the canonical (production-grade) version of a two-module parent project.

### 1.2 Key Features
- Simplifies configuration: automatically registers the required beans and integrates Kyo (functional language capabilities) into the Spring Boot context.  
- *Starter* is referenced by *Test* through the `pom.xml` dependency.
- Follows the standard Spring Boot Starter approach.  

### 1.3 How to Build
```bash
cd kyo-spring-boot-starter
mvn clean install
```
## 2. 🧪 Test

### 2.1 Purpose
*Test* is a Spring Boot application designed to verify the correct behavior of the *Starter*.

### 2.2 Key Features
- *Test* refers to *Starter* via the `pom.xml` dependency.
- *Test* is a minimal/educational application created specifically to validate the functionality of the *Starter*.
- Using *Test* provides the simplest yet complete way to verify the *Starter*. Alternatively, a lightweight real-world application can be used.
- Ensures proper integration of the Kyo library into Spring Boot.

### 2.3 How to Build and Run
```bash
cd kyo-spring-boot-test
mvn clean install
mvn spring-boot:run
```
After launching *Test*, the console will display standard Spring Boot startup messages and logs confirming successful integration of Kyo.

## Author
- Evgeniy Novak
- 📧 novakevgeniy1953@gmail.com
- 📅 21.08.2025







