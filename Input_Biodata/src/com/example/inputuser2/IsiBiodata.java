package com.example.inputuser2;

import android.app.*;
import android.os.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class IsiBiodata extends Activity {
	EditText input_nama, input_nis, input_kelas, input_umur, input_alamat;
	Button simpan;
	TextView hasil_nama, hasil_nis, hasil_kelas, hasil_umur, hasil_alamat;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isi_biodata);
        
        input_nama = (EditText)findViewById(R.id.input_nama);
        input_nis = (EditText)findViewById(R.id.input_nis);
        input_kelas = (EditText)findViewById(R.id.input_kelas);
        input_umur = (EditText)findViewById(R.id.input_umur);
        input_alamat = (EditText)findViewById(R.id.input_alamat);
        
        hasil_nama = (TextView)findViewById(R.id.hasil_nama);
        hasil_nis = (TextView)findViewById(R.id.hasil_nis);
        hasil_kelas = (TextView)findViewById(R.id.hasil_kelas);
        hasil_umur = (TextView)findViewById(R.id.hasil_umur);
        hasil_alamat = (TextView)findViewById(R.id.hasil_alamat);
        
        simpan = (Button)findViewById(R.id.simpan_button);
        simpan.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String nama = input_nama.getText().toString();
				String nis = input_nis.getText().toString();
				String kelas = input_kelas.getText().toString();
				String umur = input_umur.getText().toString();
				String alamat = input_alamat.getText().toString();
				
				hasil_nama.setText(nama);
				hasil_nis.setText(nis);
				hasil_kelas.setText(kelas);
				hasil_umur.setText(umur);
				hasil_alamat.setText(alamat);
			}
		});
    }
}