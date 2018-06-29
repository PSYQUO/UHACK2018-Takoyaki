package ph.edu.dlsu.takoyaki.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final AutoCompleteTextView registerEmail = (AutoCompleteTextView) findViewById(R.id.register_email);
        final EditText registerPassword = (EditText) findViewById(R.id.register_password);
        final EditText registerPasswordConfirm = (EditText) findViewById(R.id.register_passwordConfirm);
        Button registerBtn = (Button) findViewById(R.id.register_registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = registerEmail.getText().toString();
                String password = registerPassword.getText().toString();
                String confirmPassword = registerPasswordConfirm.getText().toString();

                if (email.contains("@") && password.length() > 6 && password.equals(confirmPassword)) {
                    // TODO connect to firebase and append this

                } else {
                    // TODO invalid feedback
                }
            }
        });

    }
}
