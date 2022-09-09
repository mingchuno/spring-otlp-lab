# OpenTelemetry 1.16.0 SpringBoot demo

Start the application and call the endpoint: http://localhost:8080/greeting?who=foobar

All 3 spans work as expected

* webmvc
* `@WithSpan`
* `RestTemplate`

```
'HTTP GET' : b42aef6f76a3d32f6ff643b0a241a78f dd06996a769edb50 CLIENT [tracer: io.opentelemetry.spring-web-3.1:1.16.0-alpha] AttributesMap{data={http.status_code=200, net.transport=ip_tcp, net.peer.name=postman-echo.com, http.method=GET, http.url=https://postman-echo.com/get}, capacity=128, totalAddedValues=5}
'GreetingServiceImpl.greeting' : b42aef6f76a3d32f6ff643b0a241a78f e996adfc1ad6ffa0 INTERNAL [tracer: io.opentelemetry.spring-boot-autoconfigure:] AttributesMap{data={who=foobar}, capacity=128, totalAddedValues=1}
'HTTP GET' : b42aef6f76a3d32f6ff643b0a241a78f 84106892c8c2a042 SERVER [tracer: io.opentelemetry.spring-webmvc-3.1:1.16.0-alpha] AttributesMap{data={http.target=/greeting?who=foobar, http.status_code=200, http.user_agent=HTTPie/3.2.1, http.flavor=HTTP/1.1, net.transport=ip_tcp, net.peer.port=53763, http.method=GET, net.peer.ip=0:0:0:0:0:0:0:1, http.scheme=http, http.host=localhost:8080}, capacity=128, totalAddedValues=10}
```
