package debug;


import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import {{fullName}}.R;
import com.app.jianguyu.jiangxidangjian.cc.testplugin.R;
import com.jxrs.component.base.BaseActivity;

/**
 * 组件默认测试入口类
 */
public class TestActivity extends BaseActivity {


    @Override
    public int setLayoutID() {
        return R.layout.activity_test;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        TextView tv = findViewById(R.id.tvTitle);
        tv.setText("欢迎通过远程下载加载{{pluginName}}组件");
    }
}
