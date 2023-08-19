package com.example.space;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView postListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postListView = findViewById(R.id.lv);
        List<List_item> listItems = generateSamplePosts();
        MyAdapter adapter = new MyAdapter(this,listItems );
        postListView.setAdapter(adapter);
    }



    private List<List_item> generateSamplePosts() {
        List<List_item> posts = new ArrayList<>();
        posts.add(new List_item(R.drawable.night_city,R.drawable.heart,R.drawable.comment,R.drawable.send,R.drawable.saveinstagram,"1 likes","16,0886 comments"));

        // Add more posts here
        return posts;
    }
}