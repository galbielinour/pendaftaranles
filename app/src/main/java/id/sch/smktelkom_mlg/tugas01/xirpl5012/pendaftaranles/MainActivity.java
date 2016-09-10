package id.sch.smktelkom_mlg.tugas01.xirpl5012.pendaftaranles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Nama,Umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = (EditText) findViewById(R.id.editTextNama);
        Umur = (EditText) findViewById(R.id.editTextUmur);
    }
}
