package scouting.sciguy429.com.scoutingapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import scouting.sciguy429.com.scoutingapp.Objects.Match;
import scouting.sciguy429.com.scoutingapp.R;
import scouting.sciguy429.com.scoutingapp.Utilities.H2SQL;

public class MatchViewActivity extends AppCompatActivity {

    TextView matchNumber;
    Button teamR1;
    Button teamR2;
    Button teamR3;
    Button teamB1;
    Button teamB2;
    Button teamB3;
    Button back;
    Match match;

    H2SQL H2SQL = new H2SQL();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_view);

        matchNumber = findViewById(R.id.matchNumber);
        teamR1 = findViewById(R.id.teamR1Button);
        teamR2 = findViewById(R.id.teamR2Button);
        teamR3 = findViewById(R.id.teamR3Button);
        teamB1 = findViewById(R.id.teamB1Button);
        teamB2 = findViewById(R.id.teamB2Button);
        teamB3 = findViewById(R.id.teamB3Button);
        back = findViewById(R.id.back);

        match = H2SQL.getMatch(getIntent().getIntExtra("match", 1));
        matchNumber.setText("Match Number: " + match.matchNumber);
        teamR1.setText("Team 1: " + match.teamR1);
        teamR2.setText("Team 2: " + match.teamR2);
        teamR3.setText("Team 3: " + match.teamR3);
        teamB1.setText("Team 1: " + match.teamB1);
        teamB2.setText("Team 2: " + match.teamB2);
        teamB3.setText("Team 3: " + match.teamB3);

        teamR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MatchEditActivity.class);
                intent.putExtra("match", match.matchNumber);
                intent.putExtra("team", match.teamR1);
                startActivity(intent);
            }
        });
        teamR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MatchEditActivity.class);
                intent.putExtra("match", match.matchNumber);
                intent.putExtra("team", match.teamR2);
                startActivity(intent);
            }
        });
        teamR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MatchEditActivity.class);
                intent.putExtra("match", match.matchNumber);
                intent.putExtra("team", match.teamR3);
                startActivity(intent);
            }
        });

        teamB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MatchEditActivity.class);
                intent.putExtra("match", match.matchNumber);
                intent.putExtra("team", match.teamB1);
                startActivity(intent);
            }
        });
        teamB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MatchEditActivity.class);
                intent.putExtra("match", match.matchNumber);
                intent.putExtra("team", match.teamB2);
                startActivity(intent);
            }
        });
        teamB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MatchEditActivity.class);
                intent.putExtra("match", match.matchNumber);
                intent.putExtra("team", match.teamB3);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
