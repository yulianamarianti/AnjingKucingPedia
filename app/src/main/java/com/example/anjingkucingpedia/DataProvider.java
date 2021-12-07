package com.example.anjingkucingpedia;

import android.content.Context;

import com.example.anjingkucingpedia.model.Hewan;
import com.example.anjingkucingpedia.model.Kucing;
import com.example.anjingkucingpedia.model.Anjing;
import com.example.anjingkucingpedia.model.Ayam;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Ayam> initDataAyam(Context ctx) {
        List<Ayam> ayams = new ArrayList<>();
        ayams.add(new Ayam("Kalkun", "Turki",
                "Ayam yang berasal dari Turki ini berkaki pendek dan ditemukan lebi dari 400 tahun lalu ", R.drawable.img_20211111_wa0046));
        ayams.add(new Ayam("Katek", "Jawa",
                "Ayam Katek pertama kali ditemukan oleh para pedagang Eropa, dimana ayam ini memiliki kaki yang pendek sehingga terlihat mungil sekali ", R.drawable.img_20211111_wa0047));
        ayams.add(new Ayam("Cemani", "Jawa Tengah",
                "Ayam yang sekujur badannya termasuk bulu dan darahnya berwarna hitam. ayam ini terbilang langka namuun peminatnya tak pernah sedikit", R.drawable.img_20211111_wa0048));
        return ayams;
    }

    private static List<Kucing> initDataKucing(Context context) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataAyam(ctx));
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByTipe = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByTipe.add(h);
            }
        }
        return hewansByTipe;
    }
}

