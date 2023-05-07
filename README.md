### Выполнены автотесты на мобильное приложение Wikipedia
![изображение](https://user-images.githubusercontent.com/118796374/236701379-3f49fe14-2700-4000-8078-f046034da3be.png)

### Реализована возможность запуска тестов на разных окружениях :
- сервис browserstack
- эмулятор Android Studio
- реальное устройство

Команды для запуска тестов:
```bash
gradle clean test -DdeviceHost=browserstack
gradle clean test -DdeviceHost=emulation
gradle clean test -DdeviceHost=real
```

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
