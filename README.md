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
    - Terdapat inputan pilih pegawai yang dapat dipilih sesuai yang telah di inputkan pada form pegawai, inputan tanggal yang dapat langsung dipilih, dan terdapat inputan status kehadiran yang dapat dipilh (Hadir, Izin, Sakit).
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
1. Tampilan awal aplikasi.<br>
   <img width="545" alt="image" src="https://github.com/user-attachments/assets/dbea08f5-295e-49f2-8c95-2cc050d60228" /><br>
2. Tampilan setelah menekan button master pegawai.<br>
   <img width="698" alt="image" src="https://github.com/user-attachments/assets/d80d1651-ab58-4211-ba20-974515360b1c" /><br>
3. Tampilan setelah menekan button tambah tetapi masih ada kolom inputan yang belum terisi.<br>
   <img width="693" alt="image" src="https://github.com/user-attachments/assets/bf39e748-0746-4038-a037-de9042b3209b" /><br>
4. Tampilan setelah menekan button tambah dan berhasil.<br>
   <img width="694" alt="image" src="https://github.com/user-attachments/assets/24c20a3f-617d-4944-8710-a51801d96115" /><br>
5. Tampilan Ketika memasukkan hurup pada inputan no telepon.<br>
   <img width="695" alt="image" src="https://github.com/user-attachments/assets/c39a2326-7017-4893-8f88-efb9dbbb25bd" /><br>
6. Tampilan Setelah melakukan perubahan dengan menekan button edit.<br>
   <img width="697" alt="image" src="https://github.com/user-attachments/assets/2978d3dd-c614-491d-b039-1ced46039fe9" /><br>
7. Tampilan Setelah menekan button hapus.<br>
   <img width="697" alt="image" src="https://github.com/user-attachments/assets/fdc2fb30-458e-4508-83b1-82dd4539939b" /><br>
   - Dilanjutkan menekan konfimasi "yes" lalu "Ok", maka data akan terhapus pada tabel.<br> 
     <img width="195" alt="image" src="https://github.com/user-attachments/assets/4a6610c1-e84d-474d-ae4b-687eaa14da1f" /><br>
8. Tampilan melakukan pencarian.<br>
   <img width="698" alt="image" src="https://github.com/user-attachments/assets/846e03dc-30a8-4271-a8df-283631e66d3b" /><br>
9. Tampilan setelah menekan button Master Jabatan.<br>
   <img width="552" alt="image" src="https://github.com/user-attachments/assets/37186dd1-cd14-4a48-be05-a648c9aa4e84" /><br>
10. Tampilan setelah menekan button tambah tetapi masih ada kolom inputan yang belum terisi.<br>
    <img width="552" alt="image" src="https://github.com/user-attachments/assets/64be96f6-8356-432e-a531-66fc5c41f11e" /><br>
11. Tampilan Ketika memasukkan hurup pada inputan gaji pokok.<br>
    <img width="556" alt="image" src="https://github.com/user-attachments/assets/4d32d8e2-c783-47d2-b5cf-d88a34ad2ac5" /><br>
12. Tampilan setelah menekan button tambah dan berhasil.<br>
    <img width="553" alt="image" src="https://github.com/user-attachments/assets/c1ad860b-0821-4d24-9400-3658f50e130a" /><br>
13. Tampilan Setelah melakukan perubahan dengan menekan button edit.<br>
    <img width="553" alt="13" src="https://github.com/user-attachments/assets/08251001-06d7-46a3-8a70-44e8500a395f" /><br>
    - Dilanjutkan menekan konfimasi "yes" lalu "Ok", maka data akan terupdate otomatis pada tabel.<br>
      <img width="553" alt="13 1" src="https://github.com/user-attachments/assets/e081f1ba-3b47-4cb4-9004-de485ce26e88" /><br>
