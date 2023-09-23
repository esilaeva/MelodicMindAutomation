# Проект по автоматизации тестирования для сайта Melodic Mind
 > Революция в способах обучения и практики музыкантов с помощью инновационных современных приложений.  

[Melodic Mind](https://melodic-mind.com/) - where Music meets Technology.  

### Содержание
[Технологии и инструменты](#Технологии-и-инструменты)  
[Сборка в Jenkins](#Сборка-в-Jenkins)  
[Allure Report](#Allure-Report)  
[Интеграция с Allure TestOps](#Интеграция-с-Allure-TestOps)  
[Интеграция с Jira](#Интеграция-с-Jira)  
[Уведомление в Telegram](#Уведомление-в-Telegram)  
[Примеры видео выполнения тестов на Selenoid](#Примеры-видео-выполнения-тестов-на-Selenoid)  


### Технологии и инструменты

Автотесты написаны на языке `Java` с использованием `JUnit 5`, `Selenide`. Запуск браузера осуществляется в `Selenoid`.
Сборщик проекта - `Gradle`. Для удаленного запуска реализована задача в `Jenkins` с формированием `Allure-отчета` и
отправкой результатов в `Telegram` при помощи бота. Так же осуществлена интеграция с `Allure TestOps` и `Jira`.
  

<p>
<a href="https://www.java.com/">
  <img width="7%" title="Java" src="src/test/resources/icons/java-original.svg">
</a>
<a href="https://www.jetbrains.com/">
  <img width="7%" title="IntelliJ IDEA" src="src/test/resources/icons/Idea.svg">
</a>
<a href="https://gradle.org/">
  <img width="7%" title="Gradle" src="src/test/resources/icons/gradle-plain.svg">
</a>
<a href="https://junit.org/junit5/">
  <img width="7%" title="JUnit5" src="src/test/resources/icons/Junit5.svg">
</a>
<a href="https://github.com/">
  <img width="7%" title="GitHub" src="src/test/resources/icons/github-mark-white.svg">
</a>
<a href="https://selenide.org/">
  <img width="7%" title="Selenide" src="src/test/resources/icons/Selenide.svg">
</a>
<a href="https://aerokube.com/selenoid/latest/">
  <img width="7%" title="Selenoid" src="src/test/resources/icons/Selenoid.svg">
</a>
<a href="https://qameta.io/allure-report/">
  <img width="7%" title="Allure Report" src="src/test/resources/icons/Allure.svg">
</a>
<a href="https://www.jenkins.io/">
  <img width="7%" title="Jenkins" src="src/test/resources/icons/jenkins-original.svg">
</a>
<a href="https://telegram.org/">
  <img width="7%" title="Telegram" src="src/test/resources/icons/Telegram.svg">
</a>
<a href="https://qameta.io/">
  <img width="7%" title="Allure TestOps" src="src/test/resources/icons/Allure_TO.svg">
</a>
<a href="https://www.atlassian.com/software/jira">
  <img width="7%" title="Jira" src="src/test/resources/icons/Jira.svg">
</a>
</p>

### Сборка в Jenkins

#### Параметры сборки:

- **WBHOST** - URL Selenoid (по умолчанию selenoid.autotests.cloud)
- **TASK** - задачи (по умолчанию test)
- **BROWSER** - браузер (по умолчанию chrome)
- **BROWSER_VERSION** - версия браузера (по умолчанию 99.0)
- **BROWSER_SIZE** - размер окна браузера (по умолчанию 1920x1080)

Для запуска сборки необходимо перейти в раздел `Собрать с параметрами`, выбрать необходимые параметры и нажать
кнопку `Собрать`.

<p>
<img width="100%" title="Jenkins" src="src/test/resources/screenshorts/006-jenkins.png">
<img width="100%" title="Jenkins" src="src/test/resources/screenshorts/007-jenkins.png">
</p>

### Allure Report

##### Overview

<img width="100%" title="Allure Report" src="src/test/resources/screenshorts/004-allureReport.png">

##### Test details

<img width="100%" title="Allure Report" src="src/test/resources/screenshorts/008-allureReport.png">

### Интеграция с Allure TestOps

В отчете `Allure TestOps` можно:

- просматривать созданные тест-кейсы и чек-листы,
- запускать ручные и автоматические тестовые прогоны,
- заводить дефекты,
- собирать статистику о проделанной работе.

##### Allure TestOps Dashboard

<img width="100%" title="Allure TestOps" src="src/test/resources/screenshorts/009-testOps_dashboards.png">

##### Ручные и автоматические тест-кейсы

<img width="100%" title="Allure TestOps" src="src/test/resources/screenshorts/003-testOps_testCase.png">

### Интеграция с Jira

Интеграция `Allure TestOps` с `Jira`, позволяет отображать в задаче, открытой в `Jira`, какие тест-кейсы были написаны в
рамках задачи и результат их выполнения.

<img width="100%" title="Jira" src="src/test/resources/screenshorts/001-jira.png">

### Уведомление в Telegram

После завершения сборки, автоматически отправляется отчет о результатах выполнения тестов в специально созданный `Telegram канал`.

<img width="40%" title="Jira" src="src/test/resources/screenshorts/005-telegram.png">

### Примеры видео выполнения тестов на Selenoid

В отчетах Allure для каждого теста создается не только скриншот, но и видео его прохождения.

<p>
<img width="100%" title="Selenoid Video" src="src/test/resources/screenshorts/learn_button.gif">  
<img width="100%" title="Selenoid Video" src="src/test/resources/screenshorts/positive_login.gif">
</p>

