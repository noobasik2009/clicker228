package com.example.projectnoobic228;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private Button buttonClicker;
    private TextView textVeiwSum;
    private TextView textVeiwPrize;
    private long sum;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        textVeiwSum = findViewById(R.id.text_view_sum);
        textVeiwPrize = findViewById(R.id.text_view_prize);
        buttonClicker = findViewById(R.id.button_click);
        sum = 0;

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum++;
                textVeiwSum.setText(String.valueOf(sum));
                switch((int) sum){
                    case 10:
                        textVeiwPrize.setText("LOX");
                        break;
                    case 20:
                        textVeiwPrize.setText("Ну такое");
                        break;
                    case 30:
                        textVeiwPrize.setText("ХАРОШ");
                        break;
                    case 200:
                        textVeiwPrize.setText("ЭТО БАРСЕЛОНА");
                        break;
                    case 400:
                        textVeiwPrize.setText("ЭТО КОМАНДА МОЖЕТ ВСЕ!");
                }
            }
        };
        buttonClicker.setOnClickListener(listener);
    }
}