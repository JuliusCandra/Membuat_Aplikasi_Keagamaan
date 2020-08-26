package developer.candra_julius_sinaga.data;

import java.util.ArrayList;

import developer.candra_julius_sinaga.model.nama_nama_doa;

public class Data_Doa {

    private static String [] doa = {
        "Doa Bapak kami",
        "Doa Maliakat Tuhan",
        "Doa Salam Maria",
        "Doa Kemuliaan",
        "Doa Tobat",
        "Doa Aku Percaya",
        "Doa Novena Roh Kudus",
        "Doa Rosario",
        "Doa Novena Tiga Salam Maria",
        "Doa Novena Bunda Penolong Abadi",
        "Doa Novena Kepada Hati Kudus Yesus",
        "Doa Novena Kanak-kanak Yesus",
        "Doa Kepada St. Michael",
        "Doa Kepada St. Rafael",
        "Doa Kerahiman Ilahi"
    };

    private static String [] detailDoa = {
        "Bapak kami yang ada didalam surga \n dimuliakanlah namamu \n Datanglah kerajaanmu \n jadilah kehendakmu \n diatas bumi seperti di dalam surga " +
                "\n berilah kami rezeki pada hari ini \n dan ampunilah kesalahan kami \n seperti kami pun mengampuni yang bersalah kepada kami \n dan janganlah " +
                "masukkan kami ke dalam pencobaan \n tetapi bebaskanlah kami dari yang jahat \n Amin",

        "Maria diberi kabar malaikat tuhan \n Bahwa ia akan mengandung dari roh kudus \n Salama Maria 1x \n \n Sabda sudah menjadi daging dan tinggal diantara kita \n Salam Maria 1x" +
                "\n \n Doa kan lah kami, ya Santa Bunda Allah \n Supaya kami dapat menikmati janji kristus",

        "Salam Maria penuh rahat tuhan sertamu \n terpujilah engkau diantara wanita \n dan terpujilah buah tubuhmu yesus \n Santa maria bunda allah \n doakanlah kami yang berdosa ini \n sekarang dan waktu kami mati " +
                "\n Amin",

        "Kemuliaan kepada Bapa dan Putra dan Roh kudus \n seperti pada permulaan,sekarang,selalu dan sepanjang segala abad \n Amin",

        "Allah yang maha rahim, aku menyesal atas dosa dosaku. Aku sunggu patut engkau hukum \n terutama karena aku telah tidak setia kepada engkau yang maha pengasih dan maha baik " +
                "\n bagik. \n Aku benci akan segala dosaku, dan berjanji dengan pertolongan rahmatMU hendak memperbaiki hidupku dan tidak akan berbuat dosa lagi \n Allah yang maha murah," +
                "ampunilah aku, orang berdosa Amin",

        "Aku percaya akan Allah Bapak yang MahaKuasa Pencipta langit dan bumi \n dan akan Yesus Kristus \n Putranya yang tunggal tuhan kita yang dikandung dari roh kudus dilahirkan oleh Perawan Maria \n " +
                "yang menderita sengsara dalam pemerintahan Pontius Pilatus disalibkan,wafat,dan dimakamkan. \n yang turun ketempat penantian pada hari ketiga bangkit dari antara orang mati. \n " +
                "yang naik kesurga, duduk di sebelah kanan Allah Bapak yang mahakuasa. \n dari situ ia akan datang mengadili orang hidup dan yang mati \n Aku percaya akan Roh Kudus \n Gereja katolik yang kudus \n " +
                "persekutuan para kudus \n pengampunan dosa \n kebangkitan badan \n kehidupan kekal. Amin",

        "Hari pertama \n Allah pokok keselamatan kami, karena kebangkitan Kristus kami lahir kembali dalam pembaptisan dan menjalani hidup baru. Arahkanlah hati kami kepada kristus yang kini" +
                "duduk disebelah kanan-Mu. Semoga Rohmu menjaga kami sampai Penyelamat kami datang dalam kemuliaan, sebab Dialah Tuhan, Pengantara kami, kini dan sepanjang masa Amin" +
                "Dilanjutkan dengan Rosario Roh Kudus \n \n  Hari Kedua \n Allah yang mahabijaksana, Putra-Mu menjanjikan Roh kudus kepada para rasul dan memenuhi janji itu sesudah Dia naik ke surga." +
                "Semoga kami pun kau anugerahi karunia Roh Kudus. Demi Yesus Kristus, Pengantara kami kini dan sepanjang masa. Amin" +
                "Dilanjutkan dengan Rosario Roh Kudus \n \n Hari Ketiga \n Allah, Penyelamat kami, kami percaya bahwa Kristus telah bersatu dengan Dikau dalam keagungan. Semoga dalam Rohnya " +
                "Dia selalu menyertai kami sampai akhir zaman, seperti yang dijanjikannya. Sebab Dialah Tuhan kami, kini dan sepanjang masa. Amin. Dilanjutkan dengan Rosario Roh Kudus \n \n " +
                "Hari Keempat \n Allah yang maha kudus, semoga kekuatan Roh-Mu turun atas kami, agar kami mematuhi kehendak-MU dengan setia dan mengamalkannya dalam cara hidup kami. Demi Yesus Kristus, Tuhan kami," +
                "kini dan sepanjang masa. Amin. Dilanjutkan dengan Rosario Roh Kudus \n \n Hari Kelima \n Allah yang mahakuasa dan maha kudus, semoga Roh Kudus yang turun atas kami dan berdiam dalam diri kami," +
                "sehingga kami menjadi kenisah kemuliannya. Demi Yesus Kristus, Tuhan kami, kini dan sepanjang masa. Amin. Dilanjutkan dengan Rosario Roh Kudus. \n \n Hari Keenam \n " +
                "Allah yang maha esa, Engkau telah menghimpun Gereja dalam Roh Kudus. Semoga kami mengabdi kepada-Mu dengan ikhlas dan bersatu padu dalam cinta. Demi Yesus Kristus, Tuhan kami, kini dan sepanjang masa. Amin.\n" +
                "\n Hari Ketujuh \n Allah yang maha kudus, curahkanlah Roh Kudus-MU kedalam diri kami, sehingga kami dapat melaksanakan kehendak-Mu dan layak menjadi milik-MU. Demi Yesus Kristus, Tuhan kami," +
                "kini dan sepanjang masa. Amin. Dilanjutkan dengan Rosario Roh Kudus \n \n Hari Kedelapan \n Allah sumber cahaya kekal, Engkau telah membukakan bagi kami jalan menuju hidup kekal dengan memuliakan Putra-MU dan mengutus Roh kudus." +
                "Semoga Cinta bakti dan iman kami selalu bertambah. Demi Yesus Kristus, Tuhan kami, kini dan sepanjang masa. Amin. Dilanjutkan dengan Rosario Roh Kudus \n \n Hari Kesembilan \n " +
                "Allah yang maha kuasa, kebangkitan Putra-Mu telah menumbuhkan hidup baru dalam diri kami. Semoga karena bantuan Roh-Mu kami mewujudkan rahmat kebangkitan dalam hidup kami sehari-hari. Demi Yesus Kristus," +
                "Tuhan kami, kini dan sepanjang masa. Amin",

        "Tanda salib pembuka \n Aku percaya \n Kemulian kepada Bapa \n Doa Bapa Kami \n \n Salam, Putri Allah Bapa." +
                "Salam Maria Salam, Buda Allah Putra, Salam Maria Salam, Mempelai Allah Roh Kudus. Salam Maria \n Kemuliaan \n Terpujilah " +
                "\n \n Peristiwa 1 \n Maria menerima kabar gembira dari Malaikat Gabriel(Luk 1:26-38). \n Bapa kami \n 10 x Salam Maria \n Kemuliaan \n Terpujilah " +
                "\n Doa Fatima \n \n Peristiwa 2 \n Maria mengunjungi Elisabet, saudarinya(Luk 1:39-45). \n Bapa Kami \n 10 x Salam Maria \n Kemuliaan \n Terpujilah \n Doa Fatima \n \n " +
                "Peristiwa 3 \n Yesus dilahirkan di Bethlehem (Luk 2:1-7). \n Bapa Kami \n 10 x Salam Maria \n Kemuliaan \n Terpujilah \n Doa Fatima \n \n Peristiwa 4" +
                "\n Yesus dipersembahkan dalam Bait Allah (Luk 2:22-40).\n Bapa Kami \n 10 x Salam Maria \n Kemuliaan \n Terpujilah \n Doa Fatima \n \n Peristiwa 5 \n Yesus diketemukan dalam Bait Allah" +
                "(Luk 2:41-52). \n Bapa Kami \n 10 x Salam Maria \n Kemuliaan \n Terpujilah \n Doa Fatima",

        "Bunda Maria, Perawan yang berkuasa, bagimu tiada sesuatu yang mustahil, karena kekuasaan yang dianugerahkan Tuhan yang mahakuasa kepadamu. Maka dengan sangat aku mohon bantuanmu dalam kesulitanku." +
                "Janganlah kiranya engkau meninggalkan daku, sebab engkau pasti dapat menolong meski dalam perkara sulit yang tidak ada harapannya sekalipun, engaku tetap menjadi penolong \n " +
                "Baik keluhuran tuhan, kehormatan namamu, maupun keselamatan jiwaku akan bertambah, jika engkau sudi mengabulkan permohonanku ini. Oleh karena itu, kalau permohonan ini benar-beanr searah dengan kehendak" +
                "Tuhan yang maha kasih dan mahasuci, aku mohon dengan sangat, ya Bunda yang kuasa dalam permohonan, sudilah kiranya Bunda meneruskan permohonanku ini ke hadirat putramu, Yesus, yang pasti tak kan menolakmu. \n " +
                "Pengharapanku yang besar ini berdasarkan kekuasaan tak terbatas, yang dianugerahkan Allah Bapa keapdamu. Dan untuk menghormati kekuasaaanmu, aku berdoa bersama Santa Mechtildis, yang kau beritahu tentang latihan " +
                "kebaktian (Tiga Salam Maria) yang sangat besar manfaatnya. \n Salam Maria........ 3x \n (Permohonan) \n Perawan suci, Takhta kebijaksanaan, berkat sabda ilahi telah tinggal di dalam dirimu." +
                "Engkau telah dianugerahi pengetahuan ilahi, tak terhingga oelh putramu, karena sebagai makhluk paling sempurna engkau dapat menerimanya. Engkau tahu betapa besar kesulitan yang kuhadapi," +
                "betapa besar pertolongan yang kuharapkan darimu. \n Dengan penuh kepercayaan akan tingginya kebijaksanaan aku menyerahkan diri seutuhnya kepadamu, supaya engkau dapat mengatur berkat segala kesanggupan dan kedermawanan budi" +
                ",demi keluhuran Tuhan dan keselematan jiwaku. Sudilah kiranya Bunda menolong dengan segala cara yang paling tepat, agar tercapailah maksudku itu.\n " +

                "Bunda Maria,Bunda kebijaksanaan ilahi, berkenanlah mengabulkan permohonanku yang penting ini. Aku mohon ini berdasarkan kebijaksanaanmu yang tiada bandingnya, yang dikaruniakan kepadamu oleh Sabda Ilahi,puteramu." +
                "Bersama Santo Antonius dari Padua dan Santo Leonardus dari Porto Mauritio, pewarta kebaktian (Tiga Salam Maria) yang rajin, aku berdoa untuk menghormati kebijaksanaanmu yang tiada tara. \n " +
                "Salam Maria....... 3x \n (Permohonan) \n" +
                "Bunda yang baik dan lembut hati, bunda kerahiman sejati, yang akhir-akhir ini disebut (Bunda yang penuh belas kasih), aku datang kepadamu, dan mohon dengan sangat," +
                "sudilah kiranya bunda memperlihatkan belas kasihmu kepadaku." +
                "Aku tahu bahwa aku tidak pantas mendapatkan karunia itu, sebab kerap kali aku menyedihkan hatimu, dengan menghina Yesus, putramu Betapa pun besar kesalahanku, aku sangat menyesal karena telah melukai" +
                "Hati Kudus Yesus dan hati kudusmu \n Engkau telah memperkenalkan diri sebagai (Bunda para pendosa yang bertobat) kepada Santa Brigita. Maka, ampunilah kiranya yang sudah sudah. Ingatlah " +
                "saja akan keluhuran Tuhan serta kerahiman dan kebaikan hatimu yang akan terpancar, degan mengabulkan anugerah permohonan ini dengan perantaraanmu. \n Bunda Perawan yang penuh kebaikan, lemah lembut, dan manis, belum" +
                "pernah engkau membiarkan yang datang mohon pertolonganmu. Atas kerahiman dan kebaikanmu, dan lewat doamu aku mengharap dengan sangat anugerah Roh Kudus. Dan demi keluhuran namamu, bersama santo" +
                "Alfonsus Maria de Liguori, rasul kerahimanmu serta guru kebaktian (Tiga Salam Maria) ini, aku berdoa untuk menghormati kerahiman dan kebaikanmu \n Salam Maria........ 3x \n (Permohonan)",

        "Bunda Penolong Abadi, dengan penuh kepercayaan dan harapan, kami berlutut di hadapanmu. Belum pernah ada orang yang sia-sia mencari perlindunganmu. Semasa hidupmu sebagai ibu, engkau sering kali memberi pertolongan kepada Yesus Putramu" +
                "Dengan penuh kasih sayang engkau melindungi dan membimbingnya selama masa mudanya. Selama hidupnya dimuka umum engkau menghibur-nya dan memberi dorongan kepadanya. Pada saat dia menderita," +
                "engkau mendampingi dan menguatkannya. Demikian juga, jadilah bagi kami seorang ibu yang selalu menolong kami. Bunda Maria, kami ini juga anakmu. Di kayu salib, putra ilahimu telah " +
                "memberikan dikau sebagai ibu kami dan engkau telah menerima kami sebagai anakmu. \n Kami tahu engkau memberi anak-anakmu khususnya mereka yang menghormatimu sebagai Bunda Penolong Abad rahmat dan berkat yang tak terhitung banyaknya " +
                "untuk jiwa raga mereka. Dengan penuh syukur, kami mengucapkan terima kasih atas segala perlindungan bagi kami dan bagi mereka semua. \n Bunda Penolong Abadi, jangan biarkan kami pergi sekarang tanpa hiburanmu. kami selalu memerlukan bantuanmu," +
                "teristimewa dalam kesulitan yang sekarang ini kami hadapi.... Bunda Maria, pandanglah kami dengan penuh kebaikan dan kasih sayang. Jadilah perantara kepada putera ilahimu, untuk memperoleh anugerah-anugerah yang kami mohon" +
                "dengan sangat dalam doa ini. Kami berjanji akan berterimakasih kepadamu selama hidup kami, sampai kami datang bersyukur kepadamu disurga. Ibu yang kuasa, baik bagi kami, engkau dapat menolong kami," +
                "engkau bersedia menolong kami. \n O Ibu, Penolong Abadi yang setia, terimalah doa kami. Amin",

        "Ya Yesus, Engkau berkata: (Mintalah maka akan dberikan kepadamu, carilah maka kamu akan mendapat, ketuklah maka pintu akan kubukakan bagimu)." +
                "Dengan perantaraaan maria Bundamu tersuci aku memanggil Engkau, aku mencari dan memohon kepadamu untuk mendengarkan permohonanku ini." +
                "(Sebutkan karunia yang anda minta) \n Ya Yesus, Engkau berkata: (Apa saja yang kau minta kepada BapaKu dengan namaku. Dia akan memberikannya kepadamu)" +
                "Aku memohon dengan rendah hati dan penuh kepercayaan dari Bapa Surgawi dalam namamu, dengan perantaraan Maria Bundamu tersuci, untuk mengabulkan permohonanku ini. \n " +
                "(Sebutkan permohonan anda) \n Ya Yesus, Engkau berkata: (langit dan bumi akan musnah, tetepai Sabdaku tidak akan musnah. Dengan perantaraan Maria Bundamu tersuci, aku percaya bahwa " +
                "permohonanku akan dikabulkan \n (Sebutkan permohonan anda) \n Yesusku, Tuhan jiwaku, Engkau berjanji bahwa Hati kudusmu akan menjadi laut kerahiman bagi orang-orang yang berharap padaMU" +
                "aku sungguh percaya bahwa engkau akan mengabulkan apa yang aku minta, walaupun itu memerlukan mukjizat. Pada siapa aku akan mengetuk kalau bukan pada hatimu.Terberkatilah " +
                "mereka yang berharap padamu. Ya Yesus, aku mempersembahkan kepada Hatimu(penyakit ini,jiwa ini,permohonan ini).Pandanglah dan buatlah apa yang hatiMU kehendaki \n \n Ya Yesus,aku berharap padaMU dan percaya" +
                "kepada-Mu aku mempersembahkan diriku, di dalam Engkau aku merasa aman.(1x Bapa Kami... Salam Maria ... Kemuliaan ...) \n Hati Kudus Yesus, aku berharap pada-Mu \n " +
                "(Ulangi 10 x dengan penuh semangat) \n Ya Yesus yang baik, Engkau berkata (jika engkau hendak menyenangkan Daku), Percayalah kepadaku jika engkau hendak lebih menyenangkan Daku, berharaplah pada-Ku selalu)Padamu Tuhan, aku berharap, agar aku" +
                " tidak binasa selamanya. Amin. \n Doa Kepada Hati Kudus Yesus \n Ya tuhan, aku berdoa, agar di rumahku ada damai, ketenangan dan kesejahteraan di dalam naunganMu. Berkatilah dan lindungilah usahaku, rencana palsu" +
                " dan pikiran jahat. Tuangkan lah di dalam hatiku, cinta kepada sesama dan anugerahkanlah kepadaku semangat penyerahan yang teguh, teristimewa pada saat kemalangan, agar supaya aku bangun dari kebimbangan. \n " +
                "Ya Tuhan, bimbinglah dan lindungilah hidupku dari bahaya-bahaya dan ketidaktentuan dunia. Jangan lupa, ya Yesusku, orang-orang yang kukasihi, baik yang masih hidup maupun yang sudah meninggal" +
                " ,yang menyebabkan kesedihan kami. Tetapi kami dihibur oleh ketaatan mereka waktu mereka masih hidup, sehingga Engkau tidak menyerahkan mereka kepada maut. Kasihanilah mereka Tuhan, dan bawalah mereka kepada kemuliaan surgawi. Amin.",

            "(Novena Penuh Kuasa Dalam Keperluan Yang Mendesak)\n" +
            "(Harus didoakan selama sembilan hari berturut-turut)\n" +
            "Yesus, Engkau bersabda,\"Mintalah maka kamu akan menerimanya, carilah maka kamu akan menemukan, ketuklah maka pintu akan dibukakan bagimu\". Dengan perantara bunda Maria, BundaMu yang tersuci, aku mengetuk, aku mencari, aku memohon kabulkanlah doaku (Sebutkan permohonan anda...........)\n" +
            "\n" +
            "Yesus, Engkau bersabda,\"Semua yang kau mohon atas namaKu Bapa akan mengabulkannya\". Dengan perantara Bunda Maria, BundaMu yang tersuci, dengan rendah hati, dengan sangat aku memohon kepada BapaMu demi namaMu kabulkanlah doaku (Sebutkan permohonan anda.................)\n" +
            "\n" +
            "Yesus, Engkau bersabda,\" langit dan bumi akan lenyap, tetapi sabdaku tidak akan lenyap\". Dengan perantara Bunda Maria, BundaMu yang suci, aku yakin bahwa doaku akan dikabulkan (Sebutkan permohonan anda...............)\n" +
            "\n" +
            "NB: Dalam kasus-kasus serius, Novena dapat diadakan per jam, sebagai ganti Novena harian. Doa doanya, kalau itu mungkin, diadakan berulang kali pada saat yang sama selama sembilan jam berturut-turut",

            "(†) Dalam nama Bapa dan Putra dan Roh Kudus. Amin.\n" +
            "\n" +
            "Santo Mikael Malaikat Agung, belalah kami dalam pertempuran melawan kejahatan dan tipu daya setan.\n" +
            "Jadilah pelindung kami terhadap kebencian dan jerat setan.\n" +
            "Dengan rendah hati kami mohon, semoga Allah menaklukkannya.\n" +
            "Dan Engkau ... O Panglima Bala tentara surgawi, dengan Kuasa Ilahi, usirlah kembali ke neraka, setan dan roh jahat lainnya, yang berkeliaran di seluruh dunia yang hendak menghancurkan jiwa-jiwa. (Amin).\n" +
            "\n" +
            "Bapa Kami, . . .\n" +
            "Salam Maria, . . .\n" +
            "Santo Mikael, doakanlah kami, . . .\n" +
            "\n" +
            "(†) Dalam Nama Bapa dan Putera dan Roh Kudus.\n" +
            "Amin.",

            "Ya Tuhan,dalam kebaikanMu yang tak terlukiskan, Engkau telah menjadikan St.Rafael yang mulia sebagai pelindung umatMu dalam perjalanan. \n  Dengan rendah hati kami mohon kepadaMu agar kami dapat dituntunnya di jalan keselamatan dan memperoleh pertolongannya saat jiwa kami dalam bahaya.\n" +
            "Demi Yesus Kristus, Tuhan kami. \n" +
            "Amin ",

            "Ya, Yesus, Engkau telah wafat namun sumber Kehidupan telah memancar bagi Jiwa-jiwa dan terbukalah lautan Kerahiman bagi segenap dunia...\n" +
            "\n" +
            "O, Sumber Kehidupan Kerahiman Ilahi yang tak terselami, naungilah segenap dunia dan curahkanlah Diri-MU kepada kami.\n" +
            "\n DOA UTAMA KEPADA KERAHIMAN ILAHI :\n" +
            "\n" +
            "Darah dan air, yang telah memancar dari Hati Yesus sebagai sumber Kerahiman bagi kami Engkaulah Andalanku.(3x)\n" +
            "\n" +
            "Allah yang Kudus, Kudus dan Berkuasa, Kudus dan Kekal, kasihanilah kami dan seluruh dunia.... (3X).\n" +
            "\n" +
            "Kerahiman Ilahi yang berdiam dalam Hati Yesus bagi kami khususnya bagi para pendosa. Engkaulah Andalanku.Amin."
    };


    public static ArrayList<nama_nama_doa> getDoa(){
        ArrayList<nama_nama_doa> doas = new ArrayList<>();
        for (int i = 0; i < doa.length; i++){
             nama_nama_doa nama_doa = new nama_nama_doa();
             nama_doa.setNamaDoa(doa[i]);
             nama_doa.setDetailDoa(detailDoa[i]);
             doas.add(nama_doa);
        }
        return doas;
    }

}
