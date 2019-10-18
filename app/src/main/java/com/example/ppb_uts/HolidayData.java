package com.example.ppb_uts;

import java.util.ArrayList;

public class HolidayData {
    private static String[] holiNames = {
            "Materi 1",
            "Materi 2",
            "Materi 3",
            "Materi 4",
            "Materi 5"

    };
    private static String[] holiDetails = {"Sebuah Activity akan menampilkan antarmuka aplikasi di layar, sebagai contoh ketika kita membuka sebuah aplikasi maka akan muncul tampilan dari aplikasi tersebut.\n" +
            "Activity diimplementasikan sebagai subclass dari class Activity sebagai contoh:",
            "Service adalah komponen yang berjalan di latar belakang. Sebagai contoh, Service bisa memainkan musik di latar belakang saat pengguna berada dalam aplikasi yang berbeda, atau mungkin mengambil data " + "melalui jaringan tanpa menghalangi interaksi pengguna dengan aktivitas.Service diimplementasikan sebagai subclass dari class Service sebagai contoh:",
            "Broadcast Receiver berfungsi menerima pesan intent dari aplikasi lain atau dari sistem. Sebagai contoh, suatu aplikasi mengirim pesan berisi perintah tertentu untuk aplikasi lain bahwa beberapa data telah diunduh ke perangkat dan tersedia bagi mereka untuk menggunakan apklikasi tersebut, jadi Broadcast Receiver inilah yang akan menangani komunikasi ini dan akan melakukan tindakan yang tepat.Sebuah Broadcast Receiver diimplementasikan sebagai subclass dari class BroadcastReceiver dan setiap pesan akan dikirim dan diterima sebagai objek Intent.",
            "ContentProvider adalah penyedia konten dari satu aplikasi ke aplikasi lain atas perintah tertentu. Perintah tersebut ditangani oleh sebuah method dari class ContentResolver. Data dapat disimpan dalam sistem file, database atau di tempat lainnya.ContentProvider diimplementasikan sebagai subclass dari class ContentProvider dan harus menerapkan satu set standar API yang memungkinkan aplikasi lain untuk melakukan transaksi.",
            "Fragment merupakan bagian dari antarmuka pengguna dalam Activity seperti tampilan tab atau pager"
    };
    private static String[] holiSyntax ={"public class MainActivity extends Activity {\n" +
            ".....\n" +
            "}",
            "public class MyService extends Service {\n" +
            "\n" +
            "}",
            "public class MyReceiver  extends  BroadcastReceiver {\n" +
            "   \n" +
            "   public void onReceive(context,intent){}\n" +
            "\n" +
            "}",
            "public class MyContentProvider extends  ContentProvider {\n" +
            "   \n" +
            "   public void onCreate(){}\n" +
            "\n" +
            "}",
            "import android.support.v7.app.AppCompatActivity;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    // ...\n" +
            "}",
            "a"

    };
    private static String[] holiLink ={"a","a","a","a","a"};

    static ArrayList<Holi> getListData() {
        ArrayList<Holi> list = new ArrayList<>();
        for (int position = 0; position < holiNames.length; position++) {
            Holi holi = new Holi();
            holi.setName(holiNames[position]);
            holi.setMateri(holiDetails[position]);
            holi.setSyntax(holiSyntax[position]);
            holi.setLink(holiLink[position]);
            list.add(holi);
        }
        return list;
    }
}

