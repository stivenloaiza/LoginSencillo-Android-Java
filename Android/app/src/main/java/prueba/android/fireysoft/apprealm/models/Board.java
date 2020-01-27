package prueba.android.fireysoft.apprealm.models;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;
import prueba.android.fireysoft.apprealm.app.MyApplication;

public class Board extends RealmObject {

    //@required== not null
    @PrimaryKey
    private int id;
    @Required
    private String title;
    @Required
    private Date createdAt;

    private RealmList<Notes> notes;

    public Board() {
    }
    public Board(String title) {
        this.id=MyApplication.boardID.incrementAndGet();
        this.title=title;
        this.createdAt=new Date();
        this.notes=new RealmList<Notes>();
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public RealmList<Notes> getNotes() {
        return notes;
    }

}
