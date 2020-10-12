package com.example.pokemonteam;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class MainActivity extends AppCompatActivity {


    public MainActivity() {
    }

    private EditText num1;
    private Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.etTeam);
        add = (Button)findViewById(R.id.form);
        result = (TextView)findViewById(R.id.team);

        Random rand = new Random();
        final String[] Pokemon = new String[]{"Bulbasaur", "Charmander", "Pikachu", "Squirtle",
                "Cyndaquil", "Tododile", "Chikorita","Torchic","Treecko","Mudkip"};

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());

          List<String> stringList = Arrays.asList(Pokemon);
          Collections.shuffle(stringList);
          stringList.toArray(Pokemon);


          int begin = 0;
          int end = number1;

          String[] subArray = Arrays.copyOfRange(Pokemon, begin, end);



            result.setText("Your Team is: " + Arrays.toString(subArray));


            }
        });
    }

}
