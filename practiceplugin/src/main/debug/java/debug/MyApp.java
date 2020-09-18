package debug;


import android.app.Application;
 {{importARouterClass}}
import {{fullName}}.BuildConfig;
import com.billy.cc.core.component.CC;
import {{component}};


/**
 *
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            CC.enableVerboseLog(true);
            CC.enableDebug(true);
        }
        {{ARouterInit}}
        Component.init(this, Component.FULL_VERSION,"dev",true, "{{pluginName}}");

    }



}
