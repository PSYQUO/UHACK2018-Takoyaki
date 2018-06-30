package ph.edu.dlsu.takoyaki.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import ph.edu.dlsu.takoyaki.myapplication.beans.Users;

public class RegisterActivity extends AppCompatActivity {

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final AutoCompleteTextView registerEmail = (AutoCompleteTextView) findViewById(R.id.register_email);
        final EditText registerPassword = (EditText) findViewById(R.id.register_password);
        final EditText registerPasswordConfirm = (EditText) findViewById(R.id.register_passwordConfirm);
        Button registerBtn = (Button) findViewById(R.id.register_registerBtn);

        databaseReference = FirebaseDatabase.getInstance().getReference();

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println ("HERE");
                String uid = databaseReference.child(Users.NAME).push().getKey();
                String email = registerEmail.getText().toString();
                String password = registerPassword.getText().toString();
                String confirmPassword = registerPasswordConfirm.getText().toString();

                if (password.length() >= 4 && password.equals(confirmPassword)) {
                    // TODO connect to firebase and append this
                    Users u = new Users(uid, email, password, 0, null);
                    databaseReference.child(Users.NAME).child (uid).setValue (u);
                    finish();
                } else {
                    // TODO invalid feedback
                }
            }
        });

    }
}
