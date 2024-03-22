# mongo-docker

 start mongodb docker instance
 
docker run -d -p 27019:27017 --name mongo-on-docker -e MONGO_INITDB_ROOT_USERNAME=mongoadmin -e MONGO_INITDB_ROOT_PASSWORD=secret -e MONGO_INITDB_DATABASE=testdb mongo
