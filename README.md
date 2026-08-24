<div align="center">
  <h1 style="color: #1BA8A8; font-size: 2.5em; margin-bottom: 5px;">
    📚 Book Club
  </h1>
  <h3 style="color: #333333; font-weight: normal; margin-top: 0;">
    Дипломный проект по автоматизации тестирования: API <br>
    <a href="https://book-club.qa.guru" target="_blank" style="color: #1BA8A8; text-decoration: none; font-weight: bold;">
      book-club.qa.guru ↗
    </a>
  </h3>
</div>

## <span style="color: #1BA8A8;">✅</span> Содержание

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins) / терминал
- Allure-отчет
- Интеграция с Allure TestOps
- Интеграция с Atlassian Jira
- Уведомление в Telegram о результатах прогона тестов

<a id="tools"></a>
## <span style="color: #1BA8A8;">✅</span> Технологии и инструменты

| Java                                                                                                      | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         |  Jenkins                                                                                                        |   Jira                                                                                                              | Telegram                                                                                                            |Allure <br> TestOps                                                                                                          
|:----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  | <a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> |<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50" alt="Java" title="Java"/></a> | <a href="https://web.telegram.org/"><img src="images/logo\Telegram.svg" width="50" height="50" alt="Telegram"/></a> |<a href="https://qameta.io/"><img src="images/logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> |

<a id="cases"></a>
## <span style="color: #1BA8A8;">✅</span> Реализованные API-проверки

- Успешная регистрация нового пользователя и авторизация с получением JWT-токенов
- Негативные сценарии авторизации: пустые поля, некорректный логин, существующий пользователь, неверный пароль, ошибочный Content-Type
- Успешный выход из системы (logout) с аннулированием refresh-токена
- Успешное обновление access-токена с помощью валидного refresh-токена
- Негативные сценарии работы с токенами: отсутствие токена, невалидный токен, передача access-токена вместо refresh, повторное использование отозванного токена
- Полное (PUT) и частичное (PATCH) обновление профиля пользователя
- Валидация обязательных полей при попытке частичного обновления через метод PUT
- CRUD-операции: создание, чтение по ID, полное обновление и удаление


## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.qa.guru/job/41_DK_API/)

<p align="center">  
<img src="images/screen/Jenkins.png" alt="Jenkins" width="950"/></a>  
</p>


## <span style="color: #1BA8A8;">✅</span> Конфигурация проекта

- **Базовый URL API:** `https://book-club.qa.guru/api/v1/` 
- **Фреймворк:** Rest Assured + JUnit 5
- **Отчетность:** Allure Report с автоматической генерацией после каждого прогона
- **CI/CD:** Jenkins

## <span style="color: #1BA8A8;">✅</span> Команда для запуска из терминала
```bash
./gradlew clean test 
```

## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a>  <a name="Allure"></a>Allure Report	</a>


## Основная страница отчёта

<p align="center">  
<img src="images/screen/Основная страница Allure.png" src="images/logo/Allure.svg" width="850">  
</p>  

## Сьюты

<p align="center">  
<img title="Allure Tests" src="images/screen/Allure сьют.png" width="850">  
<p align="center">  
<img title="Allure Tests" src="images/screen/Allure сьют2.png" width="850">  

</p>

## Graphs

<p align="center">  
<img title="Allure Tests" src="images/screen/Graphs.png" width="850">  
</p>


## <img alt="Allure_TO" height="25" src="images/logo/Allure_TO.svg" width="25"/> <a href="https://allure.qa.guru/project/5363/launches" target="_blank" style="color: #1BA8A8; text-decoration: none;">Интеграция с Allure TestOps ↗</a>

## Allure TestOps Запуски

<p align="center">  
<img title="Allure Tests" src="images/screen/TestOps 1.png" width="850">  
</p>  

## Авто тест-кейсы

<p align="center">  
<img title="Allure Graphics" src="images/screen/TestOps кейсы.png" width="850">   
</p>

## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.qa.guru/browse/MUL-39">Jira</a>

<p align="center">  
<img title="Jira" src="images/screen/Jira1.png" width="">  
</p>

____

