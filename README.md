# producer-service

http://localhost:8761/ - Eureka Server
	
	Instances currently registered with Eureka
Application	AMIs	Availability Zones	Status
CONSUMER-SERVICE	n/a (1)	(1)	UP (1) - Admin-PC:consumer-service:8080
PRODUCER-SERVICE	n/a (2)	(2)	UP (2) - Admin-PC:producer-service:8084 , Admin-PC:producer-service:8082
General Info
Name	Value
total-avail-memory	166mb
num-of-cpus	4
current-memory-usage	89mb (53%)
server-uptime	01:21
registered-replicas	http://localhost:8761/eureka/
unavailable-replicas	http://localhost:8761/eureka/,
available-replicas	


http://localhost:8082/message

	Hello from Producer on port:8082
	
http://localhost:8084/message

	Hello from Producer on port:8084
	
http://localhost:8080/message
	
	Alternatively it will come based on load
	Hello from Producer on port:8082
	Hello from Producer on port:8084
