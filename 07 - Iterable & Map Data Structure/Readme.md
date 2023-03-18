Iterable
Objek yang bisa di iterasi adalah sebuah generalisasi dari sebuah array. Konsep itu membolehkan kita untuk membuat objek apapun yang bisa digunakan didalam perulangan for..of.

Tentu saja, Array bisa di iterasi. Tapi disana terdapat objek bawaan (built-in objek) lainnya, yang tentu saja bisa di iterasi. Contoh string juga bisa di iterasi.

Jika sebuah objek secara teknis bukan sebuah array, tapi representasi dari sebuah koleksi (list, set) dari sesuatu, lalu for..of adalah sintaks yang bagus untuk melakukan perulangan didalamnya, Jadi ayo kita lihat bagaimana cara membuat itu bekerja.


Map adalah sebuah koleksi dari elemen-elemen yang ada pada JavaScript yang tiap elemen ini disimpan sebagai pasangan KV (key, value). Hal ini memungkinkan untuk objek pada JavaScript Map untuk untuk menahan objek dan nilai primitif sebagai kunci atau nilainya. Elemen dalam objek Map dilakukan iterasi dalam urutan penyisipan.

Saat melakukan iterasi pada objek Map, kunci, pasangan nilai dikembalikan dalam urutan yang sama seperti yang disisipkan, yaitu mengingat urutan penyisipan asli. Syntax umum yang digunakan untuk membuat objek Map JavaScript adalah:

new Map([it])

Syntax ini adalah objek yang dapat diiterasi. Value yang berkaitan dengan hal yang sama disimpan sebagai pasangan key value. Jika tidak ditentukan maka objek  Map pada JavaScript yang baru akan dibuat atau dibiarkan kosong. Setiap nilai ‘null’ diperlakukan sebagai nilai tidak ditentukan.
Metode map() berfungsi untuk membuat array baru dengan hasil dari memanggil sebuah fungsi dari setiap elemen array.  Metode memanggil map() menyediakan satu fungsi untuk setiap elemen di setiap array dalam order. Perlu diingat bahwa map() tidak mengeksekusi fungsi untuk elemen array tanpa value.
