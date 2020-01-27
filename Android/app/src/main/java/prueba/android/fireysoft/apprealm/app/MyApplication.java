package prueba.android.fireysoft.apprealm.app;

import android.app.Application;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;
import prueba.android.fireysoft.apprealm.models.Board;

//Esta clase se ejecuta antes del onCreate del MainActivity
public class MyApplication extends Application {

    public static AtomicInteger boardID= new AtomicInteger();
    public static AtomicInteger noteID = new AtomicInteger();

    @Override
    public void onCreate() {
        setUpRealmConfig();
        Realm realm = Realm.getDefaultInstance();
        boardID= getIdByTable(realm, Board.class);
        noteID= getIdByTable(realm, Board.class);
        realm.close();
        super.onCreate();
    }

    private void setUpRealmConfig()
    {
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(config);
    }

    private <T extends RealmObject> AtomicInteger getIdByTable(Realm realm, Class<T> anyClass){
        RealmResults<T> result = realm.where(anyClass).findAll();
        return (result.size()>0)? new AtomicInteger(result.max("id").intValue()): new AtomicInteger();
    }
}
