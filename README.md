# BIODATA
NAMA   : Muhammad Riswan Badali<br>
NPM    : 2210010039<br>
Kelas  : REG PAGI 5B BJB<br>

# UJIAN AKHIR SEMESTER (UAS)
1. Bentuk ujian akhir semester (UAS) adalah tugas besar berupa pembuatan proyek aplikasi.
2. Buat aplikasi java berbasis GUI yang mengakses database MySQL. Fitur utama dari aplikasi adalah kemampuan untuk CRUD (create, read (listing), update, delete) data dari database MySQL dan fitur transaksi serta reporting, Gunakan lebih dari satu tabel (Terdapat minimal 2 tabel master, Terdapat minimal 1 tabel transaksi, dan Terdapat mininal 2 laporan).
3. Pilih aplikasi dari list di bawah (sesuaikan digit terakhir NPM) :
    - Aplikasi Penjualan Buku (1).
    - Aplikasi Pendaftaran Siswa (PPDB) (2).
    - Aplikasi Pengelolaan KRS (3).
    - Aplikasi Penjualan Tiket Pesawat (4).
    - Aplikasi Inventaris Aset (5).
    - Aplikasi Objek Wisata (6).
    - Aplikasi Rental Mobil (7).
    - Aplikasi Gudang (8).
    - Aplikasi Kepegawaian (9).
    - Aplikasi Penyewaan PC (0).
4. Unggah source project netbeans dan file dump database MySQL (.sql) ke Github dengan format nama repository Nama-NPM-TB.
5. Unggah video kalian mempresentasikan (demo) program tersebut dengan durasi maksimal 10 menit.
6. Kirimkan tautan repository Github dan tautan video tersebut ke e-learning.

# APLIKASI YANG SAYA BUAT
Dengan NPM 2210010039 maka saya pada UAS kali ini membuat Aplikasi Kepegawaian.

# FITUR PADA APLIKASI YANG SAYA BUAT (APLIKASI KEPEGAWAIAN)
- Pada menu utama terdapat 4 button yaitu Button Master Pegawai, Button Master Jabatan, Button Transaksi Absen, dan Button Laporan. Ketika button di tekan maka akan mengarah ke halaman yang ingin di pilih.
- Form Master Pegawai.
    - Ketika pengguna menekan Button Master Pegawai maka akan masuk ke form pegawai.
    - Terdapat inputan nama, inputan tanggal lahir yang dapat langsung dipilih, inputan jabatan yang dapat dipilih sesuai yang telah di inputkan pada form jabatan, inputan No Telepon yang hanya dapat di isi dengan angka dengan maksimal 14 digit, dan inputan alamat.
    - Ada button tambah yang mana ketika di tekan maka semua inputan harus terisi semua, jika tidak maka akan muncul sebuah peringatan. Setelah inputan terisi semua lalu menekan button tambah maka muncul pesan sukses, dan segala inputan akan masuk ke tabel, dan kolom inputan akan otomatis kosong.
    - Ada button edit untuk melakukan perubahan data, dengan cara menekan salah satu data yang ingin dirubah pada tabel terlebih dahulu, data akan masuk kembali ke inputan dan lalukan perubahan, muncul juga sebuah konfirmasi.
    - Ada button hapus untuk menghapus data, dengan cara menekan salah satu data yang ada pada tabel terlebih dahulu, muncul juga sebuah konfirmasi.
    - Ada button bersih untuk membersihkan semua kolom inputan.
    - Terdapat inputan untuk mecari pegawai berdasarkan nama pegawai, dengan cara langsung saja menginputkan nama yang akan dicari maka langsung tampil pada tabel.
    - Terdapat satu tabel untuk menampung segala inputan.
    - Terdapat satu button lagi untuk kembali ke menu utama.
- Form Master Jabatan
    - Ketika pengguna menekan Buttun Master Jabatan maka akan masuk ke form jabatan.
    - Terdapat inputan nama jabatan dan gaji pokok yg hanya dapat di isi dengan angka.
    - Ada button tambah yang mana ketika di tekan maka semua inputan harus terisi semua, jika tidak maka akan muncul sebuah peringatan. Setelah inputan terisi semua lalu menekan button tambah maka muncul pesan sukses, dan segala inputan akan masuk ke tabel, dan kolom inputan akan otomatis kosong.
    - Ada button edit untuk melakukan perubahan data, dengan cara menekan salah satu data yang ingin dirubah pada tabel terlebih dahulu, data akan masuk kembali ke inputan dan lalukan perubahan, muncul juga sebuah konfirmasi.
    - Ada button hapus untuk menghapus data, dengan cara menekan salah satu data yang ada pada tabel terlebih dahulu, muncul juga sebuah konfirmasi.
    - Ada button bersih untuk membersihkan semua kolom inputan.
    - Terdapat inputan untuk mecari jabatan berdasarkan nama jabatan, dengan cara langsung saja menginputkan nama jabatan yang akan dicari maka langsung tampil pada tabel.
    - Terdapat satu tabel untuk menampung segala inputan.
    - Terdapat satu button lagi untuk kembali ke menu utama.
