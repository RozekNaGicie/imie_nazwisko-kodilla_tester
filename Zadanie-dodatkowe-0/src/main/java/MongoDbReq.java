import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Logger;
import java.util.logging.Level;



public class MongoDbReq {

    String dataBaseName, collectionName;

    public MongoDbReq(String dataBaseName, String collectionName) {

        this.dataBaseName = dataBaseName;
        this.collectionName = collectionName;

    }

    public void gettingData() {

        //Logger switch
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        try {

            //connecting to database
            MongoClient mongo = new MongoClient();
            MongoDatabase database = mongo.getDatabase(this.dataBaseName);
            System.out.println("Mongo connected");

            //getting collection
            MongoCollection<Document> collection = database.getCollection(this.collectionName);
            FindIterable<Document> datab = collection.find();

            for (Document doc : datab) {
                System.out.println(doc);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
