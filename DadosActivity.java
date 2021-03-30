package 0000-0000;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class DadosActivity extends AppCompatActivity {

    String[] listaWhatsapp = {
            "https://wa.me/55840000-0000?text=Olá,%20gostaria%20de%20um%20orçamento%20pelo%20APP%20Serviços%20indicados%20RN...",
            "https://wa.me/55840000-0000?text=Olá,%20gostaria%20de%20um%20orçamento%20pelo%20APP%20Serviços%20indicados%20RN...",
            "https://wa.me/55840000-0000?text=Olá,%20gostaria%20de%20um%20orçamento%20pelo%20APP%20Serviços%20indicados%20RN...",
            "https://wa.me/55840000-0000?text=Olá,%20gostaria%20de%20um%20orçamento%20pelo%20APP%20Serviços%20indicados%20RN...",
            "https://wa.me/55840000-0000?text=Olá,%20gostaria%20de%20um%20orçamento%20pelo%20APP%20Serviços%20indicados%20RN...",
            "https://wa.me/55840000-0000?text=Olá,%20gostaria%20de%20um%20orçamento%20pelo%20APP%20Serviços%20indicados%20RN...",
            "https://wa.me/55840000-0000?text=Olá,%20gostaria%20de%20um%20orçamento%20pelo%20APP%20Serviços%20indicados%20RN..."
            //   "https://wa.me/5584988375683?text=Olá,%20gostaria%20de%20um%20orçamento%20pelo%20APP%20Serviços%20indicados%20RN...",
            // "https://wa.me/5584988375683?text=Olá,%20gostaria%20de%20um%20orçamento%20pelo%20APP%20Serviços%20indicados%20RN..."
    };

    String[] listaNomes = {

            "Celular - Conserto",

            "Construção e projetos",

            "Eletricista",

            "Encanador",

            "Frete de mudança",

            "Guincho ou reboque",

            "Móveis planejados"

            //"Chaveiro"

//            "Quem somos?",
//
//            "Quero indicar alguém :)"

    };

    int[] listaIcones = {R.drawable.celular, R.drawable.projetos, R.drawable.eletri, R.drawable.enc_transp, R.drawable.frete, R.drawable.reboque, R.drawable.moveis_planejados, R.drawable.quemsomos, R.drawable.chat8};

    String[] listaDescricoes = {

            "",
            "",
            "",
            "",
            "",
            "",
            //"",
            ""

//            "",
//
//            ""
    };

    String[] listaDicas = {

            "Conserto de tela de celular.\n" +
                    "\n" +
                    "Profissional: Rafael (Rafa Cell)\n" +
                    "Telefone: 0000-0000\n",
            /*                  "\n" +
                              "Comentários dos clientes:\n" +
                              "\n" +
                              "Positivo: \n" +
                              "- \"Peças originais, garantia de 90 dias e ótimo atendimento. O melhor preço que encontrei e a qualidade é surpreendente. O local é de fácil acesso, próximo as lojas C&A Riachuelo do centro de Natal-RN.\"\n" +
                              "\n" +
                              "Negativo: \n" +
                              "- Nenhum comentário até o momento.",
          */
            "Construções, reformas, regularizações e projetos complementares.\n\n" +
                    "Profissional: Fabrício Dutra.\n" +
                    "Telefone: 0000-0000",

            "Serviços de eletricidade residencial e predial:\n\n" +
                    "- Comandos elétricos e refrigeração; \n" +
                    "- Projetos elétricos;\n" +
                    "- Balanceamento de cargas; e\n" +
                    "- Tudo com baixa e média tensão.\n\n" +
                    "Profissional: Jerônimo.\n" +
                    "Orçamento grátis: 0000-0000\n",
/*                    "\n" +
                    "Comentários dos clientes:\n" +
                    "\n" +
                    "Positivos: \n" +
                    "- \"Serviços dentro do padrão e preço justo.\"; \n" +
                    "- \"Excelente profissional\";\n" +
                    "- \"Muito técnico. Realmente conhece o que faz. Está sempre buscando se aperfeiçoar.\"\n" +
                    "\n" +
                    "Negativos: \n" +
                    "- \"Às vezes os seus serviços demoram mais do que o esperado mais tudo fica bem feito.\"\n" +
                    "- \"Nenhum.\"\n" +
                    "- \"Um pouco lento. Talvez, porque executa o trabalho com segurança.\"",
*/
            "Mais de 12 anos de experiência  resolvendo problemas de encanamentos em residências (casa ou apartamento) e comércio em geral.\n\n" +
                    "Profissional: Genilson\n" +
                    "Orçamento grátis: 0000-0000\n",

//            "Comentários dos clientes:\n" +
//                "\n",
/*                    "Positivos: \n" +
                    "- \"Ótimo! Ele resolveu um problema bem díficil no encanamento da cozinha.\n" +
                    "\n" +
                    "Negativo: \n" +
                    "- Nenhum comentário até o momento.",

*/

            "Mudanças na região com veículo fechado,\n estilo baú.\n\n" +
                    "Profissional: Sueldes.\n" +
                    "Orçamento grátis: 0000-0000\n",
/*                    "\n" +
                    "Comentários dos clientes:\n" +
                    "\n" +
                    "Positivo: \n" +
                    "- \"Trabalha bem. É cuidadoso, embala bem os pertences evitando arranhar no transporte.\"\n" +
                    "\n" +
                    "Negativo: \n" +
                    "- Nenhum comentário até o momento.",

*/
            "Transporte de automóveis variados com ou sem problemas mecânicos.\n\n" +
                    "Profissional: João Maria.\n" +
                    "Orçamento grátis: 0000-0000\n",

            /*"\n" +
                    "Comentários dos clientes:\n" +
                    "\n" +
                    "Positivo: \n" +
                    "- \"Utilizei bastante em nossa oficina. Indico a todos os clientes que entram em contato buscando um guincho de confiança.\" \n" +
                    "\n" +
                    "Negativo: \n" +
                    "- Nenhum comentário até o momento.",
*/
            "Venda de móveis planejados para casa, apartamento e comércio.\n\n" +
                    "Profissional: Bezerra.\n" +
                    "Orçamento grátis: 0000-0000\n" +
                    "\n"
    };

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sembotoes);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //   Toast.makeText(DadosActivity.this, "Entrou na main de Dados", Toast.LENGTH_SHORT).show();

        ListView minhaLista = findViewById(R.id.minhaLista);

        final MeuAdaptador meuAdaptador;
        meuAdaptador = new MeuAdaptador(getApplicationContext(), R.layout.minha_celula);

        int i = 0;
        for (String nome : listaNomes) {
            EstruturaDados estruturaDados;
            estruturaDados = new EstruturaDados(listaIcones[i], nome, listaDescricoes[i], listaDicas[i], listaWhatsapp[i]);
            meuAdaptador.add(estruturaDados);
            i++;
        }

        minhaLista.setAdapter(meuAdaptador);

        minhaLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(DesparamentacaoActivity.this, "" + listaNomes[position], Toast.LENGTH_SHORT).show();

                final EstruturaDados estruturaDados;
                estruturaDados = (EstruturaDados) meuAdaptador.getItem(position);

                Intent intent = new Intent(DadosActivity.this, EstruturaSegundaTela.class);

                intent.putExtra("icone", estruturaDados.getIcone());
                intent.putExtra("descricao", estruturaDados.getNome());
                intent.putExtra("dicas", estruturaDados.getDicas());

                intent.putExtra("whatsApp", estruturaDados.getLinkWhatsapp());



                startActivity(intent);
            }
        });
    }
}