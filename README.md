# Test the strings

## About The Project
This project is a Selenium-Java based test automation framework designed to test the functionality of a social media platform that is currently under development. It enables automated testing of key features such as user authentication, content creation, interactions, and overall platform performance.
### Built With

* [![Selenium][Selenium]][Selenium-url]
* [![Maven][Maven]][Maven-url]
* [![JUnit][JUnit]][JUnit-url]
* [![java][java]][java-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## The [System Under Test][SUT-url]

El Proyecte Grande is a full-stack web application designed as a social media platform where users can upload pictures, add descriptions, like posts, and leave comments. The primary focus of this data-centric application is to manage and process user-generated data effectively.

Developed by:
- [Eszter Fodor](https://github.com/eszti9902)
- [Brigitta Zsugonics](https://github.com/zsbrigi)
- [Roland Keszeg](https://github.com/keszegroland)

[(see more details)][SUT-url]

## Getting Started

### Prerequisites

1. **Java Development Kit (JDK) 8 or higher**
    - Ensure that you have Java installed on your system, as the project is based on Java. You can download the JDK
      from [Oracle's official website][oracle-url] or use a package manager like sdkman or Homebrew (on macOS).

To verify installation, run the following command in your terminal:

```shell
java -version
```

2. **Apache Maven**
    - Maven is used to manage dependencies and automate builds. You’ll need to have it installed to run the project.

    - Download and install Maven from [here] [Maven-url].
    - Check if Maven is installed by running:

```shell
mvn -version
```

3. **Chrome Browser**
    - The project uses ChromeDriver for running Selenium tests, so you need to have Google Chrome installed.
    - You can download it from [here][chrome-url].

4. **ChromeDriver**
    - ChromeDriver is required to control Chrome via Selenium. Make sure you download the correct version of
      ChromeDriver that matches your installed Chrome browser version.
    - Download ChromeDriver from the official site: [ChromeDriver Downloads][chrome-driver-url]
    - Ensure ChromeDriver is either included in your PATH or the project is configured to point to its location.

5. **JUnit**
   - JUnit is used as the testing framework. It will be managed **automatically** by **Maven** through the pom.xml file, but you can verify that the correct version is included.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Installation

Install the **SUT**
for more details click [here][SUT-url]

To set up the project locally:
   1. clone this repository
```shell
git clone git@github.com:ZsoltEmber/test-the-strings.git
```
2. navigate into the project directory

```shell
cd <foldername>
```

### Run the program
```shell
mvn test
```


<!-- MARKDOWN LINKS & IMAGES -->
[SUT-url]: https://github.com/ZsoltEmber/el-proyecte-grande-sprint-1-java-keszegroland-test

[Selenium]: https://img.shields.io/badge/Selenium-grey?style=plastic&logo=selenium&logoColor=green

[Selenium-url]: https://www.selenium.dev/

[Maven]: https://img.shields.io/badge/Maven-grey?style=plastic&logo=apachemaven&logoColor=%23C71A36

[Maven-url]: https://maven.apache.org/

[JUnit]: https://img.shields.io/badge/JUnit5-grey?style=plastic&logo=junit5&logoColor=%2325A162

[Junit-url]: https://junit.org/junit5/

[java]: https://img.shields.io/badge/Java-grey?style=plastic&logo=data:image/svg%2bxml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCA1MDIuNjMyIDUwMi42MzIiIHN0eWxlPSJlbmFibGUtYmFja2dyb3VuZDpuZXcgMCAwIDUwMi42MzIgNTAyLjYzMiIgeG1sOnNwYWNlPSJwcmVzZXJ2ZSI+CiAgPHBhdGggc3R5bGU9ImZpbGw6I2ZmZiIgZD0iTTI0MC44NjQgMjY5Ljg5NHMtMjguMDItNTMuOTkyLTI2Ljk4NS05My40NDVjLjc1NS0yOC4xOTMgNjQuMzI0LTU2LjA2MiA4OS4yODEtOTYuNTI5QzMyOC4wNzQgMzkuNDMxIDMwMC4wNTQgMCAzMDAuMDU0IDBzNi4yMzQgMjkuMDc3LTEwLjM3NiA1OS4xNDdjLTE2LjYwOSAzMC4xMTMtNzcuOTE0IDQ3Ljc3OS0xMDEuNzQ5IDk5LjY3OXM1Mi45MzUgMTExLjA2OCA1Mi45MzUgMTExLjA2OHoiLz4KICA8cGF0aCBzdHlsZT0iZmlsbDojZmZmIiBkPSJNMzQ1Ljc0MSAxMDUuODY5cy05NS40OTQgMzYuMzQ3LTk1LjQ5NCA3Ny44NDljMCA0MS41NDUgMjUuOTI4IDU1LjAyNyAzMC4xMTMgNjguNTA5IDQuMTQyIDEzLjUyNS03LjI2OSAzNi4zNDctNy4yNjkgMzYuMzQ3czM3LjM2MS0yNS45NSAzMS4xMDUtNTYuMDYyYy02LjIzNC0zMC4xMTMtMzUuMjktMzkuNDc1LTE4LjY1OS02OS41NDQgMTEuMTA5LTIwLjE2OSA2MC4yMDQtNTcuMDk5IDYwLjIwNC01Ny4wOTl6Ii8+CiAgPHBhdGggc3R5bGU9ImZpbGw6I2ZmZiIgZD0iTTIzMC41MSAzMjQuNzQ4Yzg4LjI0Ni0zLjE0OSAxMjAuNDMtMzAuOTk3IDEyMC40My0zMC45OTctNTcuMDc2IDE1LjU1My0yMDguNjU0IDE0LjUzOS0yMDkuNzExIDMuMTI4LTEuMDE0LTExLjQxMSA0Ni43MDEtMjAuNzczIDQ2LjcwMS0yMC43NzNzLTc0LjcyMSAwLTgwLjk1NSAxOC42OGMtNi4yMzUgMTguNjgxIDM1LjM1MyAzMy4wNDcgMTIzLjUzNSAyOS45NjJ6TTM1OC4xODcgMzY4LjQ5NHM4Ni4zNjktMTguNDIxIDc3LjgyNy02NS4zMzhjLTEwLjM1NC01Ny4xMTktNzAuNTgtMjQuOTM2LTcwLjU4LTI0LjkzNnM0Mi42MDIgMCA0Ni43MjIgMjUuOTI4YzQuMTY0IDI1Ljk1LTUzLjk2OSA2NC4zNDYtNTMuOTY5IDY0LjM0NnpNMzE1LjYyOCAzNDMuNjAxcy0yMS43NjUgNS43MTYtNTQuMDEzIDkuMzRjLTQzLjIyOCA0Ljg1My05NS40OTQgMS4wMTQtOTkuNjU3LTYuMjU2LTQuMDk4LTcuMjY5IDcuMjY5LTExLjQxMSA3LjI2OS0xMS40MTEtNTEuOTIxIDEyLjQ2OC0yMy41MTIgMzQuMjMzIDM3LjMzOSAzOC40MTggNTIuMTU4IDMuNTU5IDEyOS43OTEtMTUuNTc0IDEyOS43OTEtMTUuNTc0bC0yMC43MjktMTQuNTE3ek0xODEuNzM4IDM4OC45NDNzLTIzLjU1NS42NjktMjQuOTM2IDEzLjEzN2MtMS4zNTkgMTIuMzgyIDE0LjQ5NiAyMy41MTIgNzIuNjUgMjYuOTY0IDU4LjEzMyAzLjQ1MSA5OC45ODgtMTUuODk4IDk4Ljk4OC0xNS44OThsLTI2LjI5NS0xNS45NjJzLTE2LjYzMSAzLjQ5NC00Mi4yMzYgNi45NDZjLTI1LjYyNiAzLjQ3My03OC4xNzMtMi43ODMtODAuMjQzLTcuNTkzLTIuMTEzLTQuODU1IDIuMDcyLTcuNTk0IDIuMDcyLTcuNTk0eiIvPgogIDxwYXRoIHN0eWxlPSJmaWxsOiNmZmYiIGQ9Ik00MDcuOTk0IDQ0NS4wMDVjOC45OTUtOS43MDctMi43ODMtMTcuMzIxLTIuNzgzLTE3LjMyMXM0LjE0MiA0Ljg1My0xLjMzNyAxMC4zNzZjLTUuNTQ0IDUuNTIyLTU2LjA4NCAxOS4zNDktMTM3LjA2MSAyMy41MTItODAuOTU1IDQuMTYzLTE2OC44NTYtNy42MTUtMTcxLjYzOS0xNy45OS0yLjY5Ni0xMC4zNzYgNDUuMDE4LTE4LjY1OSA0NS4wMTgtMTguNjU5LTUuNTIyLjY5LTcxLjk2IDIuMDcxLTc0LjA3NCAyMC4wODItMi4wNzEgMTcuOTY4IDI5LjA1NiAzMi41MDcgMTUzLjY3IDMyLjUwNyAxMjQuNTUxLS4wMjEgMTc5LjI1NC0yMi44NjUgMTg4LjIwNi0zMi41MDd6Ii8+CiAgPHBhdGggc3R5bGU9ImZpbGw6I2ZmZiIgZD0iTTM1OS41NjggNDg1LjgxN2MtNTQuNjgyIDExLjA0NC0yMjAuNzM0IDQuMDc3LTIyMC43MzQgNC4wNzdzMTA3LjkxOSAyNS42MjYgMjMxLjEwOSA0LjE4NWM1OC44ODgtMTAuMjY4IDYyLjMxOC0zOC43NjMgNjIuMzE4LTM4Ljc2M3MtMTguMDExIDE5LjM5Mi03Mi42OTMgMzAuNTAxeiIvPgo8L3N2Zz4=

[java-url]: https://www.java.com/en/

[oracle-url]: https://www.oracle.com/java/technologies/downloads/?er=221886

[chrome-url]: https://www.google.com/chrome/browser-tools/

[chrome-driver-url]: https://developer.chrome.com/docs/chromedriver/downloads
