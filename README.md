# task-tracker-mv
####НА СТАДИИ РАЗРАБОТКИ
###Intellij Idea 14.1 Ultimate Edition, Java 7 - Diamonds (1.7.0_76), Tomcat 8.0.20, Maven 3

###Java — Spring IOC/MVC/Security — JPA-Hibernate — REST service — MySQL — JDBC — Maven — Tomcat — JSP — Servlets — CSS — JSON — jQuery

####Технологии Backend & Frontend:
Java, Spring IOC/MVC/Security, JPA-Hibernate, MySQL, REST service, Maven, Tomcat, JSP, Servlets, CSS, JSON, jQuery

####Простой таск трекер. В системе следующие сущности:
* User (2 роли – Developer и Manager)
* Project
* Task
* Comment

####Manager может:
1. создавать Project
2. создавать Task в рамках проекта
3. добавлять/удалять/редактировать Developer
4. назначать девелоперу task

####Developer может:
1. создавать task в рамках проекта
2. добавлять/удалять/редактировать comment в рамках task
3. менять статус task



> * Если приложение не запускается создайте базу данных с именем "task-tracker-mv" и поменяйте в resources/db-properties.properties >>>> jdbc.mysql.hb2ddl.auto = update на jdbc.mysql.hb2ddl.auto = create, после того как все таблицы автоматически сконфигурируются, поменяйте обратно на update

> * Если у Вас не стоит Tomcat, то можно запустить с помощью плагина мавена tomcat7. С права экрана вкладки
Maven Projects >> Plugins >> tomcat7 >> tomcat7:run-war
