package ypx.com.demoshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.sharesdk.onekeyshare.OnekeyShare;
import ypx.com.demoshare.utlis.ShareUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void onClick(View view){
            ShareUtil.showShare(
                    this,
                    "分享标题",
                    "我是烟花泪",
                    "http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1606/27/c0/23438803_1467039297963_800x600.jpg",
                    "https://www.baidu.com"
                    );

        }


}
