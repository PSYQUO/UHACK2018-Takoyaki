package ph.edu.dlsu.takoyaki.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.ByteArrayOutputStream;

public class HomeActivity extends AppCompatActivity {

    byte[] byteArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ConstraintLayout eventBanner = (ConstraintLayout) findViewById(R.id.eventBanner);
        ConstraintLayout pointsBanner = (ConstraintLayout) findViewById(R.id.pointsBanner);
        Button rewards = (Button) findViewById(R.id.home_rewardsBtn);
        ImageButton homeCameraBtn = (ImageButton) findViewById(R.id.home_cameraBtn);

        eventBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent ();
                i.setClass (getBaseContext(), EventActivity.class);
                startActivity(i);
            }
        });

        pointsBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent ();
                i.setClass(getBaseContext(), PointsActivity.class);
                startActivity(i);
            }
        });

        rewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), RewardsActivity.class);
                startActivity(i);
            }
        });

        homeCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dispatchTakePictureIntent();
            }
        });

    }

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");

            ByteArrayOutputStream bStream = new ByteArrayOutputStream();
            imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, bStream);
            byte[] byteArray = bStream.toByteArray();

//            new ImageSaver(getBaseContext()).
//                    setFileName("temp.png").
//                    setDirectoryName("images").
//                    save(imageBitmap);

            Intent i  = new Intent ();
            // TODO fix this intent
            i.setClass(getBaseContext(), UploadActivity.class);
            i.putExtra("img_pic", byteArray);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);
            finish ();

//            decodeBarcode();
        }
    }
}
