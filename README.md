### Выполнены автотесты через сервис Browserstack на мобильное приложение Wikipedia
![изображение](https://user-images.githubusercontent.com/118796374/233400972-3ae6f60d-a151-4deb-bd8b-2b074377ab77.png)

## :point_right: Проект в Allure TestOps с автотестами с результатами их прохождения.
<a target="_blank" href="https://allure.autotests.cloud/project/2201/dashboards">Проект в Allure TestOps</a>

В Allure TestOps хранится информация по автотестам проекта, по запускам сборок, а также отчет по пройденным сборкам.
![изображение](https://user-images.githubusercontent.com/118796374/233401630-e32f92bc-6083-4d00-8def-3c2035d69645.png)


## :point_right:  Jenkins job c Allure Report с результатами пройденной сборки.
<a target="_blank" href="https://jenkins.autotests.cloud/job/08-sub_ekt-lesson22/">Сборка в jenkins</a>

В Allure Report отображается вся информация по пройденной сборке
![изображение](https://user-images.githubusercontent.com/118796374/233402110-cff9bbc5-b4ae-446a-a52c-cbf7f041001a.png)

### Для запуска удаленных тестов необходимо заполнить properties или передать значение:

* userName
* accessKey
* baseUrl

Запуск тестов с заполненным properties:
```bash
gradle clean android
```
Сформировать отчет:
```bash
allure serve build/allure-results
```

