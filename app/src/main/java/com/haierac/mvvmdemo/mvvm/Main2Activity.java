package com.haierac.mvvmdemo.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.haierac.mvvmdemo.MyAdapter;
import com.haierac.mvvmdemo.R;
import com.haierac.mvvmdemo.User;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    RecyclerView rv;
    MyAdapter mAdapter;
    List<User> users;
    UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLifecycle().addObserver(new MyLifrcycleObserver(this, new ICallback() {
            @Override
            public void startService() {
                // TODO: 2020/8/12 刷新
            }
        }));
        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        userViewModel.getDataBean().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                mAdapter.setUsers(users);
            }
        });
        initRv();
    }

    private void initRv() {
        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyAdapter(userViewModel.getDataBean().getValue());
        mAdapter.setUserViewModel(userViewModel);
        rv.setAdapter(mAdapter);
    }
}
