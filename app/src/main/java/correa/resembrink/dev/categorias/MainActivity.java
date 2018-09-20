package correa.resembrink.dev.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   EditText idnombre, idapellido, fechaid, emailid;
   Button btnRegistrar,btnRanking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idnombre=findViewById(R.id.nombreID);
        idapellido=findViewById(R.id.apellidosID);
        fechaid=findViewById(R.id.fechaID);
        emailid=findViewById(R.id.emailID);

        btnRanking=findViewById(R.id.rankingID);
        btnRegistrar=findViewById(R.id.btnRegistrar);

        btnRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent= new Intent(MainActivity.this, RankingActivity.class);
                startActivity(intent);
                finish();


            }
        });




    }
}
