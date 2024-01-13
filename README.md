# Mitoha Chips Order and Delivery


Aplikasi ini bernama Aplikasi Mitohachips. Aplikasi ini merupakan aplikasi simulasi untuk pemesanan produk-produk dari usaha yang sedang saya jalankan (Mitoha Chips), berikut ini adalah beberapa tampilan yang ada pada aplikasi ini.


> [!NOTE]
> Aplikasi ini merupakan final task untuk mata kuliah Mobile programing yang dibuat berdasarkan video youtube yang di share pada wa group. yang dibuat oleh Ody Octora Wijaya dengan nim 41520110009.

![Mitohachips Order and Delivery demo](https://github.com/jajakasunda/kangody-tb2-mobileprog/assets/23520340/96954524-46e4-4633-a6b9-aa0aef272e81)


## Fitur
Untuk saat ini fitur yang sudah ada adalah:
1. Fitur untuk pilihan menu/product pada Main Activity dengan menggunakan widget Scrollview dan Recylerview membuat aplikasi ini terlihat lebih hidup, Kedua widget tersebut diterapkan pada Category Menu dan Menu Popular.
2. Ketika kita memilih produk yang akan di masukan ke keranjang aplikasi akan mengarahkan kedalam detail produk dimana kita bisa menentukan jumlah kuantiti yang akan di masukan ke dalam cart. ketika kita mengklik tombol "Add to Cart" sistem akan menampilkan popup pesan "Added to your cart".
3. Fitur pada menu My Cart (Icon Keranjang) kita dapat melakukan perubahan jumlah dari pesanan yang akan kita checkout.

> [!note]
> Untuk fitur selanjutnya adalah fitur untuk proses checkout masih dalam pengembangan.


## Modul
Modul-modul yang terdapat dalam aplikasi ini diantaranya:
| Modul   | Fungsi | Deskripsi   |
|--------|------|--------|
| IntroActivity  | startBtn | Tampilan pertama saat aplikasi di jalankan|
| MainActivity    | recyclerViewCategory, recyclerViewPopular & bottomNavigation   | Menampilkan Halaman utama produk|
| ShowDetailAcity| plusBtn, minusBtn, addToCartBtn | Modul yang berfungsi untuk melihat Detail produk dari mitohachips dan menambahkannya ke dalam cart atau keranjang |
| CartListActivity| onCreate, bottomNavigation, initView, initList, CalculateCart | Modul yang berfungsi untuk melihat Detail dan merubah pesanan yang sudah dimasukan kedalam keranjang dan kalkulasi total belanja |

## Stack
Aplikasi ini terdapat beberapa komponen aplikasi diantaranya:
 - XML : XML (eXtensible Markup Language) Bahasa markah yang digunakan untuk menyimpan dan mentransfer data terstruktur. Digunakan untuk konfigurasi atau Desain tampilan pada aplikasi ini.
 - TinyDb : Sebuah basis data kecil atau penyimpanan data yang bersifat minimalis, atau ini bisa juga merujuk pada sebuah sistem basis data, yang digunakan sebagai penyimpanan data kecil atau sebagai elemen pengelolaan data dalam aplikasi.
 - Java : Bahasa pemrograman yang digunakan untuk pengembangan aplikasi lintas platform.
![Stack](https://github.com/jajakasunda/kangody-tb2-mobileprog/assets/23520340/b2028cd5-f6da-48c9-940f-ab59025006d5)



## Cara Mengeksport Project Ke Android Studio
Untuk mencoba aplikasi ini silahkan ikuti langkah-langkah berikut ini:
1. Download Zip dari project ini pada menu Code
2. Simpan File Zip yang akan di download
3. Setelah proses download selesai, silahkan extract seluruh file yang ada didalam file Zip tersebut
4. Setelah proses unzip selesai, Buka aplikasi android studio
5. pada Layar tampilan awal aplikasi android studio (Welcome Page), Silahkan Klik menu titik bintang di pojok kanan Pilih Menu Import Project
6. Arahkan ke Project Folder tempat kita mengekstrak file zip tadi,
7. Masuk dan arahkan kedalam subfolder yang di ekstract
8. Terdapat dua folder .idea dan folder project ( pilih folder kangody-tb2-mobileprog-main) 
9. Kemudian klik OK
