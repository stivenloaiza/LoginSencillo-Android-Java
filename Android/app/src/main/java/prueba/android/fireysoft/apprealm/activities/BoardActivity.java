package prueba.android.fireysoft.apprealm.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import prueba.android.fireysoft.apprealm.R;

public class BoardActivity extends AppCompatActivity {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        fab=(FloatingActionButton) findViewById(R.id.fAdd);
    }
}
