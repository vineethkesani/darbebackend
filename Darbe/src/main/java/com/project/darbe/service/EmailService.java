package com.project.darbe.service;

import java.io.IOException;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.stereotype.Service;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.project.darbe.connection.MongoConnection;
import com.project.darbe.model.SubscribeEmail;
import com.project.darbe.model.User;

@Service
public class EmailService {
	
	MongoConnection connection;
	
	public String subscribeEmail(String subscribeEmail) throws IOException {	
		if(connection==null) {
			connection = new MongoConnection();
		}
		
		return null;
	}
	
	public String  unSunscribeEmail(SubscribeEmail emailID) throws IOException{
		if(connection==null) {
			connection = new MongoConnection();
		}
		
		MongoDatabase db = connection.getDatabase("DarbeDatabase");
		MongoCollection<SubscribeEmail> emailCollection = db.getCollection("EmailList", SubscribeEmail.class);
		// user.setProfilepicture(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
		System.out.println("emailID::::::::::::::: "+ emailID);
		Bson filter = eq("email", emailID.getEmail());
		emailCollection.deleteOne(filter);
		return null;
	}

}
