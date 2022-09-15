# OpenTelemetry 1.18.0 SpringBoot demo

Start the application and call the endpoint: http://localhost:8080/greeting?who=foobar

All 3 spans work as expected

* webmvc
* `@WithSpan`
* `RestTemplate`

```
'HTTP GET' : de60633c9fb75dd821ff64b26f4af6c1 feaabdb41c03d63c CLIENT [tracer: io.opentelemetry.spring-web-3.1:1.18.0-alpha] AttributesMap{data={http.url=https://postman-echo.com/get, http.method=GET, http.request_content_length=0, http.status_code=200, net.transport=ip_tcp, net.peer.name=postman-echo.com, http.response_content_length=364}, capacity=128, totalAddedValues=7}
'GreetingServiceImpl.greeting' : de60633c9fb75dd821ff64b26f4af6c1 7f55d3bd267ecc85 INTERNAL [tracer: io.opentelemetry.spring-boot-autoconfigure:] AttributesMap{data={who=foobar, code.namespace=dev.mcor.springotlplab.GreetingServiceImpl, code.function=greeting}, capacity=128, totalAddedValues=3}
'/greeting' : de60633c9fb75dd821ff64b26f4af6c1 3c7d4213eef40b03 SERVER [tracer: io.opentelemetry.spring-webmvc-5.3:1.18.0-alpha] AttributesMap{data={net.sock.peer.port=60294, http.host=localhost:8080, net.host.name=localhost, net.transport=ip_tcp, http.status_code=200, http.response_content_length=364, http.target=/greeting?who=foobar, net.sock.peer.addr=0:0:0:0:0:0:0:1, http.flavor=1.1, net.host.port=8080, http.method=GET, http.scheme=http, net.sock.host.addr=0:0:0:0:0:0:0:1, http.user_agent=HTTPie/3.2.1, http.route=/greeting}, capacity=128, totalAddedValues=15}
```
