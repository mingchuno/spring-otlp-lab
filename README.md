# OpenTelemetry 1.17.0 SpringBoot demo

Start the application and call the endpoint: http://localhost:8080/greeting?who=foobar

Only 2 spans work as expected

* webmvc
* `@WithSpan` **Not Working**
* `RestTemplate`

```
'HTTP GET' : 13a3c70993604584729869c3c8b2734b 03e575df16e0a1b1 CLIENT [tracer: io.opentelemetry.spring-web-3.1:1.17.0-alpha] AttributesMap{data={http.request_content_length=0, net.transport=ip_tcp, net.peer.name=postman-echo.com, http.method=GET, http.status_code=200, http.url=https://postman-echo.com/get, http.response_content_length=364}, capacity=128, totalAddedValues=7}
'/greeting' : 13a3c70993604584729869c3c8b2734b ab6eb64ae3a983e4 SERVER [tracer: io.opentelemetry.spring-webmvc-3.1:] AttributesMap{data={http.target=/greeting?who=asad, net.sock.peer.addr=0:0:0:0:0:0:0:1, http.route=/greeting, http.user_agent=HTTPie/3.2.1, http.flavor=1.1, net.transport=ip_tcp, net.sock.peer.port=53697, http.method=GET, http.scheme=http, http.host=localhost:8080, http.status_code=200, http.response_content_length=364}, capacity=128, totalAddedValues=12}
```
