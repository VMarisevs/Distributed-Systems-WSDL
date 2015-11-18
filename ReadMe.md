### Before running
> - edit classpath.bat, so instead of "U:\Java\TomCat\webapps\" Your's TomCat folder
> Set enviroment variables:
> - CATALINA_HOME  U:\Java\TomCat


### Run
> - Open cmd.exe
> - cd into this project directory
> - run classpath.bat
> *starting TomCat*
> - %CATALINA_HOME%\bin\startup.bat
> *Creating WSDL file in Distributed-Systems-WSDL\bin folder*
> - cd bin
> - java org.apache.axis.wsdl.Java2WSDL -o calculator.wsdl -n http://www.gmit.ie/ws -l http://127.0.0.1:8080/axis/services/Calculator ie.gmit.sw.Calculator
> *Copy calculator.wsdl into source folder *
> *Generate Stubs from the WSDL Description*
> - cd ..\src
> - java org.apache.axis.wsdl.WSDL2Java -o ./ -p ie.gmit.sw -s calculator.wsdl
>
> *Refresh eclipse project and add libraries*
> *all .jar files from U:\Java\TomCat\webapps\axis\WEB-INF\lib\ *
> - edit CalculatorSoapBindingImpl.java
>
> *Generate library for axis. in Distributed-Systems-WSDL\bin*
> - cd ..\bin
> - jar -cf calc.jar *
> - copy this file into U:\Java\TomCat\webapps\axis\WEB-INF\lib\
> - java org.apache.axis.client.AdminClient ie/gmit/sw/deploy.wsdd
>
> *check* http://localhost:8080/axis/servlet/AxisServlet
> - if you have an error
> - %CATALINA_HOME%\bin\shutdown.bat
> - %CATALINA_HOME%\bin\startup.bat
>
> *check* http://localhost:8080/axis/servlet/AxisServlet
> *You should see Calculator (wsdl) there* 
> uncomment and compile CalcClient in Eclipse