package com.example.mysubmissiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUnicorns;
    private ArrayList<Unicorn> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUnicorns = findViewById(R.id.rv_unicorns);
        rvUnicorns.setHasFixedSize(true);

        list.addAll(UnicornData.getListdata());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvUnicorns.setLayoutManager(new LinearLayoutManager(this));
        ListUnicornAdapter listUnicornAdapter = new ListUnicornAdapter(list);
        rvUnicorns.setAdapter(listUnicornAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.btnprofile:
                Intent profileku = new Intent(MainActivity.this, profile.class);
                startActivity(profileku);
                break;
        }
    }
}
