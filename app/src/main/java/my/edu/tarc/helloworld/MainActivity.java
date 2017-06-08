package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//module level variable
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resources class

        setContentView(R.layout.activity_main);
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);

    }
    public void showMessage(View v){
        textViewMessage.setText("Hi my name is HAHAHAHAHHAHAHA");


    }
    public void clearMessage(View v){
        textViewMessage.setText(getString(R.string.app_name));
    }
}
