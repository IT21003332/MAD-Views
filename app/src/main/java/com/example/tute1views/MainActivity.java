package com.example.tute1views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tute1views.data.Message;


public class MainActivity extends AppCompatActivity {

    EditText edtMessage;    //Creating Objects in accordance to the real layout
    Button btn;
    Message message;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMessage = findViewById(R.id.entMsg); //Assigning the real layout to the functional objects
        btn =  findViewById(R.id.sbmt);
        message = new Message();
    }

    public void displayMessage(View view){
      //  message.setMessage(edtMessage.getText().toString());    //We get the text and convert to a string
        msg = edtMessage.getText().toString();      //Additional Method to do the same without creating a Message Class
     //   Toast.makeText(this,message.getMessage(),Toast.LENGTH_LONG).show();
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}