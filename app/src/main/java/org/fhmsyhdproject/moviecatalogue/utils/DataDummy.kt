package org.fhmsyhdproject.moviecatalogue.utils

import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity
import org.fhmsyhdproject.moviecatalogue.data.source.remote.response.MovieResponse

object DataDummy {

    fun moviesData(): List<MovieEntity> = listOf(
            MovieEntity("1",
                "movie",
                "Asih 2",
                "Teror ASIH (Syarifa Daanish), hantu perempuan malang yang sempat meneror keluarga ANDI (Darius Sinathrya), rupanya belum selesai. Dia kembali datang untuk mengambil anak semata wayang Andi dan Puspita, Amelia. Malam itu, Asih berhasil mengambil Amelia dengan membunuh Andi dan Puspita. Kejadian mengerikan itu disaksikan oleh NENEK (Marini Soerjosoemarno).",
                "Horror",
                "2 j 46 m",
                "Rizal Mantovani",
                "9.1/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fasih2.jpg?alt=media&token=d4e61998-1f7b-4caa-8cbb-64c2a6f4b9cd"
            ),
            MovieEntity("2",
                "movie",
                "Bucin",
                "Merasa bahwa mereka bucin, Jovial (29) mendaftarkan adiknya, Andovi (25), dan teman- temannya , Tommy (24) dan Chandra (26), untuk mengikuti kursus anti-bucin. Tujuan kursus ini adalah untuk mengajarkan cara memiliki hubungan yang sehat dan tidak hanya menguntungkan satu pihak. Kursus ini dibuat oleh Vania (29), seorang lulusan S2 psikologi dengan spesialisasi cinta. Ternyata metode yang digunakan oleh Vania tidak konvensional dan lumayan ekstrim, dia menggunakan konsep ESCAPE ROOM untuk menjelaskan konsep cinta. Sering kali mereka ingin berhenti karena tidak sanggup.",
                "Drama/Komedi",
                "1 j 37 m",
                "Chandra Liow",
                "4/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fbucin.jpeg?alt=media&token=4ec98e59-d11b-4ac4-bd9b-b688fc07cfd9"
            ),
            MovieEntity("3",
                    "movie",
                    "Dilan 1990",
                    "Milea (Vanesha Prescilla) bertemu dengan Dilan (Iqbaal Ramadhan) di sebuah SMA di Bandung. Itu adalah tahun 1990, saat Milea pindah dari Jakarta ke Bandung. Perkenalan yang tidak biasa kemudian membawa Milea mulai mengenal keunikan Dilan lebih jauh. Dilan yang pintar, baik hati dan romantis... semua dengan caranya sendiri. Cara Dilan mendekati Milea tidak sama dengan teman-teman lelakinya yang lain, bahkan Beni, pacar Milea di Jakarta. Bahkan cara berbicara Dilan yang terdengar kaku, lambat laun justru membuat Milea kerap merindukannya jika sehari saja ia tak mendengar suara itu. Perjalanan hubungan mereka tak selalu mulus. Beni, gank motor, tawuran, Anhar, Kang Adi, semua mewarnai perjalanan itu. Dan Dilan... dengan caranya sendiri...selalu bisa membuat Milea percaya ia bisa tiba di tujuan dengan selamat. Tujuan dari perjalanan ini. Perjalanan mereka berdua. Katanya, dunia SMA adalah dunia paling indah. Dunia Milea dan Dilan satu tingkat lebih indah daripada itu.",
                    "Roman/Drama",
                    "1 j 50 m",
                    "Pidi Baiq",
                    "7.3/10",
                    "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fdilan.jpg?alt=media&token=f9d2c9aa-333d-49b9-9b72-6e1252de27ee"
            ),
            MovieEntity("4",
                    "movie",
                    "Frozen 2",
                    "Queen Elsa starts hearing a mysterious melodic voice calling to her. Unsettled, she answers it and that awakens the elemental spirits that lead her to a quest to restore an old injustice.",
                    "Family/Musical",
                    "1 j 43 m",
                    "Jennifer Lee",
                    "6.9/10",
                    "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Ffrozen2.jpg?alt=media&token=3e181bcd-1ada-42e1-b7a4-63cb2e17cd8c"
            ),
            MovieEntity("5",
                    "movie",
                    "Habibie & Ainun 3",
                    "Kisah Ainun (Maudy Ayunda) sebagaimana remaja di usianya, punya kisah kasih yang cukup unik, menggelitik dan menarik...",
                    "Drama/Roman",
                    "2 j 1 m",
                    "Hanung Bramantyo",
                    "7/10",
                    "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fhabibiainun.jpg?alt=media&token=1b386aa5-9f80-4459-9ae4-c95c2d91d9ea"
            ),
            MovieEntity("6",
                    "movie",
                    "My Stupid Boss",
                    "A woman takes a job as secretary to the bumbling boss of a large company and comes to regret it.",
                    "Drama/Comedy",
                    "1 j 48 m",
                    "Upi Avianto",
                    "7.2/10",
                    "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fmystupidbos.jpg?alt=media&token=cbd1f9d8-5fcd-47df-a58b-b75fef1745e1"
            ),
            MovieEntity("7",
                    "movie",
                    "Negeri 5 Menara",
                    "Alif lahir di pinggir Danau Maninjau dan tidak pernah menginjak tanah di luar ranah Minangkabau. Masa kecilnya adalah berburu durian runtuh di rimba Bukit Barisan, bermain bola di sawah berlumpur dan tentu mandi berkecipak di air biru Danau Maninjau. Tiba-tiba saja dia harus naik bus tiga hari tiga malam melintasi punggung Sumatera dan Jawa menuju sebuah desa di pelosok Jawa Timur. Ibunya ingin dia menjadi Buya Hamka walau Alif ingin menjadi Habibie. Dengan setengah hati dia mengikuti perintah Ibunya: belajar di pondok. Di kelas hari pertamanya di Pondok Madani (PM), Alif terkesima dengan \"mantera\" sakti man jadda wajada. Siapa yang bersungguh-sungguh pasti sukses. Dia terheran-heran mendengar komentator sepakbola berbahasa Arab, anak menggigau dalam bahasa Inggris, merinding mendengar ribuan orang melagukan Syair Abu Nawas dan terkesan melihat pondoknya setiap pagi seperti melayang di udara. Dipersatukan oleh hukuman jewer berantai, Alif berteman dekat dengan Raja dari Medan, Said dari Surabaya, Dulmajid dari Sumenep, Atang dari Bandung dan Baso dari Gowa. Di bawah menara masjid yang menjulang, mereka berenam kerap menunggu maghrib sambil menatap awan lembayung yang berarak pulang ke ufuk. Di mata belia mereka, awan-awan itu menjelma menjadi negara dan benua impian masing-masing. Kemana impian jiwa muda ini membawa mereka?",
                    "Drama",
                    "2 j 15 m",
                    "Malik Punjabi",
                    "6.9/10",
                    "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fnegeri5menara.jpg?alt=media&token=bbec4bbb-631c-4dee-b0f8-fb6e7a037772"
            ),
            MovieEntity("8",
                    "movie",
                    "Perempuan Berkalung Sorban",
                    "Perempuan Berkalung Sorban merupakan film drama romantis bertema Islam dari Indonesia yang dirilis pada tahun 2009 dan disutradarai oleh Hanung Bramantyo. Film ini dibintangi antara lain oleh Revalina S. Temat, Joshua Pandelaki, Nasya Abigail, Widyawati, Oka Antara, Reza Rahadian, dan Ida Leman",
                    "Drama/Roman",
                    "2 j 15 m",
                    "Hanung Bramantyo",
                    "6.7/10",
                    "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fsorban.jpg?alt=media&token=abd3436c-6a2a-4d24-80aa-006ba1939aa8"
            ),
            MovieEntity("9",
                    "movie",
                    "Wonder Woman 1984",
                    "Diana Prince lives quietly among mortals in the vibrant, sleek 1980s -- an era of excess driven by the pursuit of having it all. Though she's come into her full powers, she maintains a low profile by curating ancient artifacts, and only performing heroic acts incognito. But soon, Diana will have to muster all of her strength, wisdom and courage as she finds herself squaring off against Maxwell Lord and the Cheetah, a villainess who possesses superhuman strength and agility.",
                    "Adventure/Action",
                    "2 j 15 m",
                    "Patty Jenkins",
                    "5.5/10",
                    "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fwonderwomen.jpg?alt=media&token=02ae078b-0d00-406c-bfec-2ff33114378a"
            ),
            MovieEntity("10",
                    "movie",
                    "World War Z",
                    "Gerry, a former United Nations employee, unexpectedly finds himself in a race against time as he investigates a threatening virus that turns humans into zombies.",
                    "Horror/Action",
                    "2 j 15 m",
                    "Marc Foster",
                    "7/10",
                    "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fwwz.jpg?alt=media&token=122c1751-b4ac-48f7-b179-c3407b4d5198"
            )
    )

