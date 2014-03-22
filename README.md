Java_Web
========

Barebone Java Web Application built with 'best practices', extremely useful for kickstarting academic mini projects.

Features
----
* Designed with MVC (Model View Controller) Architecture.
* Complies with 'Standards' and 'best practices' used for building Java Web Applications.
* Built with JSP, Servlets and Plain Java Classes.
* Built to be deployed on Apache Tomcat 7 (tested on the same)
* Tomcat Connection Pooling for Database connectivity.
* Session management with servlets.
* Use of JSTL (JSP Standard Tag Library).
* Includes frontend input validation with plain JavaScript.
* Integrated with Twitter Bootstrap 3.1.1 (UI Framework).
* Consice documentation for better understanding.


Version
----

1.0



Getting Started
--------------

1. Clone this repository OR 'Download Zip'
2. Start Netbeans 7.3+, Menu -> File -> New Project -> Java Web -> Web Application with Existing Sources... Complete this wizard.
3. Create Database (MySQL 5.6+) using (project folder/db_schema/java_web.sql)
4. Check out the servlet mapping in Deployement Descriptor (project folder/web/WEB-INF/web.xml )
5. Check out database connection pool in (project folder/web/META-INF/context.xml )
6. This project is built with MVC architecture with Servlets acting as Controllers and a seperate Data Model.
You can find them in  (project folder/src/java/controllers ) and  (project folder/src/java/models )
7. You can figure out rest of the things by inspecting the code.
Good luck! :-)
