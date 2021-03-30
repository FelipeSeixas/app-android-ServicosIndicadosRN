package 0000-0000;

import android.content.Intent;
import android.net.Uri;

class EstruturaDados {
    private int icone;
    private String nome;
    private String descricao;
    private String dicas;

    private String linkWhatsapp;

//    public EstruturaDados(int icone, String nome, String descricao) {
//        this.icone = icone;
//        this.nome = nome;
//        this.descricao = descricao;
//    }

    public EstruturaDados(int icone, String nome, String descricao, String dicas, String linkWhatsapp) {
        this.icone = icone;
        this.nome = nome;
        this.descricao = descricao;
        this.dicas = dicas;

        this.linkWhatsapp = linkWhatsapp;
    }

    public int getIcone() {
        return icone;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDicas() {return dicas;}

    public String getLinkWhatsapp() {return linkWhatsapp;}

    public String conversarWhatsApp(){return getLinkWhatsapp();}
}
