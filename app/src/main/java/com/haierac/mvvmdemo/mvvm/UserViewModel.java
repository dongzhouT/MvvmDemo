package com.haierac.mvvmdemo.mvvm;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.haierac.mvvmdemo.R;
import com.haierac.mvvmdemo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 什么是ViewModel
 * 仓库 缓存页面数据
 * ViewModel类让数据可在发生屏幕旋转等配置更改后继续存在，以便于供下一个Activity或fragment使用
 * LiveData
 * 已感知生命周期的方式通知刷新
 */
public class UserViewModel extends ViewModel {
    private static MutableLiveData<List<User>> liveData;
    private ArrayList<User> data;

    public MutableLiveData<List<User>> getDataBean() {
        if (liveData == null) {
            liveData = new MediatorLiveData<>();
            loadData();
        }
        return liveData;
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new User(R.drawable.pic1, "****", "一颗星"));
        data.add(new User(R.drawable.pic2, "****", "一颗星"));
        data.add(new User(R.drawable.pic3, "****", "一颗星"));
        data.add(new User(R.drawable.pic4, "****", "一颗星"));
        data.add(new User(R.drawable.pic5, "****", "一颗星"));
        data.add(new User(R.drawable.pic6, "****", "一颗星"));
        data.add(new User(R.drawable.pic7, "****", "一颗星"));
        data.add(new User(R.drawable.pic8, "****", "一颗星"));
        data.add(new User(R.drawable.pic9, "****", "一颗星"));
        data.add(new User(R.drawable.pic10, "****", "一颗星"));
        data.add(new User(R.drawable.pic11, "****", "一颗星"));
        liveData.setValue(data);
    }

    public void changeLike(int position, String like) {
        List<User> value = liveData.getValue();
        value.get(position).setLike(like);
        liveData.setValue(value);
    }

}
