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
    - Terdapat button Simpan Data untuk melakukan simpan data yang ada pada tabel dengan format CSV.
    - Terdapat button untuk kembali ke menu utama.
- Form Master Jabatan
    - Ketika pengguna menekan Buttun Master Jabatan maka akan masuk ke form jabatan.
    - Terdapat inputan nama jabatan dan gaji pokok yg hanya dapat di isi dengan angka.
    - Ada button tambah yang mana ketika di tekan maka semua inputan harus terisi semua, jika tidak maka akan muncul sebuah peringatan. Setelah inputan terisi semua lalu menekan button tambah maka muncul pesan sukses, dan segala inputan akan masuk ke tabel, dan kolom inputan akan otomatis kosong.
    - Ada button edit untuk melakukan perubahan data, dengan cara menekan salah satu data yang ingin dirubah pada tabel terlebih dahulu, data akan masuk kembali ke inputan dan lalukan perubahan, muncul juga sebuah konfirmasi.
    - Ada button hapus untuk menghapus data, dengan cara menekan salah satu data yang ada pada tabel terlebih dahulu, muncul juga sebuah konfirmasi.
    - Ada button bersih untuk membersihkan semua kolom inputan.
    - Terdapat inputan untuk mecari jabatan berdasarkan nama jabatan, dengan cara langsung saja menginputkan nama jabatan yang akan dicari maka langsung tampil pada tabel.
    - Terdapat satu tabel untuk menampung segala inputan.
    - Terdapat button Simpan Data untuk melakukan simpan data yang ada pada tabel dengan format CSV.
    - Terdapat button untuk kembali ke menu utama.
- Form Transaksi Absensi
    - Ketika pengguna menekan Buttun Transaksi Absen maka akan masuk ke form absensi.
    - Terdapat inputan pilih pegawai yang dapat dipilih sesuai yang telah di inputkan pada form pegawai, inputan tanggal yang dapat langsung dipilih, dan terdapat inputan status kehadiran yang dapat dipilih (Hadir, Izin, Sakit).
    - Ada button tambah yang mana ketika di tekan maka semua inputan harus terisi semua, jika tidak maka akan muncul sebuah peringatan. Setelah inputan terisi semua lalu menekan button tambah maka muncul pesan sukses, dan segala inputan akan masuk ke tabel, dan kolom inputan akan otomatis kosong.
    - Ada button edit untuk melakukan perubahan data, dengan cara menekan salah satu data yang ingin dirubah pada tabel terlebih dahulu, data akan masuk kembali ke inputan dan lalukan perubahan muncul juga sebuah konfirmasi.
    - Ada button hapus untuk menghapus data, dengan cara menekan salah satu data yang ada pada tabel terlebih dahulu, muncul juga sebuah konfirmasi.
    - Ada button bersih untuk membersihkan semua kolom inputan.
    - Terdapat inputan untuk mecari pegawai berdasarkan nama pegawai yang ada pada tabel form absensi, dengan cara langsung saja menginputkan nama pegawai yang akan dicari maka langsung tampil pada tabel.
    - Terdapat satu tabel untuk menampung segala inputan.
    - Terdapat button Simpan Data untuk melakukan simpan data yang ada pada tabel dengan format CSV.
    - Terdapat button untuk kembali ke menu utama.
- Form Laporan
    - Ketika pengguna menekan Button Laporan maka akan masuk ke form laporan.
    - Terdapat panel absensi yang mana didalamnya ada inputan bulan yang dapat dipilih langsung dan inputan tahun yang dapat dipilih langsung juga.
    - Ada button Periksa Laporan Absensi Bulanan, ketika ditekan maka akan menampilkan id pegawai, nama, total kehadiran, total izin, dan total sakit pada tabel. Ketika button di tekan tetapi inputan masih kosong maka akan menampilakn sebuah pesan.
    - Terdapat panel pegawai dan gaji, yang mana didalamnya ada button Laporan Pegawai dan Gaji, Ketika ditekan maka akan menampilkan Nama pegawai, Nama jabatan, dan gaji pokok pada tabel.
    - Ada satu tabel untuk menampilkan segala informasi ketika button Periksa Laporan Absensi Bulanan atau button Laporan Pegawai dan Gaji ditekan.
    - Ada button Reset unutuk membersihkan inputan dan tabel. Juga menampilkan pesan berhasil melakukan reset setelah menekannya.
    - Terdapat button Simpan Data untuk melakukan simpan data yang ada pada tabel dengan format CSV.
    - Ada button untuk kembali ke menu utama.
- Pada aplikasi ini, setiap perubahan data yang dilakukan pada form pegawai, form jabatan, atau form absensi akan langsung terupdate secara otomatis pada tabel terkait. Misalnya, jika ada perubahan pada data pegawai seperti nama atau jabatan, maka perubahan tersebut akan segera terlihat di semua form yang menggunakan data tersebut, termasuk laporan absensi bulanan dan laporan pegawai dan gaji.
