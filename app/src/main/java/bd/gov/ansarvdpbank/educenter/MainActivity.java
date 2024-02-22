package bd.gov.ansarvdpbank.educenter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button10 = findViewById(R.id.btn10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/4mu8qklg75k";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/1DODAo5IKmg";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/UWFA-yqpxXk";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/IJ9iDYlPtnw";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/9HU2VbfAkK4";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/F7Z-XVZCBTs";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/MVKZfn01WHc";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/wsvpTRzXOuk";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/6dpBAuWUrag";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/VsSWLUeo9zs";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);
            }
        });





    }
}