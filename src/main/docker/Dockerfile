#这个是因该是容器所在服务器的host和port
#FROM host:port/envimages/ubuntu14.04_jdk1.8_fonts:1.0.0

#FROM ubuntu:latest
#ENV file=my-Jpa-Join.jar
#ENV runEnv=dev
#ENV port=8888
#ENV bind=0.0.0.0
#MAINTAINER yangbiao
#ADD ${file} /root/.jenkins/workspace/my-test-demo/target

#WORKDIR /xxx
#ENV host=localhost
#ENV eureka=localhost:8899
#CMD java -jar ./${file} --spring.profiles.active=${runEnv} --eureka.instance.hostname=${host} --server.port=${port} --server.address=${bind} --eureka.client.serviceUrl.defaultZone=http://${eureka}/eureka/
#CMD java -jar /root/.jenkins/workspace/my-test-demo/target/${file} --spring.profiles.active=${runEnv} --server.port=${port} --server.address=${bind}


FROM ubuntu:latest
ADD my-Jpa-Join.jar app.jar
EXPOSE 8888
MAINTAINER yangbiao
ENTRYPOINT ["java","-jar","/app.jar"]












