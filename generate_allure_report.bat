@echo off
set path=C:\Users\Ayah\.m2\repository\allure\allure-2.16.0\bin;C:\Program Files\Java\jdk-17.0.1\bin;%path%
allure serve allure-results
pause
exit