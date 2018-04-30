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