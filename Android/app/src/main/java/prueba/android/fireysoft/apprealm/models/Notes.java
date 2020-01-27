package prueba.android.fireysoft.apprealm.models;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;
import prueba.android.fireysoft.apprealm.app.MyApplication;

public class Notes extends RealmObject{

    //@required== not null
    @PrimaryKey
    private int id;
    @Required
    private String description;
    @Required
    private Date createdAt;

   //Constructor vacio explicito que requiere realm
    public Notes()
    {

    }
    //Constructor
    public Notes(String description)
    {
        this.id=MyApplication.noteID.incrementAndGet();
        this.description=description;
        this.createdAt=new Date();
    }

    //Setters and Getters
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
}
