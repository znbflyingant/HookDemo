package znb.hook;

import android.app.Application;
import android.content.Context;

/**
 * 描述:
 * 作者：znb
 * 时间：2021-01-06 14:26
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        try {
//            HookHelper.attachContext();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
