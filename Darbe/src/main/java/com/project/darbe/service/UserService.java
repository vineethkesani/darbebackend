package com.project.darbe.service;

import java.io.IOException;
import org.bson.BsonBinarySubType;
import org.bson.Document;
import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.project.darbe.connection.MongoConnection;
import com.project.darbe.model.User;
import static com.mongodb.client.model.Filters.eq;

@Service
public class UserService {
	
	
	MongoConnection connection;
	
	public String saveuser(User user) throws IOException {	
		if(connection==null) {
			connection = new MongoConnection();
		}
		MongoDatabase db = connection.getDatabase("UserDatabase");
		MongoCollection<User> userCollection = db.getCollection("UserDetails",User.class);
		// user.setProfilepicture(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
		System.out.println(user);
		userCollection.insertOne(user);
		System.out.println("User inserted");
		return null;
		}
	

	
	public User getUserbyusername(String id) {
		if(connection==null) {
			connection = new MongoConnection();
		}
		MongoDatabase db = connection.getDatabase("Darbe");
		MongoCollection<User> userCollection = db.getCollection("UserDetails", User.class);
		System.out.println("in Service class" + id);
//		FindIterable<Document> retrieveduser = userCollection.find(eq("_id",new ObjectId(id)));
//		MongoCursor<Document> cursor = retrieveduser.iterator();
		User retrievedUser = userCollection.find(eq("email",id)).first();
		return retrievedUser;
	}
	
	public Boolean uniqueusername(String enteredUsername) {
		if(connection==null) {
			connection = new MongoConnection();
		}
		MongoDatabase db = connection.getDatabase("Darbe");
		MongoCollection<User> userCollection = db.getCollection("UserDetails", User.class);
		User forUserName = userCollection.find(eq("username",enteredUsername)).first();
		if(forUserName==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
