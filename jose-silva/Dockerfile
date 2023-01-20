FROM ubuntu
LABEL maintainer="Jose Silva"
RUN apt-get update
RUN apt-get install wget -y
RUN wget https://download.oracle.com/java/19/latest/jdk-19_linux-x64_bin.deb
RUN apt-get -qqy install ./jdk-19_linux-x64_bin.deb
RUN update-alternatives --install /usr/bin/java java /usr/lib/jvm/jdk-19/bin/java 1919
EXPOSE 8085


