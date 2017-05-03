package us.koller.cameraroll.jobservices;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import us.koller.cameraroll.ui.MainActivity;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MediaJobService extends JobService {

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d("MediaJobService", "onStartJob() called");

        MainActivity.refreshMediaWhenVisible = true;

        jobFinished(jobParameters, false);
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
