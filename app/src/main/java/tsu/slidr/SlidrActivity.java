package tsu.slidr;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrConfig;
import com.r0adkll.slidr.model.SlidrListener;
import com.r0adkll.slidr.model.SlidrPosition;

import static tsu.slidr.R.*;

public class SlidrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_slidr);

//        SlidrConfig config = new SlidrConfig.Builder()
//                .primaryColor(getResources().getColor(color.primary))
//                .secondaryColor(getResources().getColor(color.secondary))
//                .position(SlidrPosition.LEFT)
//                .sensitivity(1f)
//                .scrimColor(Color.BLACK)
//                .scrimStartAlpha(0.8f)
//                .scrimEndAlpha(0f)
//                .velocityThreshold(2400)
//                .distanceThreshold(0.25f)
//                .edge(true | false)
//                .edgeSize(0.18f) // The % of the screen that counts as the edge, default 18%
////                                .listener(new SlidrListener(){...})
//                .build();
//
//        Slidr.attach(this, config);

        int primary = getResources().getColor(R.color.primary);
        int secondary = getResources().getColor(R.color.secondary);
        Slidr.attach(this, primary, secondary).unlock();
    }
}
