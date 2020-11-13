package com.example.dialogbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.Toast;
import android.content.DialogInterface;


public class KotakDialog extends Activity implements OnClickListener {
	Button pesanToast;
	Button tampilList;
	Button keluar;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kotak_dialog);
		
		pesanToast = (Button)findViewById(R.id.toastBtn);
		pesanToast.setOnClickListener(this);
		
		tampilList = (Button)findViewById(R.id.listDialogBtn);
		tampilList.setOnClickListener(this);
		
		keluar = (Button)findViewById(R.id.keluarBtn);
		keluar.setOnClickListener(this);
	}
	

	@Override
	public void onClick(View clicked) {
		// TODO Auto-generated method stub
		switch (clicked.getId()){
		case R.id.listDialogBtn:
			munculListDialog();
			break;
		case R.id.toastBtn:
			Toast.makeText(this, "Anda Memilih Toast", 
			Toast.LENGTH_SHORT) .show();
			break;
		case R.id.keluarBtn:
			keluar();
			break;
		}
	}
	
	private void munculListDialog() {
		// TODO Auto-generated method stub
		final CharSequence[] items = {"Es Jeruk","Es Teh","Soft Drink","Lemon Squash"};
		AlertDialog.Builder kk = new AlertDialog.Builder(this);
		kk.setTitle("Pilih Minuman");
		kk.setItems(items, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int item) {
				// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), items[item], 
			Toast.LENGTH_SHORT) .show();
			}
		}).show();
	}


	private void keluar() {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Apakah anda ingin keluar?")
			.setCancelable(false)
			.setPositiveButton("Ya", new
					DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int id) {
							// TODO Auto-generated method stub
							KotakDialog.this.finish();
						}
					})
			.setNegativeButton("Tidak", new
					DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int arg) {
							// TODO Auto-generated method stub
							dialog.cancel();
						}
					}).show();
	}
}
