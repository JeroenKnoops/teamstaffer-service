FROM digilabs/oracle-java:8u101-b13
MAINTAINER PPF

USER root

RUN apt-get update && \
    apt-get install net-tools curl jq -y && \
    rm -rf /var/lib/apt/lists/*

USER java

EXPOSE 8080

COPY staffMember-service.jar /app/service.jar
COPY start.sh /app/start.sh
ENTRYPOINT ["/app/start.sh"]
