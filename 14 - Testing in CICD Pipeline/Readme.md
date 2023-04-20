Testing in CI/CD Pipeline

CI/CD adalah esensi dari DevOps yaitu penghubung antara tim developer dan tim operations dalam melakukan integrasi kode, pengujian / testing, dan perilisan aplikasi secara otomatis. CI/CD terbagi menjadi 3 tahap yaitu Continuous Integration (CI), Continuous Delivery (CD), dan Continuous Deployment. 

‍

Continuous Integration (CI) adalah proses penggabungan atau pengintegrasian kode yang telah dibuat oleh sejumlah tim developer ke dalam repositori kode, untuk kemudian dijalankan pengujian secara otomatis dan berkelanjutan. Pengujian otomatis pada CI bertujuan untuk memeriksa dan memastikan software dapat berjalan sesuai algoritma kode yang semestinya. 

‍

Continuous Delivery (CD) adalah proses lanjutan dari CI yang mempersiapkan perubahan kode ke deploy staging atau tahap pra produksi setelah proses pembuatan secara manual. Kode yang masuk pada CD harus lulus pengujian unit otomatis, pengujian integrasi, dan pengujian sistem. Ketika kode sudah lulus pada tahap stagging, akan diteruskan ke proses selanjutnya yaitu Deployment. 

Continuous Deployment (CD) adalah step terakhir yang jauh lebih canggih daripada Continuous Delivery, yaitu proses deploy production (lingkungan produksi) secara otomatis dari pipeline tanpa campur tangan manusia atau manual. Setelah lulus testing dari tahap staging sebelumnya, kode akan otomatis ter-deploy ke production. 

Fungsi CI/CD Pipeline
Secara garis besar CI/CD Pipeline berguna untuk:

Mempercepat proses rilis produk karena penggabungan kode terjadi secara continu
Mendeteksi bug lebih dini lewat tools CI secara otomatis
Memperoleh feedback lebih cepat sekaligus mendeteksi eror pada proses testing
Transparansi / visibilitas yang lebih jelas untuk mendeteksi kerusakan pada software dan mengontrol perubahan.