14. Tampilan Setelah menekan button hapus.<br>
    <img width="552" alt="14" src="https://github.com/user-attachments/assets/dddf62e4-efb1-45f0-ac8d-1cf72a0aae45" /><br>
    -Dilanjutkan menekan konfimasi "yes" lalu "Ok", maka data akan terhapus pada tabel.<br> 
      <img width="556" alt="14 1" src="https://github.com/user-attachments/assets/c019a8b7-ce2e-4d84-900c-fc1ce66a866a" /><br>
15. Tampilan melakukan pencarian.<br>
    <img width="548" alt="image" src="https://github.com/user-attachments/assets/73541762-5693-457c-a3ff-81c2cba59111" /><br>
16. Tampilan setelah menekan button Transaksi Absen.<br>
    <img width="574" alt="image" src="https://github.com/user-attachments/assets/c36f2038-53b2-414a-9b78-2469022b7b25" /><br>
17. Tampilan setelah menekan button tambah tetapi masih ada kolom inputan yang belum terisi.<br>
    <img width="569" alt="image" src="https://github.com/user-attachments/assets/8ce8dd80-19a5-43f4-a53e-a18e3572a907" /><br>
18. Tampilan setelah menekan button tambah dengan semua inputan sudah terisi, dan lanjutkan menekan button ok, maka data akan masuk ke tabel.<br>
    <img width="570" alt="image" src="https://github.com/user-attachments/assets/218c4057-5074-49fc-aeb8-a9c92a9fad81" /><br>
19. Tampilan Setelah melakukan perubahan dengan menekan button edit.<br>
    <img width="569" alt="19" src="https://github.com/user-attachments/assets/44a809fa-b1eb-4d50-aa51-09a111250a87" /><br>
    - Dilanjutkan menekan konfimasi "yes" lalu "Ok", maka data akan terupdate otomatis pada tabel.<br>
    <img width="572" alt="19 1" src="https://github.com/user-attachments/assets/dfba8d3e-e067-4755-9bd1-1d233fb9f326" /><br>
20. Tampilan Setelah menekan button hapus.<br>
    <img width="572" alt="20" src="https://github.com/user-attachments/assets/25eb65a2-c960-4cbc-a572-591146a11372" /><br>
    - Dilanjutkan menekan konfimasi "yes" lalu "Ok", maka data akan terhapus pada tabel.<br>
    <img width="571" alt="20 1" src="https://github.com/user-attachments/assets/b39343d8-f2e6-421b-9c65-7526e8df3650" /><br>
21. Tampilan melakukan pencarian.<br>
    <img width="572" alt="image" src="https://github.com/user-attachments/assets/ceda7cc6-f724-457d-b733-9b0399e43cf0" /><br>
22. Tampilan setelah menekan button Laporan.<br>
    <img width="587" alt="image" src="https://github.com/user-attachments/assets/8652977a-ead8-4a4b-a84e-291244cc51fc" /><br>
23. Tampilan setelah memilih periode bulan dan tahun, dilanjutkan menekan button "Periksa Laporan Absensi Bulanan".<br>
    <img width="586" alt="image" src="https://github.com/user-attachments/assets/a768f2ce-9be4-4a44-a649-a9baeaf450fc" /><br>
    <img width="586" alt="image" src="https://github.com/user-attachments/assets/76371fcc-e0b1-4629-96a4-13ae7e8a170d" /><br>
24. Tampilan setelah menekan button Reset.<br> 
    <img width="585" alt="image" src="https://github.com/user-attachments/assets/23b43057-4bd5-4354-960e-8b7669edddcb" /><br>
25. Tampilan setelah menekan button "Laporan Pegawai dan Gaji".<br>
    <img width="584" alt="image" src="https://github.com/user-attachments/assets/387302f6-cdb8-45ff-a2c3-11e2ce1d090d" /><br>
    <img width="586" alt="image" src="https://github.com/user-attachments/assets/c8463b5f-0ed8-483f-bec2-88c30ee220ce" /><br>
