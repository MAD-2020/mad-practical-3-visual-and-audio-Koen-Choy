package sg.edu.np.connect.week3practical;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView view = findViewById(R.id.videoView);
        view.setVideoURI(
                Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid) );
        view.start();
        MediaPlayer media = MediaPlayer.create(this, R.raw.baby_laughing);
        media.start();
//once done with the playback
        media.release();
        media = null;



    }

}
