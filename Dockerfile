FROM ubuntu:latest
LABEL authors="noah"

ENTRYPOINT ["top", "-b"]