package ph.edu.dlsu.takoyaki.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import ph.edu.dlsu.takoyaki.myapplication.service.ImageSaver;

public class UploadActivity extends AppCompatActivity {

    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        byte[] byteArray = getIntent().getByteArrayExtra("img_pic");
        bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        decodeBarcode();
        LinearLayout ln = (LinearLayout) this.findViewById(R.id.LinearLayout_upload);
        View view;

        //If fail or not
        String s = decodeBarcode();
        if(s != null) {
            view = getLayoutInflater().inflate(R.layout.upload_success, null);
            TextView txtView = (TextView) view.findViewById(R.id.upload_points);
            txtView.setText(s.split("\\n")[1]);
        }else{
            view = getLayoutInflater().inflate(R.layout.upload_fail, null);
        }

        ln.addView(view);

        //when screen is clicked will go back to the homeactivity
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent ();
                // TODO fix this intent
                i.setClass(getBaseContext(), HomeActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                finish ();
            }
        });
    }

    private String decodeBarcode(){
        String out = null;
        try {
//            Bitmap bitmap = new ImageSaver(getBaseContext()).
//                    setFileName("temp.png").
//                    setDirectoryName("images").
//                    load();

            Drawable drawable = new BitmapDrawable(getResources(), bitmap);

            ImageView myImageView = (ImageView) findViewById(R.id.img_view_barcode);
//            Bitmap myBitmap = BitmapFactory.decodeResource(
//                    getApplicationContext().getResources(),
//                    R.drawable.drawable);
            myImageView.setImageBitmap(bitmap);

            BarcodeDetector detector =
                    new BarcodeDetector.Builder(getApplicationContext())
                            .setBarcodeFormats(Barcode.DATA_MATRIX | Barcode.QR_CODE)
                            .build();
            if(!detector.isOperational()){
//                    txtView.setText("Could not set up the detector!");
                return out;
            }

            Frame frame = new Frame.Builder().setBitmap(bitmap).build();
            SparseArray<Barcode> barcodes = null;
            barcodes = detector.detect(frame);

            Barcode thisCode = barcodes.valueAt(0);
//            TextView txtView = (TextView) findViewById(R.id.upload_points);
            out = thisCode.rawValue;
//            String[] temp = thisCode.rawValue.split("\\n");
//            txtView.setText(temp[1]);
        }
        catch(ArrayIndexOutOfBoundsException exception) {
//            TextView txtView = (TextView) findViewById(R.id.txtContent);
//            txtView.setText("TRY AGAIN BITCH!!!!");
            return out;
        }

        return out;
    };

}
