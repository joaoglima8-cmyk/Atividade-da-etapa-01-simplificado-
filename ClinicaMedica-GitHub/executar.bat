@echo off
setlocal
cd /d "%~dp0"

echo ==============================================
echo   CLINICA MEDICA - SPRING BOOT - ETAPA 2
echo ==============================================
echo.

where java >nul 2>nul
if errorlevel 1 (
  echo ERRO: Java nao foi encontrado no computador.
  echo Instale Java 17 ou superior e tente novamente.
  pause
  exit /b 1
)

where mvn >nul 2>nul
if not errorlevel 1 (
  echo Maven encontrado. Iniciando o sistema...
  call mvn spring-boot:run
  goto :fim
)

set MAVEN_VERSION=3.9.16
set MAVEN_DIR=%TEMP%\clinica-medica-maven\apache-maven-%MAVEN_VERSION%
set MAVEN_ZIP=%TEMP%\clinica-medica-maven\apache-maven-%MAVEN_VERSION%-bin.zip

if exist "%MAVEN_DIR%\bin\mvn.cmd" goto :run_local_maven

if not exist "%TEMP%\clinica-medica-maven" mkdir "%TEMP%\clinica-medica-maven"
echo Maven nao esta instalado. Baixando Maven %MAVEN_VERSION% automaticamente...
powershell -NoProfile -ExecutionPolicy Bypass -Command "Invoke-WebRequest -Uri 'https://dlcdn.apache.org/maven/maven-3/%MAVEN_VERSION%/binaries/apache-maven-%MAVEN_VERSION%-bin.zip' -OutFile '%MAVEN_ZIP%'"
if errorlevel 1 (
  echo ERRO: nao foi possivel baixar o Maven.
  echo Instale o Maven manualmente ou verifique sua conexao com a internet.
  pause
  exit /b 1
)

powershell -NoProfile -ExecutionPolicy Bypass -Command "Expand-Archive -Path '%MAVEN_ZIP%' -DestinationPath '%TEMP%\clinica-medica-maven' -Force"
if errorlevel 1 (
  echo ERRO: nao foi possivel extrair o Maven.
  pause
  exit /b 1
)

:run_local_maven
call "%MAVEN_DIR%\bin\mvn.cmd" spring-boot:run

:fim
if errorlevel 1 (
  echo.
  echo O sistema foi encerrado com erro. Veja a mensagem acima.
  pause
) else (
  echo.
  echo Sistema encerrado.
)
endlocal
