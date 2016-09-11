package id.sch.smktelkom_mlg.tugas01.xirpl5012.pendaftaranles;

import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Nama,Umur;
    Button Daftar;
    TextView Hasil,Hasil2;
    RadioButton rbPr,rbLk;
    CheckBox cBS,cBK,cBSa,cBM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = (EditText) findViewById(R.id.editTextNama);
        Umur = (EditText) findViewById(R.id.editTextUmur);
        Daftar = (Button) findViewById(R.id.buttonDaftar);
        Hasil = (TextView) findViewById(R.id.textViewHasil);
        Hasil2 = (TextView) findViewById(R.id.textViewHasil2);
        rbPr = (RadioButton) findViewById(R.id.radioButtonPr);
        rbLk = (RadioButton) findViewById(R.id.radioButtonLk);
        cBS = (CheckBox) findViewById(R.id.checkBoxS);
        cBK = (CheckBox) findViewById(R.id.checkBoxK);
        cBSa = (CheckBox) findViewById(R.id.checkBoxSa);
        cBM = (CheckBox) findViewById(R.id.checkBoxM);

        Daftar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                doProcess();
                doClick();
         }
        });

    }

    private void doClick() {
        String hasil = null;

        if (rbPr.isChecked())
        {
            hasil = rbPr.getText().toString();
        }

        else if (rbLk.isChecked())
        {
            hasil = rbLk.getText().toString();
        }

        if (hasil == null)
        {
            Hasil2.setText("Belum memilih Jenis Kelamin");
        }

        else
        {
            Hasil2.setText(" dengan jenis kelamin "+hasil);
        }


    }

    private void doProcess() {

        if (isValid())
        {
            String nama = Nama.getText().toString();
            int umur = Integer.parseInt(Umur.getText().toString());
            Hasil.setText(nama+" diterima dengan usia "+umur+" tahun");
        }

    }

    private boolean isValid() {

        boolean valid = true;

        String nama = Nama.getText().toString();
        String umur = Umur.getText().toString();

        if(nama.isEmpty())
        {
            Nama.setError("Nama Belum Diisi");
        valid=false;
        }

        else if(nama.length()<3)
        {
            Nama.setError("Nama Minimal 3 Karakter");
        valid = false;
        }

        else
        {
            Nama.setError(null);
        }

        if(umur.isEmpty())
        {
            Umur.setError("Umur Belum Diisi");
        valid = false;
        }

        else if(umur.length() >13 && umur.length()<25)
        {
            Umur.setError("umur min 14th dan max 24th");
            valid = false;
        }

        else
        {
            Umur.setError(null);
        }
        return valid;
    }
}
