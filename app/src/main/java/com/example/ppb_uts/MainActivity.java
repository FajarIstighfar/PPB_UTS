package com.example.ppb_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHoliday;
    private ArrayList<Holi> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHoliday = findViewById(R.id.rv_holiday);
        rvHoliday.setHasFixedSize(true);
        list.addAll(HolidayData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvHoliday.setLayoutManager(new LinearLayoutManager(this));
        ListHoliAdapter listHoliAdapter = new ListHoliAdapter(list);
        rvHoliday.setAdapter(listHoliAdapter);

        listHoliAdapter.setOnItemClickCallback(new ListHoliAdapter.OnItemClickCallback() {

            @Override
            public void onItemClicked(Holi data) {
                showSelectedHero(data);
            }
        });


    }

    private void showSelectedHero(Holi holi) {
        Toast.makeText(this, "Kamu memilih " + holi.getName(), Toast.LENGTH_SHORT).show();
    }
}
