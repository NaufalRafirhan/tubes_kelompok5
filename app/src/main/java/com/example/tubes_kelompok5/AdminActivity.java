package com.example.tubes_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminActivity extends AppCompatActivity {
    public String KEY_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }
    public void TambahT(View arg0){
        Intent intent = new Intent(AdminActivity.this, TambahTagihanActivity.class);
        startActivity(intent);
    }
    public void DeleteUser(View arg0){
        Intent intent = new Intent(AdminActivity.this,DeleteUserActivity.class);
        startActivity(intent);
    }
    public void Logout(View arg0){
        Intent intent = new Intent(AdminActivity.this,LoginActivity.class);
        intent.putStringArrayListExtra("KEY_NAME", null);
        startActivity(intent);
    }
}