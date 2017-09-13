# Vulnerable Struts2 application

## CVE: 2017-98505 - Apache Struts 2 Rest Plugin RCE

### Requirements

1. Maven (https://maven.apache.org)
1. Struts 2.5.10 <=
1. Struts REST plugin
1. Struts Convention plugin
1. A Create item URL exists and can be POSTed to. For example 

### Getting Started

1. The application / server can be started with the following maven command: `mvn jetty:run`.
1. The `payload.txt` file contains the XML payload to POST to the vulnerable app / REST interface.
1. Line 17 of the `payload.txt` file can be updated to run any command. It is currently set to powershell.exe (Windows).

Attacker can POST the payload:

``` bash
curl -v -H "Content-Type:application/xml" -X POST -d @payload.txt http://localhost:8080/shapes/1
```
