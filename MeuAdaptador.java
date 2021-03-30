package 0000-0000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class MeuAdaptador extends ArrayAdapter {
    public MeuAdaptador(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(@Nullable Object object) {
        super.add(object);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View minhaView;
        minhaView = convertView;
        EstruturaViews estruturaViews;

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            minhaView = inflater.inflate(R.layout.minha_celula, parent, false);

            estruturaViews = new EstruturaViews();
            estruturaViews.icone = (ImageView) minhaView.findViewById(R.id.meuicone);
            estruturaViews.titulo = (TextView) minhaView.findViewById(R.id.meuTitulo);
            estruturaViews.descricao = (TextView) minhaView.findViewById(R.id.minhaDescricao);

//           estruturaViews.whatsApp = (ImageView) minhaView.findViewById(R.id.imageWhatsApp);

            minhaView.setTag(estruturaViews);
        }
        else {
            estruturaViews = (EstruturaViews) minhaView.getTag();
        }

        EstruturaDados estruturaDados;
        estruturaDados = (EstruturaDados) this.getItem(position);

        estruturaViews.icone.setImageResource(estruturaDados.getIcone());
        estruturaViews.titulo.setText(estruturaDados.getNome());
        estruturaViews.descricao.setText(estruturaDados.getDescricao());



       // estruturaViews.whatsApp.setImageResource(estruturaDados.getLinkWhatsapp());

        return minhaView;

    }
}
