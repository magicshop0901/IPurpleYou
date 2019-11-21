package kr.co.jbrsoft.ipurpleyou.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import kr.co.jbrsoft.ipurpleyou.R;

public class MenuActivity extends AppCompatActivity {

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv = findViewById(R.id.bnv);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // 원래는 보통 아이템을 클릭할 때마다 Fragment를 변경하는 것이 일반적임
                switch (item.getItemId()) {
                    case R.id.bnv_main:
                        findViewById(R.id.layout_content).setBackgroundColor(Color.RED);
                        break;

                    case R.id.bnv_discover:
                        findViewById(R.id.layout_content).setBackgroundColor(Color.BLUE);
                        break;

                    case R.id.bnv_my:
                        findViewById(R.id.layout_content).setBackgroundColor(Color.YELLOW);
                        break;

                    case R.id.bnv_notifications:
                        findViewById(R.id.layout_content).setBackgroundColor(Color.BLACK);
                        break;
                }

                // 리턴값이 true가 아니면 동작하지 않음
                return true;
            }
        });
    }
}