    fun generateDummyMovies(): ArrayList<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity("1",
                "movie",
            "Asih 2",
            "Teror ASIH (Syarifa Daanish), hantu perempuan malang yang sempat meneror keluarga ANDI (Darius Sinathrya), rupanya belum selesai. Dia kembali datang untuk mengambil anak semata wayang Andi dan Puspita, Amelia. Malam itu, Asih berhasil mengambil Amelia dengan membunuh Andi dan Puspita. Kejadian mengerikan itu disaksikan oleh NENEK (Marini Soerjosoemarno).",
            "Horror",
            "2 j 46 m",
                "Rizal Mantovani",
            "9.1/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fasih2.jpg?alt=media&token=d4e61998-1f7b-4caa-8cbb-64c2a6f4b9cd")
        )
        movies.add(
            MovieEntity("2",
                "movie",
                "Bucin",
                "Merasa bahwa mereka bucin, Jovial (29) mendaftarkan adiknya, Andovi (25), dan teman- temannya , Tommy (24) dan Chandra (26), untuk mengikuti kursus anti-bucin. Tujuan kursus ini adalah untuk mengajarkan cara memiliki hubungan yang sehat dan tidak hanya menguntungkan satu pihak. Kursus ini dibuat oleh Vania (29), seorang lulusan S2 psikologi dengan spesialisasi cinta. Ternyata metode yang digunakan oleh Vania tidak konvensional dan lumayan ekstrim, dia menggunakan konsep ESCAPE ROOM untuk menjelaskan konsep cinta. Sering kali mereka ingin berhenti karena tidak sanggup.",
                "Drama/Komedi",
                "1 j 37 m",
                "Chandra Liow",
                "4/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fbucin.jpeg?alt=media&token=4ec98e59-d11b-4ac4-bd9b-b688fc07cfd9")
        )
        movies.add(
            MovieEntity("3",
                "movie",
                "Dilan 1990",
                "Milea (Vanesha Prescilla) bertemu dengan Dilan (Iqbaal Ramadhan) di sebuah SMA di Bandung. Itu adalah tahun 1990, saat Milea pindah dari Jakarta ke Bandung. Perkenalan yang tidak biasa kemudian membawa Milea mulai mengenal keunikan Dilan lebih jauh. Dilan yang pintar, baik hati dan romantis... semua dengan caranya sendiri. Cara Dilan mendekati Milea tidak sama dengan teman-teman lelakinya yang lain, bahkan Beni, pacar Milea di Jakarta. Bahkan cara berbicara Dilan yang terdengar kaku, lambat laun justru membuat Milea kerap merindukannya jika sehari saja ia tak mendengar suara itu. Perjalanan hubungan mereka tak selalu mulus. Beni, gank motor, tawuran, Anhar, Kang Adi, semua mewarnai perjalanan itu. Dan Dilan... dengan caranya sendiri...selalu bisa membuat Milea percaya ia bisa tiba di tujuan dengan selamat. Tujuan dari perjalanan ini. Perjalanan mereka berdua. Katanya, dunia SMA adalah dunia paling indah. Dunia Milea dan Dilan satu tingkat lebih indah daripada itu.",
                "Roman/Drama",
                "1 j 50 m",
                "Pidi Baiq",
                "7.3/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fdilan.jpg?alt=media&token=f9d2c9aa-333d-49b9-9b72-6e1252de27ee")
        )
        movies.add(
            MovieEntity("4",
                "movie",
                "Frozen 2",
                "Queen Elsa starts hearing a mysterious melodic voice calling to her. Unsettled, she answers it and that awakens the elemental spirits that lead her to a quest to restore an old injustice.",
                "Family/Musical",
                "1 j 43 m",
                "Jennifer Lee",
                "6.9/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Ffrozen2.jpg?alt=media&token=3e181bcd-1ada-42e1-b7a4-63cb2e17cd8c")
        )
        movies.add(
            MovieEntity("5",
                "movie",
                "Habibie & Ainun 3",
                "Kisah Ainun (Maudy Ayunda) sebagaimana remaja di usianya, punya kisah kasih yang cukup unik, menggelitik dan menarik...",
                "Drama/Roman",
                "2 j 1 m",
                "Hanung Bramantyo",
                "7/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fhabibiainun.jpg?alt=media&token=1b386aa5-9f80-4459-9ae4-c95c2d91d9ea")
        )
        movies.add(
            MovieEntity("6",
                "movie",
                "My Stupid Boss",
                "A woman takes a job as secretary to the bumbling boss of a large company and comes to regret it.",
                "Drama/Comedy",
                "1 j 48 m",
                "Upi Avianto",
                "7.2/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fmystupidbos.jpg?alt=media&token=cbd1f9d8-5fcd-47df-a58b-b75fef1745e1")
        )
        movies.add(
            MovieEntity("7",
                "movie",
                "Negeri 5 Menara",
                "Alif lahir di pinggir Danau Maninjau dan tidak pernah menginjak tanah di luar ranah Minangkabau. Masa kecilnya adalah berburu durian runtuh di rimba Bukit Barisan, bermain bola di sawah berlumpur dan tentu mandi berkecipak di air biru Danau Maninjau. Tiba-tiba saja dia harus naik bus tiga hari tiga malam melintasi punggung Sumatera dan Jawa menuju sebuah desa di pelosok Jawa Timur. Ibunya ingin dia menjadi Buya Hamka walau Alif ingin menjadi Habibie. Dengan setengah hati dia mengikuti perintah Ibunya: belajar di pondok. Di kelas hari pertamanya di Pondok Madani (PM), Alif terkesima dengan \"mantera\" sakti man jadda wajada. Siapa yang bersungguh-sungguh pasti sukses. Dia terheran-heran mendengar komentator sepakbola berbahasa Arab, anak menggigau dalam bahasa Inggris, merinding mendengar ribuan orang melagukan Syair Abu Nawas dan terkesan melihat pondoknya setiap pagi seperti melayang di udara. Dipersatukan oleh hukuman jewer berantai, Alif berteman dekat dengan Raja dari Medan, Said dari Surabaya, Dulmajid dari Sumenep, Atang dari Bandung dan Baso dari Gowa. Di bawah menara masjid yang menjulang, mereka berenam kerap menunggu maghrib sambil menatap awan lembayung yang berarak pulang ke ufuk. Di mata belia mereka, awan-awan itu menjelma menjadi negara dan benua impian masing-masing. Kemana impian jiwa muda ini membawa mereka?",
                "Drama",
                "2 j 15 m",
                "Malik Punjabi",
                "6.9/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fnegeri5menara.jpg?alt=media&token=bbec4bbb-631c-4dee-b0f8-fb6e7a037772")
        )
        movies.add(
            MovieEntity("8",
                "movie",
                "Perempuan Berkalung Sorban",
                "Perempuan Berkalung Sorban merupakan film drama romantis bertema Islam dari Indonesia yang dirilis pada tahun 2009 dan disutradarai oleh Hanung Bramantyo. Film ini dibintangi antara lain oleh Revalina S. Temat, Joshua Pandelaki, Nasya Abigail, Widyawati, Oka Antara, Reza Rahadian, dan Ida Leman",
                "Drama/Roman",
                "2 j 15 m",
                "Hanung Bramantyo",
                "6.7/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fsorban.jpg?alt=media&token=abd3436c-6a2a-4d24-80aa-006ba1939aa8")
        )
        movies.add(
            MovieEntity("9",
                "movie",
                "Wonder Woman 1984",
                "Diana Prince lives quietly among mortals in the vibrant, sleek 1980s -- an era of excess driven by the pursuit of having it all. Though she's come into her full powers, she maintains a low profile by curating ancient artifacts, and only performing heroic acts incognito. But soon, Diana will have to muster all of her strength, wisdom and courage as she finds herself squaring off against Maxwell Lord and the Cheetah, a villainess who possesses superhuman strength and agility.",
                "Adventure/Action",
                "2 j 15 m",
                "Patty Jenkins",
                "5.5/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fwonderwomen.jpg?alt=media&token=02ae078b-0d00-406c-bfec-2ff33114378a")
        )
        movies.add(
            MovieEntity("10",
                "movie",
                "World War Z",
                "Gerry, a former United Nations employee, unexpectedly finds himself in a race against time as he investigates a threatening virus that turns humans into zombies.",
                "Horror/Action",
                "2 j 15 m",
                "Marc Foster",
                "7/10",
                "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fwwz.jpg?alt=media&token=122c1751-b4ac-48f7-b179-c3407b4d5198")
        )
        return movies
    }

    fun generateRemoteDummyMovies():ArrayList<MovieResponse> {

        val movies = ArrayList<MovieResponse>()

        movies.add(
            MovieResponse("1",
                "movie",
            "Asih 2",
            "Teror ASIH (Syarifa Daanish), hantu perempuan malang yang sempat meneror keluarga ANDI (Darius Sinathrya), rupanya belum selesai. Dia kembali datang untuk mengambil anak semata wayang Andi dan Puspita, Amelia. Malam itu, Asih berhasil mengambil Amelia dengan membunuh Andi dan Puspita. Kejadian mengerikan itu disaksikan oleh NENEK (Marini Soerjosoemarno).",
            "Horror",
            "2 j 46 m",
            "Rizal Mantovani",
            "9.1/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fasih2.jpg?alt=media&token=d4e61998-1f7b-4caa-8cbb-64c2a6f4b9cd")
        )
        movies.add(
            MovieResponse("2",
                "movie",
            "Bucin",
            "Merasa bahwa mereka bucin, Jovial (29) mendaftarkan adiknya, Andovi (25), dan teman- temannya , Tommy (24) dan Chandra (26), untuk mengikuti kursus anti-bucin. Tujuan kursus ini adalah untuk mengajarkan cara memiliki hubungan yang sehat dan tidak hanya menguntungkan satu pihak. Kursus ini dibuat oleh Vania (29), seorang lulusan S2 psikologi dengan spesialisasi cinta. Ternyata metode yang digunakan oleh Vania tidak konvensional dan lumayan ekstrim, dia menggunakan konsep ESCAPE ROOM untuk menjelaskan konsep cinta. Sering kali mereka ingin berhenti karena tidak sanggup.",
            "Drama/Komedi",
            "1 j 37 m",
            "Chandra Liow",
            "4/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fbucin.jpeg?alt=media&token=4ec98e59-d11b-4ac4-bd9b-b688fc07cfd9")
        )
        movies.add(
            MovieResponse("3",
                "movie",
            "Dilan 1990",
            "Milea (Vanesha Prescilla) bertemu dengan Dilan (Iqbaal Ramadhan) di sebuah SMA di Bandung. Itu adalah tahun 1990, saat Milea pindah dari Jakarta ke Bandung. Perkenalan yang tidak biasa kemudian membawa Milea mulai mengenal keunikan Dilan lebih jauh. Dilan yang pintar, baik hati dan romantis... semua dengan caranya sendiri. Cara Dilan mendekati Milea tidak sama dengan teman-teman lelakinya yang lain, bahkan Beni, pacar Milea di Jakarta. Bahkan cara berbicara Dilan yang terdengar kaku, lambat laun justru membuat Milea kerap merindukannya jika sehari saja ia tak mendengar suara itu. Perjalanan hubungan mereka tak selalu mulus. Beni, gank motor, tawuran, Anhar, Kang Adi, semua mewarnai perjalanan itu. Dan Dilan... dengan caranya sendiri...selalu bisa membuat Milea percaya ia bisa tiba di tujuan dengan selamat. Tujuan dari perjalanan ini. Perjalanan mereka berdua. Katanya, dunia SMA adalah dunia paling indah. Dunia Milea dan Dilan satu tingkat lebih indah daripada itu.",
            "Roman/Drama",
            "1 j 50 m",
            "Pidi Baiq",
            "7.3/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fdilan.jpg?alt=media&token=f9d2c9aa-333d-49b9-9b72-6e1252de27ee")
        )
        movies.add(
            MovieResponse("4",
                "movie",
            "Frozen 2",
            "Queen Elsa starts hearing a mysterious melodic voice calling to her. Unsettled, she answers it and that awakens the elemental spirits that lead her to a quest to restore an old injustice.",
            "Family/Musical",
            "1 j 43 m",
            "Jennifer Lee",
            "6.9/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Ffrozen2.jpg?alt=media&token=3e181bcd-1ada-42e1-b7a4-63cb2e17cd8c")
        )
        movies.add(
            MovieResponse("5",
                "movie",
            "Habibie & Ainun 3",
            "Kisah Ainun (Maudy Ayunda) sebagaimana remaja di usianya, punya kisah kasih yang cukup unik, menggelitik dan menarik...",
            "Drama/Roman",
            "2 j 1 m",
            "Hanung Bramantyo",
            "7/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fhabibiainun.jpg?alt=media&token=1b386aa5-9f80-4459-9ae4-c95c2d91d9ea")
        )
        movies.add(
            MovieResponse("6",
                "movie",
            "My Stupid Boss",
            "A woman takes a job as secretary to the bumbling boss of a large company and comes to regret it.",
            "Drama/Comedy",
            "1 j 48 m",
            "Upi Avianto",
            "7.2/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fmystupidbos.jpg?alt=media&token=cbd1f9d8-5fcd-47df-a58b-b75fef1745e1")
        )
        movies.add(
            MovieResponse("7",
                "movie",
            "Negeri 5 Menara",
            "Alif lahir di pinggir Danau Maninjau dan tidak pernah menginjak tanah di luar ranah Minangkabau. Masa kecilnya adalah berburu durian runtuh di rimba Bukit Barisan, bermain bola di sawah berlumpur dan tentu mandi berkecipak di air biru Danau Maninjau. Tiba-tiba saja dia harus naik bus tiga hari tiga malam melintasi punggung Sumatera dan Jawa menuju sebuah desa di pelosok Jawa Timur. Ibunya ingin dia menjadi Buya Hamka walau Alif ingin menjadi Habibie. Dengan setengah hati dia mengikuti perintah Ibunya: belajar di pondok. Di kelas hari pertamanya di Pondok Madani (PM), Alif terkesima dengan \"mantera\" sakti man jadda wajada. Siapa yang bersungguh-sungguh pasti sukses. Dia terheran-heran mendengar komentator sepakbola berbahasa Arab, anak menggigau dalam bahasa Inggris, merinding mendengar ribuan orang melagukan Syair Abu Nawas dan terkesan melihat pondoknya setiap pagi seperti melayang di udara. Dipersatukan oleh hukuman jewer berantai, Alif berteman dekat dengan Raja dari Medan, Said dari Surabaya, Dulmajid dari Sumenep, Atang dari Bandung dan Baso dari Gowa. Di bawah menara masjid yang menjulang, mereka berenam kerap menunggu maghrib sambil menatap awan lembayung yang berarak pulang ke ufuk. Di mata belia mereka, awan-awan itu menjelma menjadi negara dan benua impian masing-masing. Kemana impian jiwa muda ini membawa mereka?",
            "Drama",
            "2 j 15 m",
            "Malik Punjabi",
            "6.9/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fnegeri5menara.jpg?alt=media&token=bbec4bbb-631c-4dee-b0f8-fb6e7a037772")
        )
        movies.add(
            MovieResponse("8",
                "movie",
            "Perempuan Berkalung Sorban",
            "Perempuan Berkalung Sorban merupakan film drama romantis bertema Islam dari Indonesia yang dirilis pada tahun 2009 dan disutradarai oleh Hanung Bramantyo. Film ini dibintangi antara lain oleh Revalina S. Temat, Joshua Pandelaki, Nasya Abigail, Widyawati, Oka Antara, Reza Rahadian, dan Ida Leman",
            "Drama/Roman",
            "2 j 15 m",
            "Hanung Bramantyo",
            "6.7/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fsorban.jpg?alt=media&token=abd3436c-6a2a-4d24-80aa-006ba1939aa8")
        )
        movies.add(
            MovieResponse("9",
                "movie",
            "Wonder Woman 1984",
            "Diana Prince lives quietly among mortals in the vibrant, sleek 1980s -- an era of excess driven by the pursuit of having it all. Though she's come into her full powers, she maintains a low profile by curating ancient artifacts, and only performing heroic acts incognito. But soon, Diana will have to muster all of her strength, wisdom and courage as she finds herself squaring off against Maxwell Lord and the Cheetah, a villainess who possesses superhuman strength and agility.",
            "Adventure/Action",
            "2 j 15 m",
            "Patty Jenkins",
            "5.5/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fwonderwomen.jpg?alt=media&token=02ae078b-0d00-406c-bfec-2ff33114378a")
        )
        movies.add(MovieResponse("10",
            "movie",
            "World War Z",
            "Gerry, a former United Nations employee, unexpectedly finds himself in a race against time as he investigates a threatening virus that turns humans into zombies.",
            "Horror/Action",
            "2 j 15 m",
            "Marc Foster",
            "7/10",
            "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgMovie%2Fwwz.jpg?alt=media&token=122c1751-b4ac-48f7-b179-c3407b4d5198"))
        return movies
    }

    fun generateDummyTvShows(): ArrayList<MovieEntity> {

        val movies = ArrayList<MovieEntity>()

        movies.add(
                MovieEntity("TV1",
                "tv-show",
        "The Queens Gambit",
        "The Queen's Gambit bercerita tentang Beth Harmon (Anya Taylor-Joy), seorang perempuan muda di era 1950an yang menemukan bakatnya di bidang catur saat tinggal di sebuah panti asuhan di Kentucky. Ia kemudian mengembangkan bakatnya hingga menjadi seorang pecatur berskill tinggi. Bukan hal mudah apalagi dunia catur pada masa itu didominasi oleh laki-laki. Sementara di sisi lain, ia juga harus bertarung dengan kecanduannya terhadap narkotika dan memori buruk yang terus menghantuinya.",
        "Drama",
        "1 s, 7 eps",
        "Rizal Mantovani",
        "9.1/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Fqueen.png?alt=media&token=4e2d9dbd-0e26-4502-b32d-0167e6b46b27")
        )
        movies.add(
                MovieEntity("TV2",
                "tv-show",
        "Money Heist",
        "Money Heist bercerita tentang sekelompok orang yang melakukan perampokan terhadap Royal Mint, sebuah gedung di kota Madrid yang memproduksi uang di Spanyol. Berkat kejeniusan Professor, sang otak perampokan, rencana mereka tampak berjalan baik dan polisi seperti tak punya taji di hadapan mereka, sampai hal-hal di luar kendali terjadi dan membuat mereka terpojok.",
        "Drama/Thriller",
        "4 s, 23 eps",
        "Chandra Liow",
        "4/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Fmoney%20heist.jpg?alt=media&token=e877b5f3-d25f-421d-888a-ff9251bda596"
                ))
        movies.add(
                MovieEntity("TV3",
                "tv-show",
        "Peaky Blinders",
        "Serial Netflix yang banyak dipuji ini bercerita tentang sebuah geng bernama Peaky Blinders, yang berkuasa di Birmingham, Inggris, pada periode tahun 1919. Dipimpin oleh Tommy Shelby, yang berkarisma, cerdik, dan sangat ambisius, Peaky Blinders mendapat tantangan ketika Chester Campbell, seorang Detective Chief Inspector Royal Irish Constabulary dikirim oleh Winston Churchill untuk kota Birmingham dari kriminal.",
        "Drama/Criminal",
        "5 s, 30 eps",
         "Pidi Baiq",
        "6.9/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Fpeaky.jpg?alt=media&token=c530dc14-5f26-4630-9dd4-293c698cb1d8"
                ))
        movies.add(
                MovieEntity("TV4",
                "tv-show",
        "LUPIN",
        "Jika kamu menyukai serial perampokan dengan trik-trik yang luar biasa dan bagaimana perampokan itu direncanakan, Lupin adalah serial yang tepat untuk kamu. Bercerita tentang Assane Diop, seorang anak imigran dari Senegal yang menjadi yatim sejak ayahnya bunuh diri karena dituduh mencuri perhiasan majikannya. Assane besar lalu merencanakan perampokan maha sulit yang bikin serial ini menjadi seru.",
        "Drama/Comedy",
        "1 s, 5 eps",
        "Jennifer Lee",
        "6.9/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Flupin.jpg?alt=media&token=e01d0c3e-bb4e-4831-af85-e405b58be267"
        )
        )
        movies.add(
                MovieEntity("TV5",
                "tv-show",
        "Master of Nove",
        "Serial Netflix yang diproduseri dan dibintangi oleh komedian Aziz Ansari ini bercerita tentang Dev Shah, seorang aktor di New York yang harus melalui berbagai rintangan dalam kehidupan pribadi maupun profesionalnya, dari pengalamannya sebagai imigran sampai hal remeh temeh sehari-hari.",
        "Drama/Comedy",
        "2 s, 20 eps",
        "Hanung Bramantyo",
        "7/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Fmaster.jpeg?alt=media&token=1236547b-b840-4116-b91b-15763ad2e983"
        )
        )
        movies.add(
                MovieEntity("TV6",
                "tv-show",
        "The Umbrella Academy",
        "Kalau suka serial superhero yang enggak biasa, The Umbrella Academy bisa jadi salah satu favoritmu. Bercerita tentang 7 anak Sir Reginald Hargreeves, yang memiliki kekuatan super dan tergabung dalam kelompok bernama The Umbrella Academy. Mereka diharapkan bisa menjadi penyelamat dunia, meski belakangan, justru ikut berkontribusi terhadap akan datangnya kiamat bagi dunia.",
        "Action/Adventure",
        "1 j 48 m",
        "Upi Avianto",
        "7.2/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Fumbrella.jpg?alt=media&token=affc07c1-10d9-4b33-a0de-cfb74b257086"
        )
        )
        movies.add(
                MovieEntity("TV7",
                "tv-show",
        "Mindhunter",
        "Mindhunter bercerita tentang dua agen FBI, Holden Ford (Jonathan Groff) dan Bill Tench (Holt McCallany) yang harus mewawancarai beberapa pembunuh berantai bersama psikolog Wendy Carr untuk memahami cara mereka berpikir, agar bisa menggunakan pengetahuan ini untuk menyelesaikan berbagai kasus.",
        "Drama/Thriller",
        "2 s, 19 eps",
        "Malik Punjabi",
        "6.9/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Fmindhunter.jpg?alt=media&token=180366d9-ddf0-41cd-b19b-13b6650ab7d7"
        )
        )
        movies.add(
                MovieEntity("TV8",
                "tv-show",
        "Russian Doll",
        "Russian Doll bercerita tentang Nadia Vulkovov, seorang pengembang video game yang berulang kali mati dan hidup lagi di sebuah malam ketika sedang menghadiri sebuah pesta - dalam lingkaran takdir yang tampak tidak ada ujungnya. Nadia kemudian berusaha untuk mencari tahu bagaimana cara menghentikan nasib ini. Ia kemudian bertemu dengan Alan Zaveri, yang ternyata bernasib sama.",
        "Drama/Roman",
        "1 s, 8 eps",
        "Hanung Bramantyo",
        "6.7/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Fdoll.jpg?alt=media&token=d0d23271-cd59-4d77-abd8-78e289be9876"
        )
        )
        movies.add(
                MovieEntity("TV9",
                "tv-show",
        "Unbreakable Kimmy Schmidt",
        "Serial Netflix dengan gaya sitcom ini bercerita tentang Kimmy Schmidt, seorang perempuan berusia 29 tahun yang ingin memulai hidupnya yang baru setelah selamat dari sebuah kelompok cult, di mana ia diculik dan terpenjara selama 15 tahun. Kimmy kemudian pindah ke New York untuk hidup yang baru, dan bertemu dengan banyak orang baru yang mewarnai hidupnya.",
        "Sitcom",
        "4 s, 52 eps",
        "Patty Jenkins",
        "5.5/10",
        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Fkimmy.jpg?alt=media&token=3788d8e9-55e0-44fd-8db6-14c81b760052"
        )
        )
        movies.add(
                MovieEntity("TV10",
                        "tv-show",
                        "Unbreakable Kimmy Schmidt",
                        "Drama Korea Netflix pertama ini bercerita tentang Korea di masa Kerajaan Joseon, di mana Putra Mahkota Lee Chang (Ju Ji-hoon) mencurigai telah terjadi sesuatu pada ayahnya, Raja Joseon, dan ditutup-tutupi oleh Keluarga Kerajaan lain yang dikuasai oleh klan Haewon Cho. Investigasinya kemudian membawanya ke sebuah wabah besar yang terjadi karena ambisi politik klan Haewon Cho, dan mengakibatkan puluhan ribu rakyat Joseon menjadi zombie.",
                        "Sitcom",
                        "4 s, 52 eps",
                        "Patty Jenkins",
                        "5.5/10",
                        "https://firebasestorage.googleapis.com/v0/b/solve-ur-shape.appspot.com/o/imgTv%2Fkingdom.png?alt=media&token=39134509-e892-4da1-ab86-e76800f71181"
                )
        )
        return movies
    }
}