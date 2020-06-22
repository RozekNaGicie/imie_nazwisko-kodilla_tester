cd build/libs
del *.jar
cd ../..
cd project
del *.jar
cd ..
call gradle build
IF EXIST "C:\Users\Mateusz\Desktop\kodilla\kodilla-intro\build\libs\kodilla-intro-1.0-SNAPSHOT.jar" (
copy C:\Users\Mateusz\Desktop\kodilla\kodilla-intro\build\libs\kodilla-intro-1.0-SNAPSHOT.jar C:\Users\Mateusz\Desktop\kodilla\kodilla-intro\project
) else (
echo Blad kompilacji
)