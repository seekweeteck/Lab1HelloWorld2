package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global or Module Level variable
    EditText editTextName, editTextAge;
    TextView textViewMessage;

    //onCreate = main function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display the main UI
        //R = resource class
        setContentView(R.layout.activity_main);

        //Link UI to program variable
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }

    public void displayMessage(View view){
        String name;
        int age;
        //Get user input from the EditText
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());
        age++;
        textViewMessage.setText("Hi " + name +
                " you will be "  + age + " in 2018.");
    }

    public void resetInput(View view){
        editTextAge.setText("");
        editTextName.setText("");
        textViewMessage.setText("Hello World");
    }
}
