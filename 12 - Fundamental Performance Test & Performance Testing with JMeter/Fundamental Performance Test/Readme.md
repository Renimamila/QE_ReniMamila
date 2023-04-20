Fundamental Performance Test

Fundamental Performance Test adalah pengujian non-functional yang dilakukan untuk mengetahui behavior atau performa dari sebuah sistem saat dihadapkan pada situasi yang bervariasi sehingga dapat menghindari kegagalan sistem seperti contohnya system down.

Tes dikatakan baik apabila dapat memberikan data yang terkait dengan tepat. Tes yang dimaksud adalah tes yang memenuhi syarat validitas, reliabilitas, objektivitas, diskriminitas, dan praktibilitas. Validitas menggambarkan kemampuan tes dalam mengukur apa yanng ingin di ukur.

Jenis - Jenis Performance Test
Load Testing
Jenis tes ini akan dilakukan dengan menentukan target load. Biasanya digunakan untuk persiapan menghadapi sebuah event musiman yang trafiknya bertambah seiring waktu. Contohnya sistem kita kan melakukan penjualan mudik lebaran. Tentunya semakin mendekati waktu lebaran, maka ekpektasinya sistem akan menerima trafik yang lebih banyak. Jadi, dengan melakukan load testing kita akan mengatahui apakah sistem kita sanggup handle trafik sesuai ekspektasi kita.

Load testing biasanya dilakukan dengan scalability testing juga, yaitu menaikkan load perlahan - lahan pada setiap skenarionya, kemudian memonitor penggunaan resourcenya apakah ada perbedaan yang signifikan atau tidak. Contohnya: penggunaan CPU dan memory atau melihat bagaimana behaviour sistem ketika scale up atau scale down apakah telat atau terlalu cepat melakukan scaling.

Spike Testing
Load dan spike testing adalah hal yang mirip, keduanya bertujuan untuk mengetahui apakah sistem mampu handle trafik sesuai ekspektasi. Bedanya, sesuai namanya, spike testing dilakukan dengan mengirim load secara mendadak dalam waktu yang bersamaan. Contoh case yang bisa digunakan adalah event pengisian KRS di kampus atau pendaftaran penerimaan CPNS dimana trafik yang datang akan cenderung mendadak pada tanggal dan waktu yang sama.

Stress Testing
Saya lebih suka menyebutnya capacity testing, yaitu melakukan tes dengan load diluar ekspektasi hingga sistem tidak mampu lagi handle trafiknya. Tujuannya jelas, untuk mengetahui kapasitas sistem yang sedang berjalan.

Soak Testing
Saya lebih suka menyebutnya endurance testing dimana kita akan melakukan tes dengan load yang normal, namun dalam waktu yang panjang. Tujuannya untuk melakukan analisa dan evaluasi behaviour sistem kita. Biasanya digunakan untuk mengetahui apakah sistem akan mengalami memory leaks pada penggunaan jangka panjang. Apa itu memory leaks  dan  bagaimana impact terhadap performa? Kita akan membahas pada artikel terpisah.