- Form Transaksi Absensi
    - Ketika pengguna menekan Buttun Transaksi Absen maka akan masuk ke form absensi.
    - Terdapatn inputan pilih pegawai yang dapat dipilih sesuai yang telah di inputkan pada form pegawai, inputan tanggal yang dapat langsung dipilih, dan terdapat inputan status kehadiran yang dapat dipilh (Hadir, Izin, Sakit).
    - Ada button tambah yang mana ketika di tekan maka semua inputan harus terisi semua, jika tidak maka akan muncul sebuah peringatan. Setelah inputan terisi semua lalu menekan button tambah maka muncul pesan sukses, dan segala inputan akan masuk ke tabel, dan kolom inputan akan otomatis kosong.
    - Ada button edit untuk melakukan perubahan data, dengan cara menekan salah satu data yang ingin dirubah pada tabel terlebih dahulu, data akan masuk kembali ke inputan dan lalukan perubahan muncul juga sebuah konfirmasi.
    - Ada button hapus untuk menghapus data, dengan cara menekan salah satu data yang ada pada tabel terlebih dahulu, muncul juga sebuah konfirmasi.
    - Ada button bersih untuk membersihkan semua kolom inputan.
    - Terdapat inputan untuk mecari pegawai berdasarkan nama pegawai yang ada pada tabel form absensi, dengan cara langsung saja menginputkan nama pegawai yang akan dicari maka langsung tampil pada tabel.
    - Terdapat satu tabel untuk menampung segala inputan.
    - Terdapat satu button lagi untuk kembali ke menu utama.
- Form Laporan
    - Ketika pengguna menekan Button Laporan maka akan masuk ke form laporan.
    - Terdapat panel absensi yang mana didalamnya ada inputan bulan yang dapat dipilih langsung dan inputan tahun yang dapat dipilih langsung juga.
    - Ada button Periksa Laporan Absensi Bulanan, ketika ditekan maka akan menampilkan id pegawai, nama, total kehadiran, total izin, dan total sakit pada tabel. Ketika button di tekan tetapi inputan masih kosong maka akan menampilakn sebuah pesan.
    - Terdapat panel pegawai dan gaji, yang mana didalamnya ada button Laporan Pegawai dan Gaji, Ketika ditekan maka anakan menampilkan Nama pegawai, Nama jabatan, dan gaji pokok pada tabel.
    - Ada satu tabel untuk menampilkan segala informasi ketika button Periksa Laporan Absensi Bulanan dan button Laporan Pegawai dan Gaji ditekan.
    - Ada button Reset unutuk membersihkan inputan dan tabel. Juga menampilkan pesan berhasil melakukan reset setelah menekannya.
    - Ada button untuk kembali ke menu utama. 
# TAMPILAN APLIKASI YANG DIBUAT (APLIKASI KEPEGAWAIAN)
A. Tampilan awal aplikasi.<br>
   <img width="545" alt="image" src="https://github.com/user-attachments/assets/dbea08f5-295e-49f2-8c95-2cc050d60228" /><br>
    1. Tampilan setelah menekan button master pegawai.<br>
       <img width="698" alt="image" src="https://github.com/user-attachments/assets/d80d1651-ab58-4211-ba20-974515360b1c" /><br>
    2. Tampilan setelah menekan button tambah tetapi masih ada kolom inputan yang belum terisi.<br>
       <img width="693" alt="image" src="https://github.com/user-attachments/assets/bf39e748-0746-4038-a037-de9042b3209b" /><br>
4. Tampilan setelah menekan button tambah dan berhasil.<br>
   <img width="694" alt="image" src="https://github.com/user-attachments/assets/24c20a3f-617d-4944-8710-a51801d96115" /><br>
5. Tampilan Ketika memasukkan hurup pada inputan no telepon.<br>
   <img width="695" alt="image" src="https://github.com/user-attachments/assets/c39a2326-7017-4893-8f88-efb9dbbb25bd" /><br>
6. Tampilan Setelah melakukan perubahan dengan menekan button edit.<br>
   <img width="697" alt="image" src="https://github.com/user-attachments/assets/2978d3dd-c614-491d-b039-1ced46039fe9" /><br>
7. Tampilan Setelah menekan button hapus.<br>
   <img width="697" alt="image" src="https://github.com/user-attachments/assets/fdc2fb30-458e-4508-83b1-82dd4539939b" /><br>
   - Dilanjutkan menekan konfimasi "yes".<br>
     <img width="195" alt="image" src="https://github.com/user-attachments/assets/4a6610c1-e84d-474d-ae4b-687eaa14da1f" /><br>
8. Tampilan melakukan pencarian.<br>
   <img width="698" alt="image" src="https://github.com/user-attachments/assets/846e03dc-30a8-4271-a8df-283631e66d3b" /><br>
9. Tampilan setelah menekan button master jabatan.<br>
   <img width="552" alt="image" src="https://github.com/user-attachments/assets/37186dd1-cd14-4a48-be05-a648c9aa4e84" /><br>
10. Tampilan setelah menekan button tambah tetapi masih ada kolom inputan yang belum terisi.<br>
   <img width="552" alt="image" src="https://github.com/user-attachments/assets/64be96f6-8356-432e-a531-66fc5c41f11e" />




   
