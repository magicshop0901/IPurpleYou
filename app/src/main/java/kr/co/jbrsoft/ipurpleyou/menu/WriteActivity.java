package kr.co.jbrsoft.ipurpleyou.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.naver.android.helloyako.imagecrop.view.ImageCropView;

import kr.co.jbrsoft.ipurpleyou.R;

public class WriteActivity extends AppCompatActivity {

    ImageCropView imageCropView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        imageCropView.setGridInnerMode(ImageCropView.GRID_ON);
        imageCropView.setGridOuterMode(ImageCropView.GRID_ON);
    }
}
