package com.example.fuzzyacaratv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityhasil extends AppCompatActivity {
    //ini khusus fuzzy
    float a1,a2,a3,a4;
    float budaya,buses;
    float butses, busses, eduren, edumen, edutin;
    float edukatif, hiburan, hises, hitses, hisses;
    int i,b=19,g=8;
    float kualitasbagus, kualitasjelek;
    float rules1, rules2, rules3, rules4, rules5, rules6, rules7, rules8;
    float rules9,rules10,rules11, rules12, rules13, rules14, rules15, rules16, rules17, rules18, rules19,rules20,rules21,rules22,rules23,rules24,rules25,rules26,rules27;
    //--------sampai sini khusus fuzzy-----------

    //---AWAL KHUSUS APPS NYA----------------
    EditText boxhiburan,boxedukatif,boxbudaya;
    Button btnoutput;
    TextView txthiburan,txtedukatif,txtbudaya;
    //---khusus Hasil------
    TextView hbutses,hbuses,hbss,hhs,hhts,hhss,here,heme,heti,hr1,hr2,hr3,hr4,hr5,hr6,hr7,hr8,hr9,hr10,hr11,hr12,hr13,hr14,hr15,hr16,hr17,hr18,hr19,hr20,hr21,hr22,hr23,hr24,hr25,hr26,hr27,hdefuz;    //---------------------
    //----khusus Print------
    TextView bts,bss,bs;
    //----------------------
    float hasilbudaya,hasilhiburan,hasiledukatif,hasil;
    float hasilbutses,hasilbuses,hasilbusses,hasileduren,hasiledumen,hasiledutin,hasilhises,hasilhitses,hasilhisses;

    //---SAMPAI SINI APPS NYA----------------.
    float budaya_tidaksesuai(){
        if (budaya < 45 ) {
            butses = 1; }
        else if (budaya >=45 && budaya < 55){ butses = (55 - budaya) / 10;}
        else if (budaya >= 55)  { butses = 0; }
        return butses;}

    float budaya_sesuai(){
        if (budaya < 50 ) { buses = 0;}
        else if (budaya >= 50 && budaya < 60){ buses = (budaya - 50) / 10;}
        else if (budaya >= 60 && budaya < 70){ buses = (70 - budaya) / 10;}
        else if (budaya >= 70) { buses = 0;}
        return buses;}

    float budaya_sangatsesuai(){
        if (budaya < 65 ) { busses = 0;}
        else if (budaya >= 65 && budaya < 75){ busses = (budaya - 65) / 10;}
        else if (budaya >= 75) { busses = 1;}
        return busses;}
    //nilai EDUKATIFF
    float edukatif_rendah(){
        if (edukatif < 46 ) {eduren = 1;}
        else if (edukatif >=46 && edukatif < 56){eduren = (56 -edukatif) / 10;}
        else if (edukatif >= 56) {eduren = 0; }
        return eduren;}

    float edukatif_menengah(){
        if (edukatif < 51 ) {edumen = 0;}
        else if (edukatif >=51 && edukatif < 61){ edumen = (edukatif - 51) / 10;}
        else if (edukatif >=61 && edukatif < 71){ edumen = (71 - edukatif) / 10;}
        else if (edukatif >=71) {edumen = 0;}
        return edumen;}

    float edukatif_tinggi(){
        if (edukatif < 66 ) {edutin = 0;}
        else if (edukatif >= 66 && edukatif < 76){ edutin = (edukatif - 66) / 10;}
        else if (edukatif >= 76) {edutin = 1;}
        return edutin;}
    //hiburanNNNN
    float hiburan_tidaksehat(){
        if (hiburan < 45 ) {hitses = 1;}
        else if (hiburan >=45 && hiburan < 55){hitses = (55 - hiburan) / 10;}
        else if (hiburan >= 55) {hitses = 0; }
        return hitses;}

    float hiburan_sehat(){
        if (hiburan <50 ) {hises = 0;}
        else if (hiburan >=50 && hiburan < 60){ hises = (hiburan - 50) / 10;}
        else if (hiburan >= 60 && hiburan < 70){ hises = (70 - hiburan) / 10;}
        else if (hiburan >= 70) {hises = 0;}
        return hises;}

    float hiburan_sangatsehat(){
        if (hiburan < 65 ) {hisses = 0;}
        else if (hiburan >= 65 && hiburan < 75){ hisses = (hiburan - 65) / 10;}
        else if (hiburan >= 75) {hisses = 1;}
        return hisses;}


    public void fuzzyfikasi(){
        budaya_tidaksesuai();
        budaya_sesuai();
        budaya_sangatsesuai();

        edukatif_rendah();
        edukatif_menengah();
        edukatif_tinggi();

        hiburan_tidaksehat();
        hiburan_sehat();
        hiburan_sangatsehat();
    }
//nilai minimum AND
    float nk(float a, float b,float c){
        if(a<=b && a<=c){
            return a;
        }
        else if(b<=c && b<=a){
            return b;
        }
        else{
            return c;
        }
    }


    void rule(){
        fuzzyfikasi();
//If hiburan tidak sehat and budaya tidak-sesuai and edukatif sedikit then acara tidak berkualitas
        rules1 = nk (hitses, butses,eduren);

//If hiburan tidak sehat and budaya tidak-sesuai and edukatif sedang then acara tidak berkualitas
        rules2 = nk (hitses, butses,edumen);

//If hiburan tidak sehat and budaya tidak-sesuai and edukatif banyak then acara tidak berkualitas
        rules3 = nk(hitses, butses,edutin);

//If hiburan tidak sehat and budaya sesuai and edukatif sedikit then acara tidak berkualitas
        rules4 = nk(hitses, buses,eduren);

//If hiburan tidak sehat and budaya sesuai and edukatif sedang then acara tidak berkualitas
        rules5 = nk(hitses, buses,edumen);

//If hiburan tidak sehat and budaya sesuai and edukatif banyak then acara tidak berkualitas
        rules6 = nk(hitses, buses,edutin);

//If hiburan tidak sehat and budaya sangat sesuai and edukatif sedikit then acara tidak berkualitas
        rules7 = nk(hitses, busses,eduren);

//If hiburan tidak sehat and budaya sangat sesuai and edukatif sedang then acara tidak berkualitas
        rules8 = nk(hitses, busses,edumen);

//If hiburan tidak sehat and budaya sangat sesuai and edukatif banyak then acara tidak berkualitas
        rules9 = nk(hitses, busses,edutin);

//If hiburan sangat sehat and budaya tidak-sesuai and edukatif sedikit then acara tidak berkualitas
        rules10=nk(hisses, butses,eduren);

//If hiburan sangat sehat and budaya tidak-sesuai and edukatif sedang then acara tidak berkualitas
        rules11=nk(hisses, butses,edumen);

//If hiburan sangat sehat and budaya tidak-sesuai and edukatif banyak then acara tidak berkualitas
        rules12=nk(hisses, butses,edutin);

//If hiburan sangat sehat and budaya sesuai and edukatif sedikit then acara tidak berkualitas
        rules13=nk(hisses, buses,eduren);

//If hiburan sangat sehat and budaya sesuai and edukatif sedang then acara  berkualitas !!
        rules14=nk(hisses, buses,edumen);

////If hiburan sangat sehat and budaya sesuai and edukatif banyak then acara berkualitas !!
        rules15=nk(hisses, buses,edutin);

//If hiburan sangat sehat and budaya sangat sesuai and edukatif sedikit then acara tidak berkualitas
        rules16=nk(hisses, busses,eduren);

//If hiburan sangat sehat and budaya sangat sesuai and edukatif sedang then  acara berkualitas !!
        rules17=nk(hisses, busses,edumen);

        //If hiburan sangat sehat and budaya sangat sesuai and edukatif banyak then  acara berkualitas !!
        rules18=nk(hisses, busses,edutin);

//If hiburan sehat and budaya tidak sesuai and edukatif sedikit then  acara tidak berkualitas
        rules19=nk(hises, butses,eduren);

//If hiburan sehat and budaya tidak sesuai and edukatif sedang then  acara tidak berkualitas
        rules20=nk(hises, butses,edumen);

//If hiburan sehat and budaya tidak sesuai and edukatif banyak then  acara tidak berkualitas
        rules21=nk(hises, butses,edutin);

//If hiburan sehat and budaya sesuai and edukatif sedikit then  acara tidak berkualitas
        rules22=nk(hises, buses,eduren);

//If hiburan sehat and budaya sesuai and edukatif sedang then  acara berkualitas !!
        rules23=nk(hises, buses,edumen);

//If hiburan sehat and budaya sesuai and edukatif banyak then  acara  acara berkualitas !!
        rules24=nk(hises, buses,edutin);

//If hiburan sehat and budaya sangat sesuai and edukatif sedikit then acara tidak berkualitas
        rules25=nk(hises, busses,eduren);

//If hiburan sehat and budaya sangat sesuai and edukatif sedang then acara berkualitas !!
        rules26=nk(hises, busses,edumen);

//If hiburan sehat and budaya sangat sesuai and edukatif banyak then acara berkualitas !!
        rules27=nk(hises, busses,edutin);
//INFERENSI
        float[] gquality={rules14,rules15,rules17,rules18,rules23,rules24,rules26,rules27};
        for(i=1;i<g;++i)
        {
            if(gquality[0]<gquality[i])
                gquality[0] = gquality[i];
        }
        kualitasbagus=gquality[0];

        float[] bquality={rules1,rules2,rules3,rules4,rules5,rules6,rules7,rules8,rules9,rules10,rules11,rules12,rules13,rules16,rules19,rules20,rules21,rules22,rules25};

        for(i = 1;i < b; ++i)
        {
            // Change < to > if you want to find the smallest element
            if(bquality[0] < bquality[i])
                bquality[0] = bquality[i];
        }
        kualitasjelek=bquality[0];
    }

    float defuzyfikasi(){
        rule();
        float Ab= kualitasbagus*(60+70+80+90+100);
        float bagiAa=kualitasjelek*5;
        float bagiAb=kualitasbagus*5;
        float Aa = (kualitasjelek*10+20+30+40+50);
        float hasil=(Ab+Aa)/(bagiAa+bagiAb);
        return hasil;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityhasil);
        btnoutput=(Button)findViewById(R.id.btnoutput);
        txtbudaya=(TextView)findViewById(R.id.txtbudaya);
        txtedukatif=(TextView)findViewById(R.id.txtedukatif);
        txthiburan=(TextView)findViewById(R.id.txthiburan);

        boxbudaya=(EditText)findViewById(R.id.boxbudaya);
        boxedukatif=(EditText)findViewById(R.id.boxedukatif);
        boxhiburan=(EditText)findViewById(R.id.boxhiburan);

        //-======Teks Hasil/result=----
        hbutses=(TextView)findViewById(R.id.hbutses);
        hbuses=(TextView)findViewById(R.id.hbuses);
        hbss=(TextView)findViewById(R.id.hbss);
        here=(TextView)findViewById(R.id.here);
        heme=(TextView)findViewById(R.id.heme);
        heti=(TextView)findViewById(R.id.heti);
        hhts=(TextView)findViewById(R.id.hhts);
        hhs=(TextView)findViewById(R.id.hhs);
        hhss=(TextView)findViewById(R.id.hhss);
        hr1=(TextView)findViewById(R.id.hr1);
        hr2=(TextView)findViewById(R.id.hr2);
        hr3=(TextView)findViewById(R.id.hr3);
        hr4=(TextView)findViewById(R.id.hr4);
        hr5=(TextView)findViewById(R.id.hr5);
        hr6=(TextView)findViewById(R.id.hr6);
        hr7=(TextView)findViewById(R.id.hr7);
        hr8=(TextView)findViewById(R.id.hr8);
        hr9=(TextView)findViewById(R.id.hr9);
        hr10=(TextView)findViewById(R.id.hr10);
        hr11=(TextView)findViewById(R.id.hr11);
        hr12=(TextView)findViewById(R.id.hr12);
        hr13=(TextView)findViewById(R.id.hr13);
        hr14=(TextView)findViewById(R.id.hr14);
        hr15=(TextView)findViewById(R.id.hr15);
        hr16=(TextView)findViewById(R.id.hr16);
        hr17=(TextView)findViewById(R.id.hr17);
        hr18=(TextView)findViewById(R.id.hr18);
        hr19=(TextView)findViewById(R.id.hr19);
        hr20=(TextView)findViewById(R.id.hr20);
        hr21=(TextView)findViewById(R.id.hr21);
        hr22=(TextView)findViewById(R.id.hr22);
        hr23=(TextView)findViewById(R.id.hr23);
        hr24=(TextView)findViewById(R.id.hr24);
        hr25=(TextView)findViewById(R.id.hr25);
        hr26=(TextView)findViewById(R.id.hr26);
        hr27=(TextView)findViewById(R.id.hr27);
        hdefuz=(TextView)findViewById(R.id.hdefuz);
        //==------=====================
        btnoutput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fuzzyfikasi();
                budaya=Float.parseFloat(boxbudaya.getText().toString());
                hiburan=Float.parseFloat(boxhiburan.getText().toString());
                edukatif=Float.parseFloat(boxedukatif.getText().toString());
                //hasil
                hbutses.setText(String.valueOf(butses));
                hbuses.setText(String.valueOf(buses));
                hbss.setText(String.valueOf(busses));
                hhts.setText(String.valueOf(hitses));
                hhs.setText(String.valueOf(hises));
                hhss.setText(String.valueOf(hisses));
                here.setText(String.valueOf(eduren));
                heme.setText(String.valueOf(edumen));
                heti.setText(String.valueOf(edutin));
                rule();
                hr1.setText(String.valueOf(rules1));
                hr2.setText(String.valueOf(rules2));
                hr3.setText(String.valueOf(rules3));
                hr4.setText(String.valueOf(rules4));
                hr5.setText(String.valueOf(rules5));
                hr6.setText(String.valueOf(rules6));
                hr7.setText(String.valueOf(rules7));
                hr8.setText(String.valueOf(rules8));
                hr9.setText(String.valueOf(rules9));
                hr10.setText(String.valueOf(rules10));
                hr11.setText(String.valueOf(rules11));
                hr12.setText(String.valueOf(rules12));
                hr13.setText(String.valueOf(rules13));
                hr14.setText(String.valueOf(rules14));
                hr15.setText(String.valueOf(rules15));
                hr16.setText(String.valueOf(rules16));
                hr17.setText(String.valueOf(rules17));
                hr18.setText(String.valueOf(rules18));
                hr19.setText(String.valueOf(rules19));
                hr20.setText(String.valueOf(rules20));
                hr21.setText(String.valueOf(rules21));
                hr22.setText(String.valueOf(rules22));
                hr23.setText(String.valueOf(rules23));
                hr24.setText(String.valueOf(rules24));
                hr25.setText(String.valueOf(rules25));
                hr26.setText(String.valueOf(rules26));
                hr27.setText(String.valueOf(rules27));
                hdefuz.setText(String.valueOf(defuzyfikasi()));
            }
        });
    }
}


