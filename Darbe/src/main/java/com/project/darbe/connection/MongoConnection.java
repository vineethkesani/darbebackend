package com.project.darbe.connection;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {
	
	MongoClient mongoClientConnection;
	
	public MongoConnection() {
		initializeConnection();
	}
	
	public void  initializeConnection(){
//		ConnectionString connString = new ConnectionString(
//    		    "mongodb+srv://vineeth:vineeth27@sandbox.jxah6.mongodb.net/<darbe>?retryWrites=true&w=majority");
//				
		ConnectionString connString = new ConnectionString(
    		    "mongodb+srv://<usernam>:<Password>@darbe.boiop.mongodb.net/UserDatabase?retryWrites=true&w=majority");
				
		
		CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
    	
        MongoClientSettings settings = MongoClientSettings.builder()
    		.applyConnectionString(connString)
    		.codecRegistry(codecRegistry)
    		.retryWrites(true)
    		.build();
    	mongoClientConnection = MongoClients.create(settings);
    		
	}
	
	public MongoClient getDatabaseConnection() {
		return mongoClientConnection;
	}
	
	public MongoDatabase getDatabase(String dbName) {
		return mongoClientConnection.getDatabase(dbName);
	}
	
//	public MongoCollection<Document> getCollection(String dbName, String collectionName){
//		MongoDatabase db = mongoClientConnection.getDatabase(dbName);
//		return db.getCollection(collectionName);
//	}

}
