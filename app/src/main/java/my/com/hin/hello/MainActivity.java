package my.com.hin.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textViewMsg;
private TextView clearMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() = main() function
        super.onCreate(savedInstanceState);
        //display UI
        //R = resources
        //layout = folder
        setContentView(R.layout.activity_main);

        ////TextView is a class like double float int
        //// textViewMsg is an instance
        //TextView textViewMsg;

        //Link UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
        clearMsg= findViewById(R.id.clearMsg);


        //textViewMsg.setText("Helllo, Hin");


    }

    public void showMessage(View view){
        textViewMsg.setText("Hello, <your name here>");
    }
    public void clearMessage(View view){
        clearMsg.setText("");
    }
}
