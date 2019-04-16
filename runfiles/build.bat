@echo off
cd .
"C:/Program Files (x86)/Java/jdk1.8.0_101/bin/javac.exe" -cp lib/clientlibs.jar; -deprecation -d bin -sourcepath src src/*.java
pause
