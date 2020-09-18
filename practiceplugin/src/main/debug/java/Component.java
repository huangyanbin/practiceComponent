package com.app.jianguyu.jiangxidangjian.cc.upgrade;




import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Gravity;

import com.app.jianguyu.jiangxidangjian.cc.upgrade.bean.BuildInfo;
import com.app.jianguyu.jiangxidangjian.cc.upgrade.block.AppContext;
import com.app.jianguyu.jiangxidangjian.cc.upgrade.update.UpgradePresenter;
import com.app.jianguyu.jiangxidangjian.common.ComponentConstant;
import com.app.jianguyu.jiangxidangjian.views.dialog.BPCenterDialog;
import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.IComponent;
import com.github.moduth.blockcanary.BlockCanary;
import com.jxrs.component.base.BaseActivity;
import com.jxrs.component.constant.ParamConfig;
import com.jxrs.component.eventTask.await.Await;
import com.jxrs.component.eventTask.await.FailData;
import com.jxrs.component.utils.ToastUtils;

import static com.app.jianguyu.jiangxidangjian.views.dialog.BPCenterDialog.DOUBLE_BTN_WITH_TITLE;

/**
 * 组件之间通信
 */
public class Component implements IComponent {

    @Override
    public String getName() {
        return "{{pluginName}}";
    }

    @Override
    public boolean onCall(CC cc) {
        String actionName = cc.getActionName();
        switch (actionName) {
           //Todo 请在这里实现相应的通信
        }
        return false;
    }


}
