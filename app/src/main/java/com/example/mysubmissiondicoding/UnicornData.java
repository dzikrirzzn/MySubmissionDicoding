package com.example.mysubmissiondicoding;


import java.util.ArrayList;

public class UnicornData {
    private static String[] unicornNames = {
            "Gojek",
            "Traveloka",
            "Tokopedia",
            "Bukalapak",
            "Grab",
            "WeWork",
            "Uber",
            "Bluehole",
            "Airbnb",
            "EpicGames",
            "Pinterest"
    };

    private static String[] unicornDetails = {
            "PT Aplikasi Karya Anak Bangsa atau yang lebih dikenal dengan gojek (sebelumnya ditulis GO-JEK) merupakan sebuah perusahaan teknologi asal Indonesia yang melayani angkutan melalui jasa ojek. Perusahaan ini didirikan pada tahun 2010 di Jakarta oleh Nadiem Makarim. Saat ini, Gojek telah tersedia di 50 kota di Indonesia, Layanan Gojek juga telah tersedia di Thailand, Vietnam dan Singapura.\n",
            "Traveloka adalah perusahaan yang menyediakan layanan pemesanan tiket pesawat dan hotel secara daring dengan fokus perjalanan domestik di Indonesia. Didirikan pada tahun 2012 oleh Ferry Unardi, Derianto Kusuma, dan Albert Zhang. Traveloka yang merupakan salah satu perusahaan rintisan (startup) berstatus unicorn asal Indonesia ini mengembangkan layanannya pada pemesanan tiket kereta api, bus, penyewaan mobil, hingga aktivitas wisata. Sejak tahun 2015, Traveloka mulai berekspansi ke sejumlah negara di Asia Tenggara seperti Singapura, Malaysia, Vietnam, Thailand, dan Filipina.\n",
            "Tokopedia resmi diluncurkan ke publik pada 17 Agustus 2009 di bawah naungan PT Tokopedia yang didirikan oleh William Tanuwijaya dan Leontinus Alpha Edison pada 6 Februari 2009. Sejak resmi diluncurkan, PT Tokopedia berhasil menjadi salah satu perusahaan internet Indonesia dengan pertumbuhan yang sangat pesat. \n",
            "Bukalapak merupakan salah satu pusat perbelanjaan daring (online marketplace) di Indonesia (biasa dikenal juga dengan jaringan toko daring ) yang dimiliki dan dijalankan oleh PT. Bukalapak. Bukalapak didirikan pada 10 Januari 2010 oleh Achmad Zaky, Nugroho Herucahyono, dan Fajrin Rasyid di sebuah rumah kos di Bandung, Jawa Barat. Bukalapak telah menjadi 1 dari 4 unicorn asal Indonesia pada tahun 2017. Bukalapak secara konsisten berupaya memperluas literasi digital dan membangun usaha kecil dan menengah (UKM) di Indonesia.\n",
            "Grab (sebelumnya dikenal sebagai GrabTaxi) merupakan salah satu platform O2O yang bermarkas di Singapura dan paling sering digunakan di Asia Tenggara. Mereka menyediakan layanan kebutuhan sehari-hari bagi para pelanggan termasuk perjalanan, pesan-antar makanan, pengiriman barang – dan pembayaran menggunakan dompet digital.\n",
            "WeWork adalah perusahaan Amerika Serikat yang menyediakan ruang kerja bersama untuk perusahaan rintisan teknologi, wiraswasta, pekerja lepas, UKM, dan perusahaan besar. Perusahaan ini didirikan tahun 2010 dan berkantor pusat di New York City. Per Juli 2017, WeWork memiliki kapitalisasi sebesar US$20 miliar.\n",
            "Uber Technologies Inc. adalah perusahaan jaringan transportasi asal San Francisco, California, yang menciptakan aplikasi penyedia transportasi yang menghubungkan penumpang dengan sopir kendaraan sewaan serta layanan tumpangan. Perusahaan ini mengatur layanan penjemputan di berbagai kota di seluruh dunia.\n",
            "Bluehole, Inc. (dikenal sebagai Bluehole Studio, Inc.sampai 22 April 2015) adalah pengembang video game Korea Selatan yang berbasis di distrik Bundang-gu Seongnam. Didirikan oleh Chang Byung-gyu, di Seoul, pada bulan Maret 2007, perusahaan terkenal karena mengembangkan TERA (2011) dan PlayerUnknown's Battlegrounds (2017), yang terakhir melalui anak perusahaan PUBG Corporation. Pada November 2018, Bluehole mengorganisir dirinya di bawah perusahaan induk yang baru didirikan, Krafton Game Union.\n",
            "Airbnb adalah jaringan pasar daring dan penginapan rumahan sejawat yang memungkinkan pengguna mendaftarkan atau menyewa properti untuk digunakan dalam jangka pendek. Harga sewanya ditetapkan oleh pemilik properti. Airbnb menerima sebagian tarif jasa pembukuan dari tamu dan tuan rumah. Saat ini, Airbnb mencakup 2.000.000 properti di 34.000 kota dan 191 negara. Airbnb didirikan pada bulan Agustus 2008 dan berkantor pusat di San Francisco, California. Perusahaan ini dimiliki dan dioperasikan secara tertutup (swasta).",
            "Epic Games, Inc. (dulunya Potomac Computer Systems dan kemudian Epic MegaGames, Inc.) adalah sebuah perusahaan pengembangan perangkat lunak dan permainan video yang berbasis di Cary, Carolina Utara. Perusahaan tersebut didirikan oleh Tim Sweeney dengan nama Potomac Computer Systems pada 1991, yang aslinya terletak di kampung orangtuanya di Potomac, Maryland.\n",
            "Pinterest, Inc. adalah perusahaan aplikasi web media sosial dan seluler. Ini mengoperasikan sistem perangkat lunak yang dirancang untuk memungkinkan penyimpanan dan penemuan informasi di World Wide Web menggunakan gambar dan, dalam skala yang lebih kecil, GIF dan video. Situs ini didirikan oleh Ben Silbermann, Paul Sciarra, dan Evan Sharp. Pinterest telah mencapai 300 juta pengguna aktif bulanan hingga Agustus 2019.\n"
    };

    private static int[] unicornImages = {
            R.drawable.gojek3,
            R.drawable.traveloka5,
            R.drawable.tokopedia4,
            R.drawable.bl0,
            R.drawable.grab0,
            R.drawable.wework0,
            R.drawable.uber5,
            R.drawable.bluehole5,
            R.drawable.airbnb0,
            R.drawable.epicgames5,
            R.drawable.pinterest0
    };

    static ArrayList<Unicorn> getListdata() {
        ArrayList<Unicorn> list = new ArrayList<>();
        for (int poisition = 0; poisition < unicornNames.length; poisition++) {
            Unicorn unicorn = new Unicorn();
            unicorn.setName(unicornNames[poisition]);
            unicorn.setDetail(unicornDetails[poisition]);
            unicorn.setPhoto(unicornImages[poisition]);
            list.add(unicorn);
        }
        return list;
    }
}


