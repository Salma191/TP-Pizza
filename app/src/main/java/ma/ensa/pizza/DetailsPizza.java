package ma.ensa.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;





public class DetailsPizza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Active le bouton de retour en arrière
//
//        toolbar.setNavigationOnClickListener(v -> onBackPressed()); // Gère le clic sur le bouton de retour en arrière


        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String pizzaName = intent.getStringExtra("pizzaName");
        int pizzaPhoto = intent.getIntExtra("pizzaPhoto", 0); // Assuming it's an integer resource ID
        String pizzaDuration = intent.getStringExtra("pizzaDuration");
        String pizzaDescription = intent.getStringExtra("pizzaDescription");
        String pizzaIngredients = intent.getStringExtra("pizzaIngredients");
        String pizzaPreparation = intent.getStringExtra("pizzaPreparation");

        // Find TextViews and ImageView in the layout
        TextView nameTextView = findViewById(R.id.nom);
        ImageView photoImageView = findViewById(R.id.photo);
        TextView descriptionTextView = findViewById(R.id.desc);
        TextView ingredientsTextView = findViewById(R.id.ingred);
        TextView preparationTextView = findViewById(R.id.prepa);

        // Update TextViews and ImageView with pizza information
        nameTextView.setText(pizzaName);
        photoImageView.setImageResource(pizzaPhoto);
        descriptionTextView.setText("Description: " + pizzaDescription);
        ingredientsTextView.setText("Ingredients: " + pizzaIngredients);
        preparationTextView.setText("Preparation: " + pizzaPreparation);
    }
}