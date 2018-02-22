package mx.edu.utng.dloza.reviewimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next1 (View view){
        Intent intent= new Intent(MainActivity.this,ReviewActivity.class);
        startActivity(intent);
    }

    public void next2 (View view){
        Intent intent= new Intent(MainActivity.this,ReviewActivity2.class);
        startActivity(intent);
    }

    public void back (View view){
        finish();
    }


}
