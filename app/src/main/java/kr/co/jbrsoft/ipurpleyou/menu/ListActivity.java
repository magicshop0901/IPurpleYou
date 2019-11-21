package kr.co.jbrsoft.ipurpleyou.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

import kr.co.jbrsoft.ipurpleyou.R;

public class ListActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        swipeRefreshLayout = findViewById(R.id.swipe_refresh_layout);
        // 자동스크롤

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {


                swipeRefreshLayout.setRefreshing(false); // 새로고침이 완료되었을 때
            }
        });
    }
}
