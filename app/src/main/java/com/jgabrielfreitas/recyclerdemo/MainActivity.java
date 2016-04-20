package com.jgabrielfreitas.recyclerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import uk.co.ribot.easyadapter.EasyRecyclerAdapter;

public class MainActivity extends AppCompatActivity implements SingleLineViewHolder.SingleLineTouch{


    RecyclerView recyclerView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);

        recyclerView = (RecyclerView) findViewById(R.id.mainRecyclerView);
    }

    protected void onResume() {
        super.onResume();

        List<String> stringList = new ArrayList<>();
        stringList.add("hue");
        stringList.add("hue2");
        stringList.add("hue3");

        recyclerView.setAdapter(new EasyRecyclerAdapter<>(this,
                                                          SingleLineViewHolder.class,
                                                          stringList,
                                                          this));

    }

    public void onTouch(String string) {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
}
