# Проект по автоматизации тестирования для сайта Melodic Mind

Melodic Mind - where Music meets Technology

### Содержание
[Технологии и инструменты](#Технологии-и-инструменты)
[]()
[]()

Автотесты написаны на языке `Java` с использованием `JUnit 5`, `Selenide`. Запуск браузера осуществляется в `Selenoid`.
Сборщик проекта -  `Gradle`. Для удаленного запуска реализована джоба в Jenkins с формированием Allure-отчета и
отправкой результатов в Telegram при помощи бота. Так же осуществлена интеграция с `Allure TestOps` и `Jira`.

### Технологии и инструменты

<p>
<img width="7%" title="Java" src="src/test/resources/icons/Idea.svg">
<img width="7%" title="IntelliJ IDEA" src="src/test/resources/icons/java-original.svg">
<img width="7%" title="Gradle" src="src/test/resources/icons/gradle-plain.svg">
<img width="7%" title="JUnit5" src="src/test/resources/icons/Junit5.svg">
<img width="7%" title="GitHub" src="src/test/resources/icons/github-original.svg">
<img width="7%" title="Selenide" src="src/test/resources/icons/Selenide.svg">
<img width="7%" title="Selenoid" src="src/test/resources/icons/Selenoid.svg">
<img width="7%" title="Allure Report" src="src/test/resources/icons/Allure.svg">
<img width="7%" title="Jenkins" src="src/test/resources/icons/jenkins-original.svg">
<img width="7%" title="Telegram" src="src/test/resources/icons/Telegram.svg">
<img width="7%" title="Allure TestOps" src="src/test/resources/icons/Allure_TO.svg">
<img width="7%" title="Jira" src="src/test/resources/icons/Jira.svg">
</p>

### Команды для запуска из терминала

Запуск всех тестов:
`gradle clean test -Dselenoid_url="selenoid.autotests.cloud/wd/hub" -Dbrowser_size="1920х1080" -Dbrowser="chrome" -Dbrowser_version="100.0"`
Запуск `homepage tests`:
`gradle clean homepage -Dselenoid_url="selenoid.autotests.cloud/wd/hub" -Dbrowser_size="1920х1080" -Dbrowser="chrome" -Dbrowser_version="100.0"`
Запуск `login tests`:
`gradle clean login -Dselenoid_url="selenoid.autotests.cloud/wd/hub" -Dbrowser_size="1920х1080" -Dbrowser="chrome" -Dbrowser_version="100.0"`

При выполнении команды, данные тесты запустятся удаленно в Selenoid.

### <img width="4%" style="vertical-align:middle" title="Jenkins" src="src/test/resources/icons/jenkins-original.svg"> Сборка в Jenkins

#### Параметры сборки

- *WBHOST* (URL Selenoid, по умолчанию selenoid.autotests.cloud)
- *TASK* (Задачи, по умолчанию test)
- *BROWSER* (Браузер, по умолчанию chrome)
- *BROWSER_VERSION* (Версия браузера, по умолчанию 99.0)
- *BROWSER_SIZE* (Размер окна браузера, по умолчанию 1920x1080)

Для запуска сборки необходимо перейти в раздел `Собрать с параметрами`, выбрать необходимые параметры и нажать
кнопку `Собрать`.

<p>
<img width="100%" title="Jenkins" src="src/test/resources/screenshorts/006-jenkins.png">
<img width="100%" title="Jenkins" src="src/test/resources/screenshorts/007-jenkins.png">
</p>

### <img width="4%" style="vertical-align:middle" title="Allure Report" src="src/test/resources/icons/Allure.svg"> Allure Report

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

##### Автоматические и ручные тест-кейсы

<img width="100%" title="Allure TestOps" src="src/test/resources/screenshorts/003-testOps_testCase.png">

### Интеграция с Jira

Интеграция `Allure TestOps` с `Jira`, позволяет отображать в тикете, открытом в `Jira`, какие тест-кейсы были написаны в
рамках задачи и результат их прогона.

<img width="100%" title="Jira" src="src/test/resources/screenshorts/001-jira.png">

### Уведомление в Telegram

После завершения сборки, автоматически отправляется отчет о результатах прогона тестов в `Telegram канал`.  
<img width="40%" title="Jira" src="src/test/resources/screenshorts/005-telegram.png">

### Примеры видео выполнения тестов на Selenoid

В отчетах Allure для каждого теста создается не только скриншот, но и видео его прохождения.

<p>
<img width="100%" title="Selenoid Video" src="src/test/resources/screenshorts/learn_button.gif">
<img width="100%" title="Selenoid Video" src="src/test/resources/screenshorts/positive_login.gif">
</p>

