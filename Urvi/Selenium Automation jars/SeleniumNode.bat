java -Dwebdriver.chrome.driver=C:\BrowserExeFiles\chromedriver.exe -Dwebdriver.ie.driver=C:\BrowserExeFiles\IEDriverServer.exe -Dwebdriver.gecko.driver=C:\BrowserExeFiles\geckodriver.exe  -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register -port 5555 -browser browserName=chrome,maxInstances=5,platform=WIN10 -browser browserName="internet explorer",maxInstances=3,platform=WIN10 -browser browserName=firefox,maxInstances=4,platform=WIN10 -browser browserName=safari,maxInstances=2,platform=WIN10