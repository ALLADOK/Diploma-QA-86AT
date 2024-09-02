# Шаги выполнения автотестов

1. Скачать Dbeaver 24.1.3
   
2. Запустить в терминале проекта контейнеры MySQl, PostgreSQL и Node.js
   > docker compose up

3. Запустить в терминале jar файл
   > java -jar ./artifacts/aqa-shop.jar

4. В Dbeaver подключится к базам данных
   > MySQL порт 3306, user - app, password - pass

   > PostgreSQL порт 5433, user - app, password - pass 

5. Запустить в терминале автотесты
   >./gradlew clean test -Durl=jdbc:mysql://localhost:3306/app

   >./gradlew clean test -Durl=jdbc:postgresql://localhost:5433/app

6. Для получения отчета Allure в терминале ввести команду
   >./gradlew allureServe

7. После окончания тестов завершить работу приложения (Ctrl+C)
   
8. Остановить контейнеры командой
   >docker compose down