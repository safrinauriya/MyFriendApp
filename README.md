# MyFriendApp
Aplikasi MyFriendApp adalah aplikasi yang dapat menyimpan data teman dan menampilkannya dalam tampilan list. 
Pada aplikasi MyFriendApp memuat:
- [x] Penyimpanan data (database) lokal, yaitu Room
- [x] Komponen view yaitu FloatingActionButton dan RecyclerView
- [x] Penggunaan Fragment
## Penyimpanan Data 
Penyimpanan data digunakan untuk menyimpan data teman antara lain, nama, jenis kelamin, nomor telepon, email, dan alamat menggunakan database lokal (Room) dengan menggunakan Data Class. Pada aplikasi MyFriendApp, data class digunakan untuk menampung data diri teman yang kemudian akan ditampilkan dalam tampilan list pada RecyclerView. Untuk menampilkan data dalam tampilan list pada RecyclerView, dibutuhkan sebuah class RecyclerView Adapter.
## Floating Action Button
Floating Action Button (FAB) adalah komponen View dari Material Design berupa Button
Floating (mengambang) berbentuk lingkaran. Floating Action Button terdapat pada Android Design Support Library, Floating Action Button pada aplikasi android, berbentuk lingkaran dan akan terlihat seakan mengambang pada Layout atau Activity. Floating Action Button digunakan sebagai indikator utama pada sebuah aplikasi.
[Baca Selengkapnya..]( https://developer.android.com/guide/topics/ui/floating-action-button)
## Fragment 
Fragment adalah class yang pada umumnya digunakan untuk kebutuhan menampilkan
lebih dari satu fitur pada satu halaman. Dengan menggunakan fragment kita dapat membuat banyak tampilan tanpa berpindah-pindah activity. Selain itu kita juga dapat memakai satu fragment dalam banyak Activity sekaligus. 

Fragment biasanya dibuat sebagai bagian dari suatu antarmuka. Sebuah fragment harus berada di dalam sebuah activity, mereka tidak dapat berjalan sendiri tanpa adanya activity tempat mereka menempel. Fragment dapat dipakai berulang kali didalam activity. Penggunaan Komponen View dan Logic Berulang Kali pada Fragment dapat dipakai untuk menampilkan data atau melakukan event tertentu dibeberapa activity berbeda. 
[Baca Selengkapnya..]( https://developer.android.com/guide/components/fragments)

## Tampilan awal belum ada data yang dimasukkan
Pada tampilan awal, masih belum ada data yang tersimpan maka hanya terdapat halaman kosong, untuk menambahkan data teman klik tombol "+" pada pojok kanan bawah. 
![Screenshot_20201016-200434_MyFriendApp](https://user-images.githubusercontent.com/60589670/96273894-14321800-0ffa-11eb-8050-1b8b2f231d91.jpg)
## Tampilan form pengisian data teman 
Setelah menekan tombol "+", maka akan terdapat tampilan form untuk menambahkan teman. Jika data telah diisi seluruhnya tekan simpan.
![Screenshot_20201016-200915_MyFriendApp](https://user-images.githubusercontent.com/60589670/96273951-23b16100-0ffa-11eb-884d-fc59bac66b71.jpg)
## Tampilan peringatan jika form kosong 
Jika terdapat format yang kosong, maka akan muncul peringatan pada format yang belum terisi. Data berhasil tersimpan jika form terisi seluruhnya.
![Screenshot_20201016-201408_MyFriendApp](https://user-images.githubusercontent.com/60589670/96274149-66733900-0ffa-11eb-81a4-8cc26e970a53.jpg)
##Tampilan list data teman 
Setelah menekan tombol simpan, jika data berhasil tersimpan maka akan muncul list data yang baru ditambahkan.
![Screenshot_20201016-201352_MyFriendApp](https://user-images.githubusercontent.com/60589670/96274446-b18d4c00-0ffa-11eb-809c-54668e033af2.jpg)
Terima kasih:)))
