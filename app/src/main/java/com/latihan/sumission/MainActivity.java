package com.latihan.sumission;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    private  static String[] nama ={
            "GO Lang",
            "Javascript",
            "R",
            "C++",
            "C",
            "Dart",
            "Delphi",
            "Java",
            "Kotlin",
            "Matlab",
            "Perl",
            "Python",
            "Ruby",
            "Scala",
            "Swift"
    };

    private static  String[] detail ={
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail",
            "Click For Detail"
    };

    private static String[] data ={
            "Go (sering disebut sebagai Golang) adalah bahasa pemrograman yang dibuat di Google pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Golang adalah bahasa pemrograman yang dihimpun dan diketik dalam bahasa C, dengan fitur pengumpulan sampah, penulisan terstruktur, keamanan memori, dan pemrograman yang konkuren serta berurutan.Kompiler dan IDE lainnya disediakan oleh Google dari awal secara gratis dan open source",
            "Javascript adalah bahasa scripting yang handal yang berjalan pada sisi client.JavaScript merupakan sebuah bahasa scripting yang dikembangkan oleh Netscape. Untuk menjalankan script yang ditulis dengan JavaScript kita membutuhkan JavaScript-enabled browser yaitu browser yang mampu menjalankan JavaScript.",
            "R (juga dikenal sebagai GNU S) adalah bahasa pemrograman dan perangkat lunak untuk analisis statistika dan grafik. R dibuat oleh Ross Ihaka dan Robert Gentleman di Universitas Auckland, Selandia Baru, dan kini dikembangkan oleh R Development Core Team, di mana Chambers merupakan anggotanya. R dinamakan sebagian setelah nama dua pembuatnya (Robert Gentleman dan Ross Ihaka), dan sebagian sebagian dari permainan nama dari S",
            "C++ merupakan bahasa pemrograman yang memiliki sifat Pemrograman berorientasi objek, Untuk menyelesaikan masalah, C++ melakukan langkah pertama dengan menjelaskan class-class yang merupakan anak class yang dibuat sebelumnya sebagai abstraksi dari object-object fisik, Class tersebut berisi keadaan object, anggota-anggotanya dan kemampuan dari objectnya, Setelah beberapa Class dibuat kemudian masalah dipecahkan dengan Class.",
            "C Dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi. C juga banyak dipakai oleh berbagai jenis platform sistem operasi dan arsitektur komputer, bahkan terdapat beberepa compiler yang sangat populer telah tersedi.",
            "Dart adalah sebuah bahasa pemrograman yang dikembangkan oleh Google dan digunakan untuk membangun aplikasi mobile, desktop, backend dan web, bahasa pemrograman ini bertipe Object Oriented dimana struktur kode kita berada di dalam Class, Class berisi data dan method. Dart menggunakan C-style syntax yang mirip dengan C,Java. Javascript. Swift.",
            "Umumnya delphi lebih banyak digunakan untuk pengembangan aplikasi desktop danenterprise berbasis database, tapi sebagai perangkat pengembangan yang bersifat general-purpose ia juga mampu dan digunakan dalam berbagai jenis proyek pengembangan software.",
            "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Java tidak boleh disalahpahami sebagai JavaScript. JavaScript adalah bahasa scripting yang digunakan oleh web browser.",
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia. Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada. Tim Pengembang memutuskan menamakannya Kotlin dengan mengambil nama dari sebuah pulau di Rusia, sebagaimana Java yang mengambil nama dari pulau Jawa di Indonesia.Setelah Google mengumumkan bahwa Kotlin menjadi bahasa kelas satu bagi Android, maka bersama Java dan C++, Kotlin menjadi bahasa resmi untuk pengembangan aplikasi-aplikasi Android",
            "MATLAB (Matrix Laboratory) adalah sebuah lingkungan komputasi numerikal dan bahasa pemrograman komputer generasi keempat. Dikembangkan oleh The MathWorks, MATLAB memungkinkan manipulasi matriks, pem-plot-an fungsi dan data, implementasi algoritme, pembuatan antarmuka pengguna, dan peng-antarmuka-an dengan program dalam bahasa lainnya. Meskipun hanya bernuansa numerik, sebuah kotak kakas (toolbox) yang menggunakan mesin simbolik MuPAD, memungkinkan akses terhadap kemampuan aljabar komputer. Sebuah paket tambahan, Simulink, menambahkan simulasi grafis multiranah dan Desain Berdasar-Model untuk sistem terlekat dan dinamik.",
            "Perl adalah bahasa pemrograman untuk mesin dengan sistem operasi Unix (SunOS, Linux, BSD, HP-UX), juga tersedia untuk sistem operasi seperti DOS, Windows, PowerPC, BeOS, VMS, EBCDIC, dan PocketPC.PERL merupakan bahasa pemograman yang mirip bahasa pemograman C.",
            "Python adalah bahasa pemrograman dinamis yang mendukung pemrograman berorientasi obyek. Python dapat digunakan untuk berbagai keperluan pengembangan perangkat lunak dan dapat berjalan di berbagai platform sistem operasi.",
            "Ruby adalah bahasa skripting yang berorientasi obyek. Tujuan dari ruby adalah menggabungkan kelebihan dari semua bahasa-bahasa pemrograman scripting yang ada di dunia. Ruby ditulis dengan bahasa pemrograman C dengan kemampuan dasar sepertiPerl dan Python.",
            "Scala adalah kritisi untuk bahasa pemrograman Java.Scala kode sumber dibuat untuk dapat dikompilasi dengan Java bytecode, sehingga mengakibatkan eksekusi kode berjalan pada mesin virtual Java. Scala menyediakan bahasa interoperabilitas dengan Java, sehingga perpustakaan yang ditulis dalam dua bahasa ini dapat dirujuk langsung di Scala atau kode Java.[1] Seperti Java, Scala adalah bahasa yang berorientasi objek, dan menggunakan sintaks-kriting mengingatkan pada bahasa pemrograman C. Tidak seperti Java, Scala memiliki banyak fitur dari pemrograman fungsional bahasa seperti Skema, Standar ML dan Haskell, termasuk currying, type inference, ketetapan, evaluasi malas, dan pencocokan pola. Ini juga memiliki lanjutan jenis sistem pendukung jenis data aljabar, covariance dan contravariance, jenis perintah tinggi (tapi tidak jenis lebih tinggi-peringkat), dan jenis anonim . Fitur lain dari Scala tidak hadir di Jawa termasuk operator overloading, optional parameter, parameter bernama, string baku, dan tidak ada pengecualian terperiksa .",
            "Swift adalah bahasa pemrograman objek fungsional untuk pengembangan iOS dan OS X yang dibuat oleh Apple. Didesain untuk berdampingan dengan Objective-C dan menghindari program dari kode yang salah. Swift diperkenalkan oleh Apple pada acara tahunan WWDC 2014. Ini dibangun dengan compiler LLVM yang termasuk dalam Xcode 6 beta. Sebuah buku berisi 500 halaman petunjuk, The Swift Programming Language, dirilis bersamaan dengan WWDC, dan tersedia secara gratis di iBooks"
    };
    private static int[] imgpoto = {
            R.drawable.golang,
            R.drawable.javascrip,
            R.drawable.er,
            R.drawable.cplus,
            R.drawable.c,
            R.drawable.dart,
            R.drawable.delphi,
            R.drawable.java,
            R.drawable.kotlin,
            R.drawable.matlab,
            R.drawable.perl,
            R.drawable.python,
            R.drawable.ruby,
            R.drawable.scala,
            R.drawable.swift
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv_bahasa);
        BahasaAdapter bahasaAdapter = new BahasaAdapter();
        listView.setAdapter(bahasaAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), listdata.class);
                intent.putExtra("Namaku", nama[position]);
                intent.putExtra("Detail", detail[position]);
                intent.putExtra("Data", data[position]);
                intent.putExtra("Photo", imgpoto[position]);
                intent.putExtra(listdata.EXTRA_TITLE, nama[position]);
                startActivity(intent);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.aboutme,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.ab_about:
                Intent intent = new Intent(MainActivity.this, AboutMe.class);
                startActivity(intent);
                return true;
            default:
            return super.onOptionsItemSelected(menuItem);
        }
    }

    class BahasaAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return nama.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
        @SuppressLint("ViewHolder")
        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.item_row_bahasa, null);

            ImageView imageView = view.findViewById(R.id.img_item_photo);
            TextView tvNama = view.findViewById(R.id.tv_item_name);
            TextView tvDetail = view.findViewById(R.id.tv_item_detail);

            imageView.setImageResource(imgpoto[position]);
            tvNama.setText(nama[position]);
            tvDetail.setText(detail[position]);
            return view;
        }
    }
}
