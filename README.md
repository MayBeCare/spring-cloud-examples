# spring-cloud-examples

## 1. spring-cloud-eureka-producer-consumer:<br>
   &emsp;&emsp;spring-cloud 注册中心Eureka，服务提供与调用(Feign和Ribbon两种方式)，熔断器Hystrix(只是作用在服务调用端)的使用<br>
## 2. spring-cloud-hystrix-dashboard-turbine:<br>
   &emsp;&emsp;①单个应用的熔断监控Hystrix Dashboard<br>
   &emsp;&emsp;&emsp;(spring-cloud-eureka，spring-cloud-producer，spring-cloud-consumer-hystrix-dashboard)<br>
   &emsp;&emsp;②集群下hystrix的监控turbine<br>
   &emsp;&emsp;&emsp;(spring-cloud-eureka，spring-cloud-producer，hystrix-feign-turbine，hystrix-ribbon-turbine，hystrix-dashboard-turbine)<br>
## 3. spring-cloud-config-git:<br>
   &emsp;&emsp;spring-cloud配置中心git示例和refesh(配置文件信息更改时，服务端不需要修改，可正常显示，客户端需执行post请求http://客户端的IP:port/refresh)<br>
## 4.spring-cloud-config-eureka:<br>
   &emsp;&emsp;将server端当做一个服务注册到eureka中，client端去eureka中去获取配置中心server端的服务既可，达到了高可用的目的<br>
## 5.spring-cloud-config-eureka-bus:<br>
   &emsp;&emsp;spring-cloud消息总线(使用RabbitMQ)，实现刷新服务端实现客户端的刷新，服务端修改时，发送post请求(/bus/refresh)实现客户端的全部刷新；局部刷新时，发送post请求(/bus/refresh?destination=ApplicationContext ID，默认情况下，ApplicationContext ID是spring.application.name:server.port)，以上的请求都用服务端的IP和port发送<br>
## 6.spring-cloud-zuul-gateway:<br>
   &emsp;&emsp;①spring-cloud服务网关zuul，分别启动eureka，producer，producer2，zuul；其中pruducer和producer2只是端口不同，为的是测试zuul成功调用了producer服务并且做了均衡负载。但是如果后端服务多达十几个的时候，每一个都这样配置也挺麻烦的，默认情况下，Zuul会代理所有注册到Eureka Server的微服务，并且Zuul的路由规则如下：http://ZUUL_HOST:ZUUL_PORT/微服务在Eureka上的serviceId/**会被转发到serviceId对应的微服务，此时路由不需要配置<br>
   &emsp;&emsp;②在zuul里面添加自定义的ZuulFilter，并在启动类里注入，实现请求的过滤<br>
   &emsp;&emsp;③在zuul里面添加自定义的RequestFallBack，实现Zuul回退机制处理器<br>
## 7.spring-cloud-sleuth-zipkin:<br>
   &emsp;&emsp;使用Spring Cloud Sleuth和Zipkin进行分布式链路跟踪，Zipkin 是一个开放源代码分布式的跟踪系统，由Twitter公司开源。每个服务向zipkin报告计时数据，zipkin会根据调用关系通过Zipkin UI生成依赖关系图，显示了多少跟踪请求通过每个服务，该系统让开发者可通过一个 Web 前端轻松的收集和分析数据，例如用户每次请求服务的处理时间等，可方便的监测系统中存在的瓶颈。