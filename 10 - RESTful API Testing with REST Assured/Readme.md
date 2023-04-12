Rest Assured adalah teknologi open source yang sangat banyak digunakan untuk Pengujian Otomasi REST API, ini didasarkan pada perpustakaan berbasis java.

Rest Assured berinteraksi dengan Rest API dalam mode klien tanpa kepala, kita dapat meningkatkan permintaan yang sama dengan menambahkan lapisan yang berbeda untuk membentuk permintaan dan membuat permintaan HTTP melalui kata kerja HTTPS yang berbeda ke server.

Validasi respons rest API :
1. Menangkap respons JSON dari permintaan API.
2. Kueri untuk circuitId menggunakan ekspresi GPath "MRData.CircuitTable.Circuits.circuitId"
3. Memverifikasi bahwa kumpulan elemen circuitId memiliki ukuran 20

RESTful API hanya mendukung dua jenis parameter:
A. Parameter kueri: Di sini parameter ditambahkan di akhir titik akhir API dan dapat diidentifikasi dengan tanda tanya dan membentuk pasangan nilai kunci seperti 
https://www.google.com/search?q=https://www.wikipedia.org/
Di sini, di API di atas 'q' adalah parameter dan 'https://www.wikipedia.org/' adalah nilai parameter itu, jika kita mencari 'SOMETHING_ELSE_TEXT'kita bisa mengganti nilai parameter 'q' dengan 'SOMETHING_ELSE_TEXT'menggantikan https://www.wikipedia.org/.

B. Parameter jalur: Ini adalah bagian dari titik akhir RESTful API. 
misalnya. endpoint yang kita gunakan sebelumnya: http://ergast.com/api/f1/2017/circuits.json, di sini "2017" adalah nilai parameter jalur.
