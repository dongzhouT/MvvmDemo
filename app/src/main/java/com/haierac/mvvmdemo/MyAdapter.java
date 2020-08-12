package com.haierac.mvvmdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.haierac.mvvmdemo.mvvm.UserViewModel;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<User> users;
    UserViewModel userViewModel;

    public MyAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null, false);
        return new MyViewHolder(root);
    }

    public void setUsers(List<User> users) {
        this.users = users;
        notifyDataSetChanged();
    }

    public void setUserViewModel(UserViewModel userViewModel) {
        this.userViewModel = userViewModel;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.setData(users.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userViewModel.changeLike(position, "777");
            }
        });
    }

    @Override
    public int getItemCount() {
        return users == null ? 0 : users.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        TextView tvLike;
        TextView tvContent;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.iv_img);
            tvLike = itemView.findViewById(R.id.tv_like);
            tvContent = itemView.findViewById(R.id.tv_content);
        }

        public void setData(User user) {
            icon.setImageResource(user.getIconId());
            tvLike.setText(user.getLike());
            tvContent.setText(user.getContent());
        }
    }
}
