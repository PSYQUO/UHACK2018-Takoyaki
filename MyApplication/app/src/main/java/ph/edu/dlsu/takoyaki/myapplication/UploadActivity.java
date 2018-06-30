package ph.edu.dlsu.takoyaki.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ImageView;

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
    }

    private void decodeBarcode(){
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
                return;
            }

            Frame frame = new Frame.Builder().setBitmap(bitmap).build();
            SparseArray<Barcode> barcodes = null;
            barcodes = detector.detect(frame);

            Barcode thisCode = barcodes.valueAt(0);
//            TextView txtView = (TextView) findViewById(R.id.txtContent);
//            txtView.setText(thisCode.rawValue);
        }
        catch(ArrayIndexOutOfBoundsException exception) {
//            TextView txtView = (TextView) findViewById(R.id.txtContent);
//            txtView.setText("TRY AGAIN BITCH!!!!");
        }
    };

}
