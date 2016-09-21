package com.example.a076766.clrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    private MyAdapter mAdapter;

    List<String> displayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recyclerview);

        displayList.add(
                "This is a really long string that I want to wrap to the next line and again and "
                        + "let's keeping going to get to another line and then to another line "
                        + "and then to another line past that to get to another line and then to "
                        + "another line and then to another line past that -- end");

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyAdapter(displayList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
