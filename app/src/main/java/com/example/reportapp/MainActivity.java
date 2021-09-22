package com.example.reportapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        RecyclerView mRecycleView = (RecyclerView) findViewById(R.id.report_rcv);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));

        final List<ReportCardModel> reportCardList = new ArrayList<>();
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "English", 75, "C"));
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "Arab", 85, "B"));
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "France", 67, "C"));
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "Spanish", 45, "D"));
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "Portugis", 78, "B"));
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "chines", 90, "A"));
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "Korean", 89, "B"));
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "Thai", 45, "D"));
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "Malay", 34, "E"));
        reportCardList.add(new ReportCardModel(
                R.mipmap.ic_launcher, "Urdu", 20, "E"));

        mRecycleView.setAdapter(new ReportCardAdapter(reportCardList));
        mRecycleView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, reportCardList.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        }));



    }
}