package 0000-0000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class EstruturaSegundaTela extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ImageView icone = findViewById(R.id.iconee);

        TextView descricao = findViewById(R.id.descricaoo);
        TextView dicas = findViewById(R.id.dicass);

        ImageView whatsApp = findViewById(R.id.imageWhatsApp);

        Bundle extras = getIntent().getExtras();

        if(extras != null){

            String descId = extras.getString("descricao");
            String dicasId = extras.getString("dicas");
            int iconeId = extras.getInt("icone");

            final String whatsId = extras.getString("whatsApp");

            //Toast.makeText(EstruturaSegundaTela.this, whatsId, Toast.LENGTH_LONG).show();

            icone.setImageResource(iconeId);
            descricao.setText(descId);
            dicas.setText(dicasId);

            whatsApp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

//                    Toast.makeText(EstruturaSegundaTela.this, "Entrei no ONclick" + whatsId, Toast.LENGTH_LONG).show();

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse((whatsId))));
                }
            });
        }
    }
}
