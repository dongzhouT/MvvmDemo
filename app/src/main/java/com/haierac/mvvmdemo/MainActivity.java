package com.haierac.mvvmdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    MyAdapter mAdapter;
    List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRv();
//        ViewModelProvider provider=
    }

    private void initRv() {
        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyAdapter(getData());
        rv.setAdapter(mAdapter);
    }

    private List<User> getData() {
        users = new ArrayList<>();
        users.add(new User(R.drawable.pic1, "****", "一颗星"));
        users.add(new User(R.drawable.pic2, "****", "一颗星"));
        users.add(new User(R.drawable.pic3, "****", "一颗星"));
        users.add(new User(R.drawable.pic4, "****", "一颗星"));
        users.add(new User(R.drawable.pic5, "****", "一颗星"));
        users.add(new User(R.drawable.pic6, "****", "一颗星"));
        users.add(new User(R.drawable.pic7, "****", "一颗星"));
        users.add(new User(R.drawable.pic8, "****", "一颗星"));
        users.add(new User(R.drawable.pic9, "****", "一颗星"));
        users.add(new User(R.drawable.pic10, "****", "一颗星"));
        users.add(new User(R.drawable.pic11, "****", "一颗星"));
        return users;
    }
}
