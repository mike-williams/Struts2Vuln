# Vulnerable Struts2 application

## CVE: 2017-98505 - Apache Struts 2 Rest Plugin RCE

### Requirements

1. Struts 2.5.10 <=
1. Sruts REST plugin
1. Struts Convention plugin
1. A Create item URL exists and can be POSTed to.

Attacker can POST the payload:

``` bash
curl -v -H "Content-Type:application/xml" -X POST -d @cve2017-98505.txt http://192.168.0.104:8080/shapes/1
```
