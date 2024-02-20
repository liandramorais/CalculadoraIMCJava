package com.example.projetocalculadoraimc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.projetocalculadoraimc.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView imc;
    private TextView classificacao;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    //COMECA AQUI

    imc = findViewById(R.id.output_calculo);

    classificacao = findViewById(R.id.output_classifica);

        Button botaoCalculo = findViewById(R.id.btn_calculo);
        botaoCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular ();
            }


            private void calcular () {

            }




        });




    }
}