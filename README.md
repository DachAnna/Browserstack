### Выполнены автотесты на мобильное приложение Wikipedia

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
