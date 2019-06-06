package ml.w568w.checkxposed;

import android.app.Application;
import android.util.Log;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by w568w on 18-6-23.
 *
 * @author w568w
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Application","onCreate");
        CrashReport.initCrashReport(getApplicationContext(), "3a78258328", false);
    }
}
