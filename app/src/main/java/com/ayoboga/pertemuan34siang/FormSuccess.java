package com.ayoboga.pertemuan34siang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FormSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_success);

        String strNama = getIntent().getStringExtra("VAR_NAMA");
        String strNIK = getIntent().getStringExtra("VAR_NIK");
        String strJK = getIntent().getStringExtra("VAR_JK");
        String strDate = getIntent().getStringExtra("VAR_DATE");
        String strAlamat = getIntent().getStringExtra("VAR_ALAMAT");
        String strEmail = getIntent().getStringExtra("VAR_EMAIL");



        TextView lblNama = (TextView) findViewById(R.id.nama_success);
        TextView lblNIK = (TextView) findViewById(R.id.nik_success);
        TextView lblJK = (TextView) findViewById(R.id.jk_success);
        TextView lblTgl = (TextView) findViewById(R.id.tgl_success);
        TextView lblAlamat = (TextView) findViewById(R.id.alamat_success);
        TextView lblEmail = (TextView) findViewById(R.id.email_success);

        lblNama.setText("Hi, " + strNama + "!");
        lblNIK.setText("NIK kamu, " + strNIK + ",");
        lblJK.setText("Dengan Jenis Kelamin " + strJK + ",");
        lblTgl.setText("Dan Tanggal Lahir, " + strDate + ",");
        lblEmail.setText("Kamu Telah terdaftar Vaksinasi dengan email ini,\n" + strEmail);
        lblAlamat.setText("Vaksinasi akan berada di daerah alamat,\n" + strAlamat);
    }


}