package ma.ensa.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Utilisez un Handler pour retarder le démarrage de l'activité suivante
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                startActivity(intent);
                finish(); // Fermez SplashActivity après avoir démarré ListPizzaActivity
            }
        }, 2000); // Délai de 2000 millisecondes (2 secondes)
    }
}
