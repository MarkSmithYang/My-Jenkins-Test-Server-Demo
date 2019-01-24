#这个是因该是容器所在服务器的host和port
#FROM host:port/envimages/ubuntu14.04_jdk1.8_fonts:1.0.0

#FROM ubuntu:latest
#ENV file=my-Jpa-Join.jar
#ENV runEnv=dev
#ENV port=8888
#ENV bind=0.0.0.0
#MAINTAINER yangbiao
#ADD ${file} /root/.jenkins/workspace/my-test-demo/target

#ENV host=localhost
#ENV eureka=localhost:8899
#CMD java -jar ./${file} --spring.profiles.active=${runEnv} --eureka.instance.hostname=${host} --server.port=${port} --server.address=${bind} --eureka.client.serviceUrl.defaultZone=http://${eureka}/eureka/
#CMD java -jar /root/.jenkins/workspace/my-test-demo/target/${file} --spring.profiles.active=${runEnv} --server.port=${port} --server.address=${bind}


FROM my_ubuntu1:latest
#相当于 cd
COPY /root/.jenkins/workspace/my-test-demo/src/main/docker/ /opt/
ADD my-Jpa-Join.jar .
WORKDIR /opt
#docker build -t yangbiao/demo /这个就是Dockerfile所在目录
EXPOSE 8888
MAINTAINER yangbiao
ENTRYPOINT ["java","-jar","/app.jar"]












